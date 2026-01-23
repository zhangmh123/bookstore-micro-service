package com.sivalabs.bookstore.orders.web.controllers;

import org.springframework.stereotype.Component;

@Component
public class MyMessageListener {

    //    @RabbitListener(queues = "${orders.new-orders-queue}")
    //    public void handleNewOrdersMessage(RabbitMQDemoController.Payload payload) {
    //        System.out.println("Received new order payload: " + payload.content());
    //    }
    //
    //    @RabbitListener(queues = "${orders.delivered-orders-queue}")
    //    public void handleDeliveredOrdersMessage(RabbitMQDemoController.Payload payload) {
    //        System.out.println("Received delivered order payload: " + payload.content());
    //    }
}
