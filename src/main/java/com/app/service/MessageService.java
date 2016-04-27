package com.app.service;

import com.app.model.Message;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rquispe on 4/27/16.
 */
public class MessageService {

	public List<Message> getAllMessages() {
		Message message1 = new Message(1L, "Hello world", "rquispe");
		Message message2 = new Message(2L, "Hello Jersey", "bryan");
		Message message3= new Message(3L, "Hello Java", "perez");
		List<Message> messages = new ArrayList<>();
		messages.add(message1);
		messages.add(message2);
		messages.add(message3);
		return messages;
	}
}
