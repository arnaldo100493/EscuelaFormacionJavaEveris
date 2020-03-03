/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.everis.entity;

import java.util.Date;

/**
 *
 * @author abarrime
 */
public class Empleado {

    private Integer employeeId;
    private String firstName;
    private String lastName;
    private Date hiredate;

    public Empleado() {
        this.employeeId = 0;
        this.firstName = "";
        this.lastName = "";
        this.hiredate = new Date();
    }

    public Empleado(Integer employeeId, String firstName, String lastName, Date hiredate) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hiredate = hiredate;
    }

    /**
     * @return the employeeId
     */
    public Integer getEmployeeId() {
        return employeeId;
    }

    /**
     * @param employeeId the employeeId to set
     */
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the hiredate
     */
    public Date getHiredate() {
        return hiredate;
    }

    /**
     * @param hiredate the hiredate to set
     */
    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    @Override
    public String toString() {
        return "Empleado{" + "employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", hiredate=" + hiredate + '}';
    }

}
