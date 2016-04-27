package com.app.data;

import com.app.model.Message;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by rquispe on 4/27/16.
 */
public class DataBaseClass {
	private static Map<Long, Message> messages = new HashMap<>();

	public DataBaseClass() {
		messages.put(1l, new Message(1, "Hello world", "rquispe"));
		messages.put(2l, new Message(2, "Hello jersey", "dalvarez"));
		messages.put(3l, new Message(3, "Hello java", "jrodriguez"));
		messages.put(4l, new Message(4, "Hello tomcat", "amontoya"));
	}

	public static List<Message> getMessages() {
		return new ArrayList<Message>(messages.values());
	}

	public static Message getMessage(long messageId) {
		return messages.get(messageId);
	}
}
