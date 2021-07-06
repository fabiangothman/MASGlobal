package com.masglobal.employees.Models.Contract;

/*import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contract")*/
public abstract class Contract {
    /*@Id
    @Column(unique = true, nullable = false)*/
    private Long id;
    
    protected Integer salary;
    private String contractType;

    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
    public abstract Integer getSalary();
    public void setSalary(Integer salary){  
        this.salary = salary;
    }

    public void setContractType(String contractType){  
        this.contractType = contractType;
    }
    public String getContractType(){
        return this.contractType;
    }
}
