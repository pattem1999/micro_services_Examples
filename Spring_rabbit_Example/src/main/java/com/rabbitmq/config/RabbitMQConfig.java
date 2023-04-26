package com.rabbitmq.config;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rabbitmq.client.ConnectionFactory;

@Configuration

public class RabbitMQConfig {

	/*
	 * private final ConnectionFactory connectionFactory;
	 * 
	 * @Bean public AmqpTemplate amqpTemplate() { RabbitTemplate rabbitTemplate =
	 * new RabbitTemplate(connectionFactory);
	 * rabbitTemplate.setMessageConverter(jacksonConverter()); return
	 * rabbitTemplate; }
	 * 
	 * @Bean public SimpleRabbitListenerContainerFactory
	 * simpleRabbitListenerContainerFactory() { SimpleRabbitListenerContainerFactory
	 * factory = new SimpleRabbitListenerContainerFactory();
	 * factory.setConnectionFactory(connectionFactory);
	 * factory.setMessageConverter(jacksonConverter()); return factory; }
	 * 
	 * @Bean public MessageConverter jacksonConverter() { MessageConverter
	 * jackson2JsonMessageConverter = new Jackson2JsonMessageConverter(); return
	 * jackson2JsonMessageConverter; }
	 */
}
