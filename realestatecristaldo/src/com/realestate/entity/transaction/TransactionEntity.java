package com.realestate.entity.transaction;

import com.realestate.entity.apt.AptEntity;
import com.realestate.entity.customer.CustomerEntity;
import com.realestate.entity.employee.EmployeeEntity;

public class TransactionEntity {

    private CustomerEntity buyer;
    private EmployeeEntity salesman;
    private AptEntity apt;
    private double total;

    public TransactionEntity(CustomerEntity buyer, EmployeeEntity salesman, AptEntity apt, double total) {
        this.buyer = buyer;
        this.salesman = salesman;
        this.apt = apt;
        this.total = total;
    }

    public TransactionEntity() {
    }

    public CustomerEntity getBuyer() {
        return buyer;
    }

    public void setBuyer(CustomerEntity buyer) {
        this.buyer = buyer;
    }

    public EmployeeEntity getSalesman() {
        return salesman;
    }

    public void setSalesman(EmployeeEntity salesman) {
        this.salesman = salesman;
    }

    public AptEntity getApt() {
        return apt;
    }

    public void setApt(AptEntity apt) {
        this.apt = apt;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
