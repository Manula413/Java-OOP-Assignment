/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private Department department;
    private Designation designation;
    private String epfNumber;

    public Employee(String name, Department department, Designation designation, String epfNumber) {
        this.name = name;
        this.department = department;
        this.designation = designation;
        this.epfNumber = epfNumber;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public Designation getDesignation() {
        return designation;
    }

    public String getEpfNumber() {
        return epfNumber;
    }
}
