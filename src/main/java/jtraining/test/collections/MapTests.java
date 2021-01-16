package jtraining.test.collections;

import jtraining.common.collections.Payload;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class MapTests extends BaseTest {

    /*
     * HashMaps allow one null key and N null values.
     * Not synchronized
     */
    @Test
    public void HashMapTest(){
        var expected = 10;
        HashMap<String, Payload> hashMap = new HashMap<>();

        for(var payload : createPayloads(expected))
            hashMap.put(payload.getEmail(), payload);

        hashMap.put(null, null);

        Assert.assertEquals(expected + 1, hashMap.size());
    }

    /**
     * Hashtable does not accept null keys or values
     * Synchronized
     */
    @Test
    public void HashTableTest(){
        var expected = 10;
        Hashtable<String, Payload> hashTable = new Hashtable<>();

        for(var payload : createPayloads(expected))
            hashTable.put(payload.getEmail(), payload);

        for(var payload : createPayloads(expected))
            hashTable.put(payload.getEmail(), payload);

        hashTable.put("Richard", new Payload());

        Assert.assertEquals(expected + 1, hashTable.size());
    }

    /**
     * Ordered by key
     */
    @Test
    public void TreeMapTest(){
        var expected = 10;
        TreeMap<String, Payload> treeMap = new TreeMap<>();

        for(var payload : createPayloads(expected))
            treeMap.put(payload.getEmail(), payload);

        Assert.assertEquals(expected, treeMap.size());
    }

    /**
     * Preserves the insertion order
     */
    @Test
    public void LinkedHashMapTest(){
        var expected = 10;
        LinkedHashMap<String, Payload> linkedHashMap = new LinkedHashMap<>();

        for(var payload : createPayloads(expected))
            linkedHashMap.put(payload.getEmail(), payload);



        Assert.assertEquals(expected, linkedHashMap.size());

    }
}
