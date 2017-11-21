
package com.ibk.proyecto.webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "fax", targetNamespace = "http://www.webserviceX.NET", wsdlLocation = "http://www.webservicex.net/fax.asmx?WSDL")
public class Fax
    extends Service
{

    private final static URL FAX_WSDL_LOCATION;
    private final static WebServiceException FAX_EXCEPTION;
    private final static QName FAX_QNAME = new QName("http://www.webserviceX.NET", "fax");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.webservicex.net/fax.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        FAX_WSDL_LOCATION = url;
        FAX_EXCEPTION = e;
    }

    public Fax() {
        super(__getWsdlLocation(), FAX_QNAME);
    }

    public Fax(WebServiceFeature... features) {
        super(__getWsdlLocation(), FAX_QNAME, features);
    }

    public Fax(URL wsdlLocation) {
        super(wsdlLocation, FAX_QNAME);
    }

    public Fax(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, FAX_QNAME, features);
    }

    public Fax(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Fax(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns FaxSoap
     */
    @WebEndpoint(name = "faxSoap")
    public FaxSoap getFaxSoap() {
        return super.getPort(new QName("http://www.webserviceX.NET", "faxSoap"), FaxSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FaxSoap
     */
    @WebEndpoint(name = "faxSoap")
    public FaxSoap getFaxSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webserviceX.NET", "faxSoap"), FaxSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (FAX_EXCEPTION!= null) {
            throw FAX_EXCEPTION;
        }
        return FAX_WSDL_LOCATION;
    }

}