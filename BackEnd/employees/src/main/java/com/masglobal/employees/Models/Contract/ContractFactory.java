package com.masglobal.employees.Models.Contract;

public class ContractFactory {
    //use getPlan method to get object of type Plan   
    public Contract getContract(Long id, String contractType, Integer hourlySalary, Integer monthlySalary){
        if(contractType == null)
            return null;
      
        if(contractType.equalsIgnoreCase("HourlySalaryEmployee")) {
            HourlyContract hourlyContract = new HourlyContract();
            hourlyContract.setId(id);
            hourlyContract.setContractType(contractType);
            hourlyContract.setSalary(hourlySalary);
            return hourlyContract;  
        } else if(contractType.equalsIgnoreCase("MonthlySalaryEmployee")) {  
            MonthlyContract monthlyContract = new MonthlyContract();
            monthlyContract.setId(id);
            monthlyContract.setContractType(contractType);
            monthlyContract.setSalary(monthlySalary);
            return monthlyContract;  
        }
        return null;
    }  
}
