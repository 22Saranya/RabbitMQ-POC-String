package com.stackroute.service;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.annotation.RabbitListenerConfigurer;
import org.springframework.amqp.rabbit.listener.RabbitListenerEndpointRegistrar;
import org.springframework.stereotype.Component;



@Component

public class RabbitMqServiceConsumer implements RabbitListenerConfigurer {
    @RabbitListener(queues = "${javainuse.rabbitmq.queue}")


    @RabbitHandler
    public void recievedMessage(String msg) {
        System.out.println("Recieved Message From RabbitMQ: " + msg);
    }

    @Override
    public void configureRabbitListeners(RabbitListenerEndpointRegistrar rabbitListenerEndpointRegistrar) {

    }
}
