
package com.javajee.ws.wsimportex.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.4-b01-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "EmployeeServiceImplService", targetNamespace = "http://wsimportex.ws.javajee.com/", wsdlLocation = "file:/home/jake/Development/git/javajee.com-web-services/src/main/resources/ex4.wsdl")
public class EmployeeServiceImplService
    extends Service
{

    private final static URL EMPLOYEESERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.javajee.ws.wsimportex.client.EmployeeServiceImplService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.javajee.ws.wsimportex.client.EmployeeServiceImplService.class.getResource(".");
            url = new URL(baseUrl, "file:/home/jake/Development/git/javajee.com-web-services/src/main/resources/ex4.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/home/jake/Development/git/javajee.com-web-services/src/main/resources/ex4.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        EMPLOYEESERVICEIMPLSERVICE_WSDL_LOCATION = url;
    }

    public EmployeeServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EmployeeServiceImplService() {
        super(EMPLOYEESERVICEIMPLSERVICE_WSDL_LOCATION, new QName("http://wsimportex.ws.javajee.com/", "EmployeeServiceImplService"));
    }

    /**
     * 
     * @return
     *     returns EmployeeService
     */
    @WebEndpoint(name = "EmployeeServiceImplPort")
    public EmployeeService getEmployeeServiceImplPort() {
        return super.getPort(new QName("http://wsimportex.ws.javajee.com/", "EmployeeServiceImplPort"), EmployeeService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EmployeeService
     */
    @WebEndpoint(name = "EmployeeServiceImplPort")
    public EmployeeService getEmployeeServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://wsimportex.ws.javajee.com/", "EmployeeServiceImplPort"), EmployeeService.class, features);
    }

}