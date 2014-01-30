package com.javajee.ws.wsimportex;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jake Gage <jake.gage@gmail.com>
 * @see http://www.javajee.com/articles/creating-a-soap-web-service-with-rich-data-types-using-wsimport
 */
public class EmployeeFactory
{
    List<Employee> employeeList = null;
    
    EmployeeFactory()
    {
        this.employeeList = new ArrayList<Employee>();
        this.createEmployees();
    }
    
    public void createEmployees() {
        
        this.employeeList.add(new Employee("Sneha", 1));
        this.employeeList.add(new Employee("Heartin", 2));
    }
    
    public Employee find(int number) {
        for ( Employee employee : this.employeeList ) {
            if ( employee.number == number ) {
                return employee;
            }
        }
        return null;
    }
    
    public List<Employee> find(List<Integer> numberList) {
        List<Employee> employeeList = new ArrayList<Employee>();
        for ( Integer number : numberList ) {
            employeeList.add(this.find(number));
        }
        return employeeList;
    }
    
    public List<Employee> find() {
        return this.employeeList;
    }
}
