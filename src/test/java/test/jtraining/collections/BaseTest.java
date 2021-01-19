package test.jtraining.collections;

import jtraining.common.collections.Payload;

public class BaseTest {
    protected Payload[] createPayloads(int n){
        Payload[] payloads = new Payload[n];
        for(int i = 0; i < n; i ++)
            payloads[i] = new Payload("Email" + i + "@email.com", "Password" + i);

        return payloads;
    }
}
