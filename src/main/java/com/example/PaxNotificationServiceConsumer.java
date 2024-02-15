package com.example;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Incoming;

@ApplicationScoped
public class PaxNotificationServiceConsumer {

    @Incoming("pax-topic")
    public void consume(String message) {
        // process your price.

        // System.out.println("Got a message from kafka ::" + order.getId() + " -- " + order.getItem());

        System.out.println("Got a message from kafka ::" +message);
    }

}
