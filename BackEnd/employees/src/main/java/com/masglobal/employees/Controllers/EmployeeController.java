package com.masglobal.employees.Controllers;

import java.util.List;
import com.masglobal.employees.Models.EmployeeContract;
import com.masglobal.employees.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    /*  This function returns a List object of employees read from the external web API.    */
    @GetMapping()
    public List<EmployeeContract> getEmployees(){
        return employeeService.getEmployees();
    }
    

    /*  This function returns a EmployeeContract object of a employee read from the external web API.   */
    @GetMapping(path = "/id/{id}")
    public EmployeeContract getEmployeeById(@PathVariable("id") Long id){
        return employeeService.getEmployeeById(id);
    }
}
