package com.cxf.soap.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Operations {
	@WebMethod
	public int add(int a,int b);
	@WebMethod
	public int sub(int a,int b);
}
