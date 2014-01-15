package com.javajee.ws.tsexample1;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class TimeClient {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://127.0.0.1:8888/ts?wsdl");
		QName qName = new QName("http://tsexample1.ws.javajee.com/", "TimeServiceImplService");
		Service service = Service.create(url, qName);
		TimeService port = service.getPort(TimeService.class);
		System.out.println("current time: " + port.getTimeFromServer());
	}

}
