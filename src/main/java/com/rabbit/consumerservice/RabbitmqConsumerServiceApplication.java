package com.rabbit.consumerservice;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableRabbit
@ComponentScan("com.rabbit")
public class RabbitmqConsumerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqConsumerServiceApplication.class, args);
	}
}
