package com.javajee.ws.tsexample1;

import java.util.Date;

import javax.jws.WebService;

@WebService(endpointInterface = "com.javajee.ws.tsexample1.TimeService")
public class TimeServiceImpl implements TimeService {

	@Override
	public String getTimeFromServer() {
		return new Date().toString();
	}

}
