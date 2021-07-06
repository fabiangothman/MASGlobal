package com.masglobal.employees.Models.Contract;

public class MonthlyContract extends Contract {
    public Integer getSalary(){
        return salary*12;
    }
}