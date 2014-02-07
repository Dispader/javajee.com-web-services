package com.javajee.ws.jaxb2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)  // see https://bugs.eclipse.org/bugs/show_bug.cgi?id=411408
public class HelloBinding
{
    private String greeting;
    private String name;
    
    public String getGreeting() {
        return this.greeting;
    }
    
    @XmlElement
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
    
    public String getName() {
        return this.name;
    }
    
    @XmlElement
    public void setName(String name) {
        this.name = name;
    }
}
