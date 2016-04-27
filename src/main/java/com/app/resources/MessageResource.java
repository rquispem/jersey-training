package com.app.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by rquispe on 4/27/16.
 */

@Path("/messages")
public class MessageResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessages() {
		return "MESSAGE";
	}
}
