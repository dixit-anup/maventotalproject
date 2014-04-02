package com.learn.service.cxfsoap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-03-31T14:45:08.709+03:00
 * Generated source version: 2.7.10
 * 
 */
@WebService(targetNamespace = "http://cxfsoap.service.learn.com/", name = "UserServiceCXF")
@XmlSeeAlso({ObjectFactory.class})
public interface UserServiceCXF {

    @RequestWrapper(localName = "addUser", targetNamespace = "http://cxfsoap.service.learn.com/", className = "com.learn.service.cxfsoap.AddUser")
    @WebMethod
    @ResponseWrapper(localName = "addUserResponse", targetNamespace = "http://cxfsoap.service.learn.com/", className = "com.learn.service.cxfsoap.AddUserResponse")
    public void addUser(
        @WebParam(name = "arg0", targetNamespace = "")
        com.learn.service.cxfsoap.User arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getAllUsers", targetNamespace = "http://cxfsoap.service.learn.com/", className = "com.learn.service.cxfsoap.GetAllUsers")
    @WebMethod
    @ResponseWrapper(localName = "getAllUsersResponse", targetNamespace = "http://cxfsoap.service.learn.com/", className = "com.learn.service.cxfsoap.GetAllUsersResponse")
    public java.util.List<com.learn.service.cxfsoap.User> getAllUsers();
}