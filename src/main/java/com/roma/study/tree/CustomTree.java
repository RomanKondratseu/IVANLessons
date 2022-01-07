package com.roma.study.tree;

public interface CustomTree {
    void put(Comparable key, Object value);

    Object get(Comparable key);

    void delete(Comparable key);
}
