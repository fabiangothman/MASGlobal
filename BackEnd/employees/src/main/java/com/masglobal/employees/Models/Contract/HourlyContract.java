package com.masglobal.employees.Models.Contract;

public class HourlyContract extends Contract {
    public Integer getSalary(){
        return 120*salary*12;
    }
}
