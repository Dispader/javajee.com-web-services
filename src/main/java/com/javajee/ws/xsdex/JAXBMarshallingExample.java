package com.javajee.ws.xsdex;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.javajee.ws.xsdex.generated.HelloType;
import com.javajee.ws.xsdex.generated.NameType;
import com.javajee.ws.xsdex.generated.ObjectFactory;
import com.javajee.ws.xsdex.generated.TitleType;

public class JAXBMarshallingExample
{
    public static void main(String[] argument) throws JAXBException {
        
        // Create an object factory.
        ObjectFactory helloObjectFactory = new ObjectFactory();
        
        // Create a (non-root) object tree from the factory.
        HelloType hello = helloObjectFactory.createHelloType();
        hello.setGreeting("Salutations");
        NameType name = helloObjectFactory.createNameType();
        TitleType title = TitleType.MR;
        name.setTitle(title);
        name.setValue("Gage");
        hello.setName(name);
        
        // Create the root XML object, and thus the document suitable for marshalling.
        JAXBElement<HelloType> helloElement = helloObjectFactory.createHello(hello);
        
        // Obtain a marhshaller.
        JAXBContext jaxbContext = JAXBContext.newInstance("com.javajee.ws.xsdex.generated");
        Marshaller marshaller = jaxbContext.createMarshaller();
        
        // Marshall to stdout
        marshaller.marshal(helloElement, System.out);
        
    }
}
