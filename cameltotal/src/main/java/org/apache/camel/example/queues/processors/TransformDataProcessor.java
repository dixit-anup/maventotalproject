package org.apache.camel.example.queues.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 * Created by dmitry.bilyk on 3/12/14.
 */
public class TransformDataProcessor implements Processor{
    @Override
    public void process(Exchange exchange) throws Exception {
//        System.out.println(exchange.getIn());
        exchange.getIn().setBody(exchange.getIn().getBody(String.class) + " - transformed!");
    }
}
