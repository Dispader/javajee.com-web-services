package com.javajee.ws.jaxb2;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Jaxb2UnmarshallingExample
{
    /**
     * note: This method does not execute from within an Eclipse environment, due to
     * https://bugs.eclipse.org/bugs/show_bug.cgi?id=411408
     * 
     * @param args arguements
     * @see https://stackoverflow.com/questions/17216339/unexpected-element-uri-local-element-expected-elements-are-link 
     */
    public static void main(String[] args) {
        
        // Create a JAXBContext object with JAXBContext’s static method newInstance(Class... classesToBeBound).
        JAXBContext jaxbContext = null;
        try {
            jaxbContext= JAXBContext.newInstance(HelloBinding.class);
            if ( jaxbContext == null ) { 
                throw new JAXBException("JAXB context was null");
            }
        } catch (JAXBException jaxbException) {
            System.err.println("could not create JAXB context: " + jaxbException.getMessage());
        }
        new File("/home/jake/Development/git/javajee.com-web-services/src/main/java/com/javajee/ws/jaxb2/hello.xmlj");
        
        // Use the JAXBContext object to create an UnMarshaller object.
        Unmarshaller unmarshaller = null;
        try {
            unmarshaller = jaxbContext.createUnmarshaller();
            if ( unmarshaller == null ) {
                throw new JAXBException("unmarshaller was null");
            }
        } catch (JAXBException jaxbException) {
            System.err.println("could not create JAXB unmarshaller: " + jaxbException.getMessage());
        }
        
        // Create an object of the annotated type representing root using the unmarshal method of Unmarshaller.
        HelloBinding helloBinding = null;
        File xmlFile = 
                new File("/home/jake/Development/git/javajee.com-web-services/src/main/java/com/javajee/ws/jaxb2/hello.xml");
//      System.out.println("file.exists: " + xmlFile.exists());
//      System.out.println("file.canRead: " + xmlFile.canRead());
        try {
            helloBinding = (HelloBinding)unmarshaller.unmarshal(xmlFile);
            if ( helloBinding == null ) {
                throw new JAXBException("binding object was null");
            }
        } catch (JAXBException jaxbException) {
            System.err.println("could not unmarshall object: " + jaxbException.getMessage());
            System.exit(1);
        }
        
        // Use appropriate getters of root object to get its attributes and children.
        System.out.format("%s %s", helloBinding.getGreeting(), helloBinding.getName());
    }
}
