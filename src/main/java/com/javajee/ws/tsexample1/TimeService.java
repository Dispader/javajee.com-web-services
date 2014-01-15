package com.javajee.ws.tsexample1;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface TimeService {
	@WebMethod
	String getTimeFromServer();
}
