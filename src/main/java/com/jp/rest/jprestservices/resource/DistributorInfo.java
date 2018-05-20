package com.jp.rest.jprestservices.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.jp.rest.jprestservices.DistributorInfoDAO;

@Path("/dist")
public class DistributorInfo {
	
	@GET
	@Path("/{emailid}")
	@Produces(MediaType.TEXT_PLAIN)
	public String emailExists(@PathParam("emailid") String emailid) {	
		System.out.println("Entered  DistributorInfo.emailExists emailid= " + emailid);
		return DistributorInfoDAO.emailExists(emailid);		
	}
	
}
