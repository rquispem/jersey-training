package com.app.resources;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * Created by rquispe on 4/26/16.
 */
@Path("/")
public class Library {

	@Path("/books/{isbn}")
	public BookResource getBook(@PathParam("isbn") String isbn) {
		return new BookResource();
	}


}
