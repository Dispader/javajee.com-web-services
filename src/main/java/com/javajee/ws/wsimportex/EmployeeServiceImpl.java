package com.javajee.ws.wsimportex;

import java.util.List;

import javax.jws.WebService;

@WebService(endpointInterface="com.javajee.ws.wsimportex.EmployeeService")
public class EmployeeServiceImpl
    implements EmployeeService
{
    EmployeeFactory employeeFactory = new EmployeeFactory();
    
    @Override
    public Employee findEmployee(int number) {
        return this.employeeFactory.find(number);
    }
    
    @Override
    public List<Employee> findEmployees(List<Integer> numberList) {
        return this.employeeFactory.find(numberList);
    }
    
    @Override
    public List<Employee> findAllEmployees() {
        return this.employeeFactory.find();
    }
}
