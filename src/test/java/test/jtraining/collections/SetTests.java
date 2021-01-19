package test.jtraining.collections;

import jtraining.common.collections.Payload;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
 * Sets: unsorted collection
 */
public class SetTests extends BaseTest {

    @Test
    public void HashSetTest(){
        var expected = 10;
        HashSet<Payload> hashSet = new HashSet<>();
        for(var payload : createPayloads(expected))
            hashSet.add(payload);


        Assert.assertEquals(expected, hashSet.size());
    }

    @Test
    public void LinkedHashSetTest(){
        var expected = 10;
        LinkedHashSet<Payload> linkedHashSet = new LinkedHashSet<>();
        for(var payload : createPayloads(expected))
            linkedHashSet.add(payload);

        Assert.assertEquals(expected, linkedHashSet.size());
    }
}
