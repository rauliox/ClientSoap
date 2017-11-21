package com.ibk.proyecto.service;

import java.net.URL;

import javax.xml.namespace.QName;

import org.springframework.stereotype.Service;

import com.ibk.proyecto.webservice.Fax;
import com.ibk.proyecto.webservice.FaxSoap;

@Service
public class ClientSoapService {
	
//	FaxSoap faxSoap =  new Fax().getFaxSoap();
	
	
	// URL wsdl = Resources.getResource(path);"http://www.webservicex.net/fax.asmx?WSDL"
	
	
	
	// URL wsdlURL = new URL("http://www.webservicex.net/fax.asmx?WSDL");
	//javax.xml.ws.Service service = javax.xml.ws.Service.create(wsdlURL,);
	//FaxSoap faxSoap = service.getPort(FaxSoap.class);
	public String mensajeEnviado(){
		
		String wsdlURL = "http://www.webservicex.net/fax.asmx?WSDL";
		  String namespace = "http://www.webserviceX.NET";
		//  String serviceName = "SomeService";
		  QName serviceQN = new QName(namespace);

		  javax.xml.ws.Service service  = javax.xml.ws.Service.create(serviceQN);
		  FaxSoap faxSoap = service.getPort(FaxSoap.class);
		  faxSoap.sendTextToFax("raul@gola.ocm", "dsad","Dsds","dsdsd","dsds");
		//return faxSoap.sendTextToFax("raul@gola.ocm", "dsad","Dsds","dsdsd","dsds");
		
		return "hola";
	}
	

}
