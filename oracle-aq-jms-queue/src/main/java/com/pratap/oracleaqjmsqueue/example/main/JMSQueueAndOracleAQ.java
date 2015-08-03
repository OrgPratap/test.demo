package com.pratap.oracleaqjmsqueue.example.main;

import java.sql.Connection;

import javax.jms.ConnectionFactory;


import oracle.jdbc.pool.OracleDataSource;
import oracle.jms.AQjmsFactory;

public class JMSQueueAndOracleAQ {
	
	private IDBManager dbManager;
	private Connection connection;
	private OracleDataSource oracleDataSource;
	
	public void sendMessage(){
		/*
		ConnectionFactory connectionFactory = AQjmsFactory.getQueueConnectionFactory(dataSource);
		JmsTemplate jmsTemplate = new JmsTemplate(connectionFactory);
		jmsTemplate.setExplicitQosEnabled(true);
		MessageCreator messageCreator = new MessageCreator() {
		        @Override
		        public Message createMessage(Session session) throws JMSException {
		            MapMessage message = session.createMapMessage();
		            // ... set some properties
		            message.setJMSPriority(priority);
		            return message;
		        }
		};
		jmsTemplate.setPriority(priority);
		jmsTemplate.send("priorityqueue", messageCreator);
		*/
	}

}
