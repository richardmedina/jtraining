package jtraining.test.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListTests {

    private void printList(List list){
        for(int i = 0; i < list.size(); i++){
            var item = list.get(i);
            System.out.println("List[" + i +"](" + item.getClass() + "): " + item);
        }
    }

    @Test
    public void ArrayListTest_printItems(){
        ArrayList arrayList = new ArrayList();
        arrayList.add("Hello");
        arrayList.add(10);
        arrayList.add("World!");

        printList(arrayList);
    }

}
