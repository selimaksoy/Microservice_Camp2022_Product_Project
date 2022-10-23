package com.microservicecamp.notificationservice;

import com.microservicecamp.notificationservice.event.OrderPlacedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
@EnableEurekaClient
public class NotificationServiceApplication {

	Logger logger= LoggerFactory.getLogger(NotificationServiceApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(NotificationServiceApplication.class, args);
	}

	@KafkaListener(topics = "notificationTopic")
	public void	handleNotification(OrderPlacedEvent orderPlacedEvent){
          // Send out email notification
		logger.info("Received Notification for Order - {}", orderPlacedEvent.getOrderId());
	}

}
