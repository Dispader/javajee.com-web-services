package com.javajee.ws.wsimportex;

/**
 * @author Jake Gage <jake.gage@gmail.com>
 * @see http://www.javajee.com/articles/creating-a-soap-web-service-with-rich-data-types-using-wsimport
 */
public class Employee
{
    /** the employee name */
    String name;
    
    /** the employee number */
    int number;
    
    
    Employee(String name, int number) {
        this.name = name;
        this.number = number;
    }
    
    Employee() {}
    public String getName()
    {
        return name;
    }
    
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public int getNumber()
    {
        return number;
    }
    
    public void setNumber(int number)
    {
        this.number = number;
    }
}
