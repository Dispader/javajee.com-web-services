//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.31 at 02:19:03 PM CST 
//


package com.javajee.ws.xsdex.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.javajee.ws.xsdex.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Hello_QNAME = new QName("", "hello");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.javajee.ws.xsdex.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HelloType }
     * 
     */
    public HelloType createHelloType() {
        return new HelloType();
    }

    /**
     * Create an instance of {@link NameType }
     * 
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "hello")
    public JAXBElement<HelloType> createHello(HelloType value) {
        return new JAXBElement<HelloType>(_Hello_QNAME, HelloType.class, null, value);
    }

}
