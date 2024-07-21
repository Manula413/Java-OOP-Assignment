/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import ui.HRManagerGUI;

public class HRManager extends User {

    private List<Department> departments;
    private List<Designation> designations;
    private List<Employee> employees;

    private static final String DATA_FILE = "hr_manager_data.txt";

    public HRManager(String username, String password) {
        super(username, password);
        departments = new ArrayList<>();
        designations = new ArrayList<>();
        employees = new ArrayList<>();
        loadData();
    }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
        saveData();
    }

    public void addDesignation(String designationName) {
        designations.add(new Designation(designationName));
        saveData();
    }

    public void addEmployee(String name, String departmentName, String designationName, String epfNumber) {
        Department dept = findDepartment(departmentName);
        Designation desig = findDesignation(designationName);
        if (dept != null && desig != null) {
            employees.add(new Employee(name, dept, desig, epfNumber));
            saveData();
        } else {
            System.out.println("Department or Designation not found!");
        }
    }

    public List<Employee> searchEmployees(String searchKey) {
        List<Employee> matchedEmployees = new ArrayList<>();

        for (Employee emp : employees) {
            if (emp.getName().toLowerCase().contains(searchKey)
                    || emp.getEpfNumber().toLowerCase().contains(searchKey)
                    || emp.getDepartment().getName().toLowerCase().contains(searchKey)
                    || emp.getDesignation().getName().toLowerCase().contains(searchKey)) {
                matchedEmployees.add(emp);
            }
        }

        return matchedEmployees;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public List<Designation> getDesignations() {
        return designations;
    }

    public boolean departmentExists(String deptName) {
        for (Department dept : departments) {
            if (dept.getName().equalsIgnoreCase(deptName)) {
                return true;
            }
        }
        return false;
    }

    public boolean designationExists(String designationName) {
        for (Designation desig : designations) {
            if (desig.getName().equalsIgnoreCase(designationName)) {
                return true;
            }
        }
        return false;
    }

    private Department findDepartment(String name) {
        for (Department dept : departments) {
            if (dept.getName().equalsIgnoreCase(name)) {
                return dept;
            }
        }
        return null;
    }

    private Designation findDesignation(String name) {
        for (Designation desig : designations) {
            if (desig.getName().equalsIgnoreCase(name)) {
                return desig;
            }
        }
        return null;
    }

    public boolean employeeExists(String epfNumber) {
        for (Employee emp : employees) {
            if (emp.getEpfNumber().equalsIgnoreCase(epfNumber)) {
                return true;
            }
        }
        return false;
    }

    private void saveData() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(DATA_FILE))) {
            // Write departments
            writer.println("Departments:");
            for (Department dept : departments) {
                writer.println(dept.getName());
            }
            writer.println();

            // Write designations
            writer.println("Designations:");
            for (Designation desig : designations) {
                writer.println(desig.getName());
            }
            writer.println();

            // Write employees
            writer.println("Employees:");
            for (Employee emp : employees) {
                writer.println(emp.getName() + "," + emp.getDepartment().getName() + "," +
                               emp.getDesignation().getName() + "," + emp.getEpfNumber());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadData() {
        departments.clear();
        designations.clear();
        employees.clear();

        try (BufferedReader reader = new BufferedReader(new FileReader(DATA_FILE))) {
            String line;
            String section = "";

            while ((line = reader.readLine()) != null) {
                line = line.trim();

                if (line.isEmpty()) {
                    continue; // Skip empty lines
                }

                if (line.startsWith("Departments:")) {
                    section = "Departments";
                } else if (line.startsWith("Designations:")) {
                    section = "Designations";
                } else if (line.startsWith("Employees:")) {
                    section = "Employees";
                } else {
                    switch (section) {
                        case "Departments":
                            departments.add(new Department(line));
                            break;
                        case "Designations":
                            designations.add(new Designation(line));
                            break;
                        case "Employees":
                            String[] empData = line.split(",");
                            if (empData.length == 4) {
                                Department dept = findDepartment(empData[1]);
                                Designation desig = findDesignation(empData[2]);
                                if (dept != null && desig != null) {
                                    employees.add(new Employee(empData[0], dept, desig, empData[3]));
                                } else {
                                    System.out.println("Error loading employee: Department or Designation not found.");
                                }
                            } else {
                                System.out.println("Error loading employee: Invalid data format.");
                            }
                            break;
                        default:
                            System.out.println("Unknown section: " + section);
                            break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void showMenu() {
        HRManagerGUI hrManagerGUI = new HRManagerGUI(this);
        hrManagerGUI.setVisible(true);
    }
}
