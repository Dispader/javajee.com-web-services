
package com.javajee.ws.wsimportex.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.javajee.ws.wsimportex package. 
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

    private final static QName _FindEmployeeResponse_QNAME = new QName("http://wsimportex.ws.javajee.com/", "findEmployeeResponse");
    private final static QName _FindEmployee_QNAME = new QName("http://wsimportex.ws.javajee.com/", "findEmployee");
    private final static QName _FindEmployeesResponse_QNAME = new QName("http://wsimportex.ws.javajee.com/", "findEmployeesResponse");
    private final static QName _FindAllEmployeesResponse_QNAME = new QName("http://wsimportex.ws.javajee.com/", "findAllEmployeesResponse");
    private final static QName _FindEmployees_QNAME = new QName("http://wsimportex.ws.javajee.com/", "findEmployees");
    private final static QName _FindAllEmployees_QNAME = new QName("http://wsimportex.ws.javajee.com/", "findAllEmployees");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.javajee.ws.wsimportex
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindAllEmployees }
     * 
     */
    public FindAllEmployees createFindAllEmployees() {
        return new FindAllEmployees();
    }

    /**
     * Create an instance of {@link FindEmployeesResponse }
     * 
     */
    public FindEmployeesResponse createFindEmployeesResponse() {
        return new FindEmployeesResponse();
    }

    /**
     * Create an instance of {@link FindEmployeeResponse }
     * 
     */
    public FindEmployeeResponse createFindEmployeeResponse() {
        return new FindEmployeeResponse();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link FindAllEmployeesResponse }
     * 
     */
    public FindAllEmployeesResponse createFindAllEmployeesResponse() {
        return new FindAllEmployeesResponse();
    }

    /**
     * Create an instance of {@link FindEmployees }
     * 
     */
    public FindEmployees createFindEmployees() {
        return new FindEmployees();
    }

    /**
     * Create an instance of {@link FindEmployee }
     * 
     */
    public FindEmployee createFindEmployee() {
        return new FindEmployee();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsimportex.ws.javajee.com/", name = "findEmployeeResponse")
    public JAXBElement<FindEmployeeResponse> createFindEmployeeResponse(FindEmployeeResponse value) {
        return new JAXBElement<FindEmployeeResponse>(_FindEmployeeResponse_QNAME, FindEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsimportex.ws.javajee.com/", name = "findEmployee")
    public JAXBElement<FindEmployee> createFindEmployee(FindEmployee value) {
        return new JAXBElement<FindEmployee>(_FindEmployee_QNAME, FindEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindEmployeesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsimportex.ws.javajee.com/", name = "findEmployeesResponse")
    public JAXBElement<FindEmployeesResponse> createFindEmployeesResponse(FindEmployeesResponse value) {
        return new JAXBElement<FindEmployeesResponse>(_FindEmployeesResponse_QNAME, FindEmployeesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllEmployeesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsimportex.ws.javajee.com/", name = "findAllEmployeesResponse")
    public JAXBElement<FindAllEmployeesResponse> createFindAllEmployeesResponse(FindAllEmployeesResponse value) {
        return new JAXBElement<FindAllEmployeesResponse>(_FindAllEmployeesResponse_QNAME, FindAllEmployeesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindEmployees }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsimportex.ws.javajee.com/", name = "findEmployees")
    public JAXBElement<FindEmployees> createFindEmployees(FindEmployees value) {
        return new JAXBElement<FindEmployees>(_FindEmployees_QNAME, FindEmployees.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllEmployees }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsimportex.ws.javajee.com/", name = "findAllEmployees")
    public JAXBElement<FindAllEmployees> createFindAllEmployees(FindAllEmployees value) {
        return new JAXBElement<FindAllEmployees>(_FindAllEmployees_QNAME, FindAllEmployees.class, null, value);
    }

}
