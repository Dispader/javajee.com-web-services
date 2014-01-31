#[javajee.com](http://www.javajee.com/) - [Web Services and XML tutorial]()

This project supports a personal walk through of the [JavaJee.com](http://www.javajee.com/) [Web Services and XML tutorial](http://www.javajee.com/web-services).

##usage

###[bottom-up SOAP service using Endpoint Publisher](http://www.javajee.com/articles/writing-a-simple-soap-web-service-bottoms-up)

- `gradle compile`
- execute the `com.javajee.ws.tsexample1.TimeServicesPublisher` main method to start the endpoint listener
  - `http://127.0.0.1:8888/ts` to list services
- execute the `com.javajee.ws.tsexample1.TimeClient` main method to test a Web service consumer

###[deploying a bottoms-up Web service in Tomcat](http://www.javajee.com/articles/deploying-a-bottoms-up-web-service-in-tomcat)

The Gradle build for this project supports building a WAR file which can be deployed to a Tomcat instance, but this WAR file may also be tested with Gradle's Jetty test engine.

- `gradle jettyRun`
- point a Web browser at the displayed URL

###[wsimport](http://www.javajee.com/articles/jaxws-tools-wsimport-and-wsgen)

- `gradle wsimport`

###[Rich Data Types using wsimport](http://www.javajee.com/articles/creating-a-soap-web-service-with-rich-data-types-using-wsimport)

The Gradle definition to generate class files from the JAX-WS generated service WSDL has been commented out, and the service endpoint 
classes have been imported into the `com.javajee.ws.wsimportex.client` directory.

####execution

- `com.javajee.ws.wsimportex.EmployeeServicePublisher.main()`
- `com.javajee.ws.wsimportex.EmployeeClient.main()`

###[XSD mapping](http://www.javajee.com/articles/jaxb2-marshaling-and-unmarshaling-example-xsd-to-java-binding-hands-on)


Packages were generated using Eclipse's interface to XJC; however, Gradle can also handle this.

```Groovy
ant.xjc(destdir : '${jaxbDest}', removeOldOutput:'yes', extension:'true') {
  arg(line:'-Xequals -XhashCode -XtoString -Xcopyable')

  schema(dir:'src/main/schema', includes:'C.xsd')
  binding(dir:'src/main/schema', includes:'*.xjb)
}
```

####execution

- `com.javajee.ws.wsdex.JAXBMarshallingExample.main()`
- `com.javajee.ws.wsdex.JAXBUnmarshallingExample.main()`
