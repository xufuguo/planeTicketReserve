package com.mps.iservice;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mps.model.Ticket;

@Path("/Service")
public interface Service {
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	@Path("/test")
	public String test();
	
	@POST
	@Produces({MediaType.APPLICATION_JSON})
	@Path("/getAirLines")
	public String getAirLines(String json);
	
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Path("/printTicket/{idcard}")
	public List<Ticket> printTicket(@PathParam("idcard")String idcard);
}
