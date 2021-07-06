package com.masglobal.employees.Models;

public class EmployeeContract {

    private Long id;
    private String name;
    private Integer roleId;
    private String roleName;
    private String roleDescription;
    private String contractTypeName;
    private Integer salary;

    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getRoleId() {
        return this.roleId;
    }
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return this.roleName;
    }
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDescription() {
        return this.roleDescription;
    }
    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    public String getContractTypeName() {
        return this.contractTypeName;
    }
    public void setContractTypeName(String contractTypeName) {
        this.contractTypeName = contractTypeName;
    }

    public Integer getSalary() {
        return this.salary;
    }
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
