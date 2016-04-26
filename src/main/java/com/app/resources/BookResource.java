package com.app.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by rquispe on 4/26/16.
 */
@Path("books")
public class BookResource {

	@Produces(MediaType.TEXT_PLAIN)
	@GET
	public String getString() {
		return "Hello";
	}

	@Path("/author")
	public String getAuthor(){
		return "ruben quispe";
	}

}
