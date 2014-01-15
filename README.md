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