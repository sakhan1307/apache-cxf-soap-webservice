package com.cxf.soap.ws;

import javax.jws.WebService;

@WebService(endpointInterface="com.cxf.soap.ws.Operations")
public class OperationsImpl implements Operations {

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		return a-b;
	}

}
