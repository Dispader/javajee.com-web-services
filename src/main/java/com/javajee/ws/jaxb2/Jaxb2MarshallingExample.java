package com.javajee.ws.jaxb2;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;

public class Jaxb2MarshallingExample
{
    public static void main(String[] args) {
        
        // Create an object of the annotated class and populate data.
        HelloBinding helloBinding = new HelloBinding();
        helloBinding.setGreeting("Well met");
        helloBinding.setName("Marie Curie");
        
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
        
        // Use the JAXBContext object to create a Marshaller object.
        Marshaller marshaller = null;
        try {
            marshaller = jaxbContext.createMarshaller();
            if ( marshaller == null ) {
                throw new JAXBException("marshaller was null");
            }
        } catch (JAXBException jaxbException) {
            System.err.println("could not create JAXB marshaller: " + jaxbException.getMessage());
        }
        try {
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        } catch (PropertyException propertyException) {
            System.err.println("could not set property for JAXB marshaller: " + propertyException.getMessage());
        }
        
        // Finally, call the marshal method passing the object of the annotated class representing root and an output
        // stream to print the result.
        try {
            marshaller.marshal(helloBinding, System.out);
        } catch (JAXBException jaxbException) {
            System.err.println("could not set property for JAXB marshaller: " + jaxbException.getMessage());
        }
    }
}
