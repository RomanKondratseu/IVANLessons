package linkedlist.bidirectional;
import com.roma.study.linkedlist.bidirectional.BiDirectionalList;
import org.junit.Assert;
import org.junit.Test;

public class BidirctionalListTest {


    @Test
    public void shouldAddToTheCenter() {
        BiDirectionalList list = new BiDirectionalList();
        list.add("R");
        list.add("O");
        list.add("A");

        list.add(2,"M");

        Assert.assertEquals(list.size, 4);
        Assert.assertEquals(list.get(0),"R");
        Assert.assertEquals(list.get(1),"O");
        Assert.assertEquals(list.get(2),"M");
        Assert.assertEquals(list.get(3),"A");
    }

    @Test
    public void shouldAddToTheEndWhenNotEmpty (){
        BiDirectionalList list = new BiDirectionalList();
        list.add("R");
        list.add("A");

        Assert.assertEquals(list.size, 2);
        Assert.assertEquals(list.get(1),"A");
    }
    @Test
    public void shouldAddToBeforeCenter() {
        BiDirectionalList list = new BiDirectionalList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        list.add(1,"Element");

        Assert.assertEquals(list.size, 6);
        Assert.assertEquals(list.get(0),"1");
        Assert.assertEquals(list.get(1),"Element");
        Assert.assertEquals(list.get(2),"2");
        Assert.assertEquals(list.get(3),"3");
        Assert.assertEquals(list.get(4),"4");
        Assert.assertEquals(list.get(5),"5");
    }
    @Test
    public void shouldAddToAfterCenter() {
        BiDirectionalList list = new BiDirectionalList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        list.add(3,"Element");

        Assert.assertEquals(list.size, 6);
        Assert.assertEquals(list.get(0),"1");
        Assert.assertEquals(list.get(1),"2");
        Assert.assertEquals(list.get(2),"3");
        Assert.assertEquals(list.get(3),"Element");
        Assert.assertEquals(list.get(4),"4");
        Assert.assertEquals(list.get(5),"5");
    }
    @Test
    public void shouldAddToCenter() {
        BiDirectionalList list = new BiDirectionalList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        list.add(2,"Element");

        Assert.assertEquals(list.size, 6);
        Assert.assertEquals(list.get(0),"1");
        Assert.assertEquals(list.get(1),"2");
        Assert.assertEquals(list.get(2),"Element");
        Assert.assertEquals(list.get(3),"3");
        Assert.assertEquals(list.get(4),"4");
        Assert.assertEquals(list.get(5),"5");
    }


//    @Test
//    public void shouldAddToTheStart {
//
//        Assert.assertEquals(7, result);
//    }

}
