package com.realestate.entity.branch;

import com.realestate.entity.apt.AbstractApt;
import com.realestate.entity.employee.EmployeeEntity;
import com.realestate.utils.Branches;

import java.util.ArrayList;
import java.util.List;

public class BranchEntity extends AbstractApt {


    private String description;
    private int tel;
    private int id;
    private ArrayList<EmployeeEntity> employees = new ArrayList<>();

    public BranchEntity(String description, String address, int tel, ArrayList<EmployeeEntity> employees) {
        super(address);
        this.description = description;
        this.tel = tel;
        this.employees = employees;
    }

    public BranchEntity(String description, String address, int tel, int id) {
        super(address);
        this.description = description;
        this.tel = tel;
        this.id = id;
    }

    public BranchEntity(){}


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
    public ArrayList<EmployeeEntity> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<EmployeeEntity> employees) {
        this.employees = employees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "description='" + description + '\'' +
                ", address='" + getAddress() + '\'' +
                ", tel=" + tel +
                ", Employees=" + employees +
                ", id=" + id +
                '}';
    }





}
