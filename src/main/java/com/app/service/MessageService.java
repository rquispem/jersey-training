package com.app.service;

import com.app.data.DataBaseClass;
import com.app.model.Message;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by rquispe on 4/27/16.
 */
public class MessageService {
	Map<Long, Message> messagesMap = new HashMap<>();

	public List<Message> getAllMessages() {
		return DataBaseClass.getMessages();
	}

	public Message getMessage(long messageId) {
		return DataBaseClass.getMessage(messageId);
	}

	public Message addMessage(Message message) {
		message.setId(messagesMap.size() + 1);
		messagesMap.put(message.getId(), message);
		return message;
	}

	public Message updateMessage(Message message) {
		if(message.getId() <= 0) {
			return null;
		}
		messagesMap.put(message.getId(), message);
		return message;
	}

	public Message removeMessage(long id) {
		return messagesMap.remove(id);
	}
}
