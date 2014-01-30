package com.javajee.ws.wsimportex;

import javax.xml.ws.Endpoint;

public class EmployeeServicePublisher
{
    public static void main(String[] argmentArray) {
        Endpoint endpoint = Endpoint.create(new EmployeeServiceImpl());
        endpoint.publish("http://127.0.0.1:8888/ex4");
    }
}
