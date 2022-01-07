package com.roma.study.tree;

public class BinaryTree implements CustomTree {
    Node root;

    public void put(Comparable key, Object value) {
        if (root == null) {
            root = new Node(key, value, null, null);
        } else {
            put(key, value, root);
        }
    }

    public void put(Comparable key, Object value, Node currentNode) {
        if (currentNode.key.compareTo(key) < 0) {
            if (currentNode.over == null) {
                currentNode.over = new Node(key, value, null, null);
            } else {
                put(key, value, currentNode.over);
            }
            return;
        }
        if (currentNode.key.compareTo(key) > 0) {
            if (currentNode.under == null) {
                currentNode.under = new Node(key, value, null, null);
            } else {
                put(key, value, currentNode.under);
            }
        } else {
            currentNode.value = value;
        }
    }

    public Object get(Comparable key) {
        return get(key, root);
    }

    private Object get(Comparable key, Node currentNode) {
        if (currentNode == null) {
            throw new RuntimeException(String.format("Element %s not found", key));
        }
        if (currentNode.key.compareTo(key) > 0) {
            return get(key, currentNode.under);
        }
        if (currentNode.key.compareTo(key) < 0) {
            return get(key, currentNode.over);
        } else {
            return currentNode.value;
        }
    }

    public void delete(Comparable key) {
        Node previousNode = findPreviousNode(key);
        Node overBranch;
        Node underBranch;
        Node toDelete = null;
        boolean over = true;
        if (previousNode.key.compareTo(key) == 0 && previousNode.under != null && previousNode.over == null) {
            root = previousNode.under;
            return;
        }
        if (previousNode.key.compareTo(key) == 0 && previousNode.over != null && previousNode.under == null) {
            root = previousNode.over;
            return;
        }
        if (previousNode.key.compareTo(key) == 0 && previousNode.under != null && previousNode.over != null) {
            root = previousNode.under;
            Node lastLeafOverRootBrunch = root;
            while (lastLeafOverRootBrunch.over != null) {
                lastLeafOverRootBrunch = lastLeafOverRootBrunch.over;
            }
            lastLeafOverRootBrunch.over = previousNode.over;
            return;
        }
        if (previousNode.over == null && previousNode.under.key.compareTo(key) == 0) {
            toDelete = previousNode.under;
        }
        if (previousNode.under == null && previousNode.over.key.compareTo(key) == 0) {
            toDelete = previousNode.over;
        }
        if (previousNode.key.compareTo(key) == 0) {
            toDelete = previousNode;
        }
        if (previousNode.over != null && previousNode.under != null && previousNode.under.key.compareTo(key) == 0) {
            toDelete = previousNode.under;
            over = false;
            if (toDelete.over == null && toDelete.under == null) {
                previousNode.under = null;
                return;
            }
        }
        if (previousNode.over != null && previousNode.under != null && previousNode.over.key.compareTo(key) == 0) {
            toDelete = previousNode.over;
            if (toDelete.over == null && toDelete.under == null) {
                previousNode.over = null;
                return;
            }
        }
        overBranch = toDelete.over;
        underBranch = toDelete.under;
        Node otherBrunch;
        if (over) {
            previousNode.over = underBranch;
            otherBrunch = overBranch;
        } else {
            previousNode.under = overBranch;
            otherBrunch = underBranch;
        }
        Node leafToInsertToOtherBranch = findParentNodeForKey(key, previousNode);
        if (leafToInsertToOtherBranch.key.compareTo(otherBrunch.key) > 0) {
            leafToInsertToOtherBranch.under = otherBrunch;
        } else {
            leafToInsertToOtherBranch.over = otherBrunch;
        }
        if (toDelete.under == null && toDelete.over == null) {
            previousNode.over = null;
            previousNode.under = null;
        }
        if (toDelete.under == null && toDelete.over != null) {
            previousNode.over = toDelete.over;
        }
        if (toDelete.over == null && toDelete.under != null) {
            previousNode.over = toDelete.under;
        }
    }

    public Node findPreviousNode(Comparable key) {
        return findPreviousNode(key, root);
    }

    private Node findPreviousNode(Comparable key, Node currentNode) {
        if (currentNode == null) {
            throw new RuntimeException(String.format("Element %s not found", key));
        }
        if (currentNode.key.compareTo(key) == 0) {
            return root;
        }
        if (currentNode.under != null && currentNode.under.key == key || currentNode.over != null && currentNode.over.key == key) {
            return currentNode;
        }
        if (currentNode.key.compareTo(key) > 0) {
            return findPreviousNode(key, currentNode.under);
        }
        if (currentNode.key.compareTo(key) < 0) {
            return findPreviousNode(key, currentNode.over);
        } else {
            return currentNode;
        }
    }

    private Node findParentNodeForKey(Comparable key, Node currentNode) {
        if (currentNode == null) {
            throw new RuntimeException(String.format("Element %s not found", key));
        }
        if (currentNode.key.compareTo(key) < 0 && currentNode.under == null) {
            return currentNode;
        }
        if (currentNode.key.compareTo(key) > 0 && currentNode.over == null) {
            return currentNode;
        }
        if (currentNode.key.compareTo(key) < 0) {
            return findParentNodeForKey(key, currentNode.over);
        }
        if (currentNode.key.compareTo(key) > 0) {
            return findParentNodeForKey(key, currentNode.under);
        } else {
            return currentNode;
        }
    }
}
