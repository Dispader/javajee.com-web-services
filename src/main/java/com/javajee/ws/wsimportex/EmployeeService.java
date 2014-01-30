package com.javajee.ws.wsimportex;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService
@SOAPBinding(style=Style.DOCUMENT, use=Use.LITERAL, parameterStyle=ParameterStyle.WRAPPED)
public interface EmployeeService
{
    @WebMethod
    public Employee findEmployee(int number);
    
    @WebMethod
    public List<Employee> findEmployees(List<Integer> numberList);
    
    @WebMethod
    public List<Employee> findAllEmployees();
}
