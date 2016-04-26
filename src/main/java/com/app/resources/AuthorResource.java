package com.app.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by rquispe on 4/26/16.
 */
@Path("/")  //this is optional in a subresource
public class AuthorResource {


	@GET
	public String getAuthor(){
		return "ruben quispe";
	}
}
