package com.codebus.amqp;

import org.springframework.amqp.rabbit.core.RabbitTemplate;

import com.codebus.domain.Item;

public class MoneyTranserServiceImpl implements MoneyTranserService {

	@Override
	public void publish(RabbitTemplate rabbitTemplate) {
		//create items
		Item item1 = null;
		Item item2 =  null;
		Item item3 =  null;
		Item item4 =  null;
		
		//send the items to the broker with a routing key of direct.item
		rabbitTemplate.convertAndSend("direct.item", item1);
		rabbitTemplate.convertAndSend("direct.item", item2);
		rabbitTemplate.convertAndSend("direct.item", item3);
		rabbitTemplate.convertAndSend("direct.item", item4);
	}

	@Override
	public void listen(Item item) {
		// TODO Auto-generated method stub
		
	}
}
