package com.masglobal.employees.Services;

import java.util.List;
import com.masglobal.employees.Models.EmployeeContract;
import com.masglobal.employees.Repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<EmployeeContract> getEmployees(){
        return employeeRepository.fetchData();
    }

    public EmployeeContract getEmployeeById(Long id){
        List<EmployeeContract> totalEmployees = employeeRepository.fetchData();
        EmployeeContract foundEmployee = new EmployeeContract();
        totalEmployees.forEach(employee -> {
            if (employee.getId()==id) {
                foundEmployee.setId(employee.getId());
                foundEmployee.setName(employee.getName());
                foundEmployee.setRoleId(employee.getRoleId());
                foundEmployee.setRoleName(employee.getRoleName());
                foundEmployee.setRoleDescription(employee.getRoleDescription());
                foundEmployee.setContractTypeName(employee.getContractTypeName());
                foundEmployee.setSalary(employee.getSalary());
            }
        });
        return foundEmployee;
    }
}
