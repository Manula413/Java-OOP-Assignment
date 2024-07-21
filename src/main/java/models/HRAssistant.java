/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import ui.HRAssistantGUI;

public class HRAssistant extends User {

    private List<Employee> employees;

    private static final String DATA_FILE = "hr_manager_data.txt";

    public HRAssistant(String username, String password) {
        super(username, password);
        employees = new ArrayList<>();
        loadData();
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

    private void loadData() {
        employees.clear();

        try (BufferedReader reader = new BufferedReader(new FileReader(DATA_FILE))) {
            String line;
            String section = "";

            while ((line = reader.readLine()) != null) {
                line = line.trim();

                if (line.isEmpty()) {
                    continue; // Skip empty lines
                }

                if (line.startsWith("Employees:")) {
                    section = "Employees";
                } else {
                    if ("Employees".equals(section)) {
                        String[] empData = line.split(",");
                        if (empData.length == 4) {
                            Department dept = new Department(empData[1]);
                            Designation desig = new Designation(empData[2]);
                            employees.add(new Employee(empData[0], dept, desig, empData[3]));
                        } else {
                            System.out.println("Error loading employee: Invalid data format.");
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void showMenu() {
        HRAssistantGUI hrAssistantGUI = new HRAssistantGUI(this);
        hrAssistantGUI.setVisible(true);
    }
}
