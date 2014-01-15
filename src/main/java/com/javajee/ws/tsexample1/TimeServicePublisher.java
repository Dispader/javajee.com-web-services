package com.javajee.ws.tsexample1;

import javax.xml.ws.Endpoint;

public class TimeServicePublisher {

	public static void main(String[] args) {
		Endpoint endpoint = Endpoint.create(new TimeServiceImpl());
		endpoint.publish("http://127.0.0.1:8888/ts");
	}

}