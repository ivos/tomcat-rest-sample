package com.github.ivos.tcrest.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class RootResource {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getRoot() {
		return "<h1>REST API Root</h1><a href=\"projects/myProject/samples\">projects/myProject/samples</a>";
	}

}
