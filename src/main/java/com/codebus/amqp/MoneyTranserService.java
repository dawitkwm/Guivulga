package com.codebus.amqp;

import org.springframework.amqp.rabbit.core.RabbitTemplate;

import com.codebus.domain.Item;

public interface MoneyTranserService {
	public void publish(RabbitTemplate rabbitTemplate);
	public void listen(Item item);
}
