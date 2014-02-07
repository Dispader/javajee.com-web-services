package com.javajee.ws.xsdex;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.javajee.ws.xsdex.generated.HelloType;

public class JAXBUnmarshallingExample
{
    public static void main(String[] argument) throws JAXBException {
        
        // Obtain an unmarhshaller.
        JAXBContext jaxbContext = JAXBContext.newInstance("com.javajee.ws.xsdex.generated");
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        
        // Unmarshall.
        @SuppressWarnings("unchecked")
        JAXBElement<HelloType> helloElement = (JAXBElement<HelloType>)unmarshaller.unmarshal(new File("src/main/resources/hello.xml"));
        
        // Extract the data (as a very simple processing example).
        HelloType hello = helloElement.getValue();
        String greeting = hello.getGreeting();
        String title = hello.getName().getTitle().value();
        String name = hello.getName().getValue();
        
        // Print some results to stdout.
        System.out.println("output: " + greeting + " " + title + " " + name);
    }
}
