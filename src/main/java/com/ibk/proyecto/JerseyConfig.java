package com.ibk.proyecto;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.ibk.proyecto.rest.Controller;

@Component
@ApplicationPath("/ruta")
public class JerseyConfig extends ResourceConfig {
	
	public JerseyConfig(){
		register(com.ibk.proyecto.rest.Controller.class);
		packages("com.ibk.proyecto");
		
	}
}
