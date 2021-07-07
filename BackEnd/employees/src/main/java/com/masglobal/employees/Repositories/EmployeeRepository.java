package com.masglobal.employees.Repositories;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.masglobal.employees.Models.Employee;
import com.masglobal.employees.Models.EmployeeContract;
import com.masglobal.employees.Models.Contract.ContractFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class EmployeeRepository {
    @Bean
    private RestTemplate restTemplate() {
        return new RestTemplate();
    }
    
    /*  This function has a big O complexity of O(n), due the worst case could be n iterations in the forEach cycle,
            this time could improve by implementing a custom pagination system.
    */
    public List<EmployeeContract> fetchData(){
        Employee[] employees = restTemplate().getForObject("http://masglobaltestapi.azurewebsites.net/api/employees", Employee[].class);
        List<EmployeeContract> employeeContractList = new ArrayList<EmployeeContract>();
        Arrays.asList(employees).forEach(employee -> {
            EmployeeContract employeeContract = new EmployeeContract();
            employeeContract.setId(employee.getId());
            employeeContract.setName(employee.getName());
            employeeContract.setRoleId(employee.getRoleId());
            employeeContract.setRoleName(employee.getRoleName());
            employeeContract.setRoleDescription(employee.getRoleDescription());
            employeeContract.setContractTypeName(employee.getContractTypeName());

            ContractFactory contractFactory = new ContractFactory();
            employeeContract.setSalary((contractFactory.getContract(employee.getId(), employee.getContractTypeName(), employee.getHourlySalary(), employee.getMonthlySalary())).getSalary());

            employeeContractList.add(employeeContract);
        });

        return employeeContractList;
    }
}
