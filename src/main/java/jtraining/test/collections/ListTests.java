package jtraining.test.collections;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ListTests {

    private void printList(List list) {
        printList(list, null);
    }

    private void printList(List list, String title){
        if(title != null){
            System.out.println("== " + title + " ==");
        }
        for(int i = 0; i < list.size(); i++){
            var item = list.get(i);
            System.out.println("List[" + i +"](" + item.getClass() + "): " + item);
        }
    }

    /*
    * Test ArrayList Print
    * */
    @Test
    public void ArrayListTest_print(){
        ArrayList arrayList = new ArrayList();
        arrayList.add("Hello");
        arrayList.add(10);
        arrayList.add("World!");

        printList(arrayList);
    }

    /*
    * Test ArrayList Generic Print
    * */
    @Test
    public void ArrayListTest_genericPrint(){
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        printList(stringList, "stringList");

        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        printList(integerList, "integerList");
    }

    @Test
    public void CompareValues(){
        // String:interns
        String string1 = "Hello";
        String string2 = "Hello";

        System.out.println(string1 + " == " + string2 + ": " + (string1 == string2));
        System.out.println(string1 + " equals " + string2 + ": " + string1.equals(string2));
    }

    @Test
    public void LinkedListTest(){
        var expected = 2;
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Hello");
        linkedList.add("World");

        var item = linkedList.getFirst();
        System.out.println("item: " + item);

        Assert.assertEquals(expected, linkedList.size());
    }

    /* Obsoletes
    @Test
    public void VectorTest(){

    }

    @Test
    public void CopyOnWriteArrayListTest(){

    }
    */
}
