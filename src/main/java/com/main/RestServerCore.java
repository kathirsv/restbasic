package com.main;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class RestServerCore
{
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response testMethod()
	{
		return Response.ok("hello world").build();
	}

}
