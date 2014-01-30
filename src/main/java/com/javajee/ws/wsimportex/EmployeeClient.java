package com.javajee.ws.wsimportex;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import com.javajee.ws.wsimportex.client.Employee;
import com.javajee.ws.wsimportex.client.EmployeeService;
import com.javajee.ws.wsimportex.client.EmployeeServiceImplService;

public class EmployeeClient
{
    public static void main(String[] args) throws MalformedURLException {
    
        EmployeeServiceImplService employeeServiceImplService = new EmployeeServiceImplService();
        EmployeeService employeeServicePort = employeeServiceImplService.getEmployeeServiceImplPort();
        
        System.out.println("\nall employees:");
        List<Employee> allEmployeeList = employeeServicePort.findAllEmployees();
        for ( Employee employee : allEmployeeList ) {
            System.out.println("number: " + employee.getNumber() + " , name: " + employee.getName());
        }
        
        System.out.println("\nemployee with number `2`");
        Employee employeeNumberTwo = employeeServicePort.findEmployee(2);
        System.out.println("number: " + employeeNumberTwo.getNumber() + " , name: " + employeeNumberTwo.getName());
        
        System.out.println("\nemployees from a list");
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(2);
        integerList.add(1);
        List<Employee> employeeList = employeeServicePort.findEmployees(integerList);
        for ( Employee employee : employeeList ) {
            System.out.println("number: " + employee.getNumber() + " , name: " + employee.getName());
        }
        
    }
}
