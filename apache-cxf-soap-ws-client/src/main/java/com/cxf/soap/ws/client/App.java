package com.cxf.soap.ws.client;

import com.cxf.soap.ws.Operations;
import com.cxf.soap.ws.OperationsImplService;

public class App {

	public static void main(String[] args) {
		OperationsImplService operationsimplService = new OperationsImplService();
		Operations operations = operationsimplService.getOperationsImplPort();
		int add = operations.add(10, 30);
		System.out.println("add: "+add);
		int sub = operations.sub(50, 10);
		System.out.println("sub: "+sub);

	}

}
