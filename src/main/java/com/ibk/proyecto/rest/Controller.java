package com.ibk.proyecto.rest;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibk.proyecto.service.ClientSoapService;
import com.ibk.proyecto.webservice.FaxSoap;

@Component
@Path("/")
public class Controller {

	@Autowired
	ClientSoapService clienteSoap;
		
	@Path("/{valor}")
	@GET
	public String metodo1(@PathParam("valor") String valor , @HeaderParam("user-agent") String userAgent) {
						
		return valor+userAgent+clienteSoap.mensajeEnviado();
	}
	
	
		

}
