package jtraining.test.collections;

import jtraining.common.collections.Payload;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class QueueTests extends BaseTest {

    /**
     * Queue
     */
    @Test
    public void DequeTest(){
        var expected = 10;
        ArrayDeque<Payload> arrayDeque = new ArrayDeque<>();

        for(var payload : createPayloads(expected))
            arrayDeque.add(payload);

        var item = arrayDeque.pop();
        arrayDeque.push(item);

        Assert.assertEquals(expected, arrayDeque.size());
    }

    /**
     * PriorityQueue dequeue elements based on priority defined in customcomparator
     */
    @Test
    public void PriorityQueueTest(){
        var expected = 10;
        PriorityQueue<Payload> priorityQueue = new PriorityQueue<>(new CustomComparator());

        for(var payload : createPayloads(expected))
            priorityQueue.add(payload);

        while(true){
            var item = priorityQueue.poll();
            if(item == null) break;
            System.out.println("Dequeing :" + item.getEmail());
        }

        Assert.assertEquals(0, priorityQueue.size());
    }

    static class CustomComparator implements Comparator<Payload> {
        @Override
        public int compare(Payload payload1, Payload payload2) {
            return -1;
        }
    }
}
