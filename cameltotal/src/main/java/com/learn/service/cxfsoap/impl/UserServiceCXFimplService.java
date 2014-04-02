
/*
 * 
 */

package com.learn.service.cxfsoap.impl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import com.learn.service.cxfsoap.UserServiceCXF;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.2.3
 * Fri Mar 28 18:35:24 EET 2014
 * Generated source version: 2.2.3
 * 
 */


@WebServiceClient(name = "UserServiceCXFimplService", 
                  wsdlLocation = "http://localhost:8080/webapplication/cxfsoap/UserService?wsdl",
                  targetNamespace = "http://impl.cxfsoap.service.learn.com/")
public class UserServiceCXFimplService extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://impl.cxfsoap.service.learn.com/", "UserServiceCXFimplService");
    public final static QName UserServiceCXFimplPort = new QName("http://impl.cxfsoap.service.learn.com/", "UserServiceCXFimplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/webapplication/cxfsoap/UserService?wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from http://localhost:8080/webapplication/cxfsoap/UserService?wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public UserServiceCXFimplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public UserServiceCXFimplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UserServiceCXFimplService() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     * 
     * @return
     *     returns UserServiceCXF
     */
    @WebEndpoint(name = "UserServiceCXFimplPort")
    public UserServiceCXF getUserServiceCXFimplPort() {
        return super.getPort(UserServiceCXFimplPort, UserServiceCXF.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserServiceCXF
     */
    @WebEndpoint(name = "UserServiceCXFimplPort")
    public UserServiceCXF getUserServiceCXFimplPort(WebServiceFeature... features) {
        return super.getPort(UserServiceCXFimplPort, UserServiceCXF.class, features);
    }

}
