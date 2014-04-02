package com.learn.ws.cxf.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.3
 * Thu Mar 27 13:02:31 EET 2014
 * Generated source version: 2.2.3
 * 
 */
 
@WebService(targetNamespace = "http://service.cxfsoap.ws.learn.com/", name = "UserService")
@XmlSeeAlso({ObjectFactory.class})
public interface UserService {

    @RequestWrapper(localName = "addUser", targetNamespace = "http://service.cxfsoap.ws.learn.com/", className = "com.learn.ws.cxfsoap.service.AddUser")
    @ResponseWrapper(localName = "addUserResponse", targetNamespace = "http://service.cxfsoap.ws.learn.com/", className = "com.learn.ws.cxfsoap.service.AddUserResponse")
    @WebMethod
    public void addUser(
        @WebParam(name = "arg0", targetNamespace = "")
        com.learn.ws.cxf.service.User arg0
    );
}