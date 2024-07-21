/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.User;
import models.HRManager;
import models.Department;
import models.Designation;

public class AddEmployeeGUI extends javax.swing.JFrame {

    private HRManager hrManager;

    public AddEmployeeGUI(HRManager hrManager) {
        this.hrManager = hrManager;
        initComponents();
        setTitle("Add Employee");
//        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        populateDepartmentComboBox();
        populateDesignationComboBox();
        addListeners();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblEmployeeName = new javax.swing.JLabel();
        txtEmployeeName = new javax.swing.JTextField();
        btnAddEmployee = new javax.swing.JButton();
        lblEmployeeEPF = new javax.swing.JLabel();
        txtEmployeeEPF = new javax.swing.JTextField();
        lblEmployeeDepartment = new javax.swing.JLabel();
        lblEmployeeDesignation = new javax.swing.JLabel();
        cbEmployeeDepartment = new javax.swing.JComboBox<>();
        cbEmployeeDesignation = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Add  Employee");

        lblEmployeeName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmployeeName.setText("Name :");

        txtEmployeeName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnAddEmployee.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAddEmployee.setText("Add");

        lblEmployeeEPF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmployeeEPF.setText("EPF Number :");

        txtEmployeeEPF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblEmployeeDepartment.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmployeeDepartment.setText("Department :");

        lblEmployeeDesignation.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmployeeDesignation.setText("Designation :");

        cbEmployeeDepartment.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cbEmployeeDesignation.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblEmployeeDepartment)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbEmployeeDepartment, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnAddEmployee, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblEmployeeName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEmployeeDesignation)
                                    .addComponent(lblEmployeeEPF))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmployeeEPF, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbEmployeeDesignation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmployeeName)
                    .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmployeeDepartment)
                    .addComponent(cbEmployeeDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEmployeeDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmployeeDesignation))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmployeeEPF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEmployeeEPF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btnAddEmployee)
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Populate department ComboBox
    private void populateDepartmentComboBox() {
        for (Department dept : hrManager.getDepartments()) {
            cbEmployeeDepartment.addItem(dept.getName());
        }
    }

    // Populate designation ComboBox
    private void populateDesignationComboBox() {
        for (Designation desig : hrManager.getDesignations()) {
            cbEmployeeDesignation.addItem(desig.getName());
        }
    }

    // Add Action Listener for the Add button
    private void addListeners() {
        btnAddEmployee.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = txtEmployeeName.getText().trim();
                String department = cbEmployeeDepartment.getSelectedItem().toString();
                String designation = cbEmployeeDesignation.getSelectedItem().toString();
                String epfNumber = txtEmployeeEPF.getText().trim();

                if (name.isEmpty() || epfNumber.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Employee name and EPF number cannot be empty.");
                } else if (hrManager.employeeExists(epfNumber)) { // Ensure HRManager has this method
                    JOptionPane.showMessageDialog(null, "Employee with this EPF number already exists.");
                } else {
                    hrManager.addEmployee(name, department, designation, epfNumber);
                    JOptionPane.showMessageDialog(null, "Employee added successfully.");
                    dispose();
                }
            }
        });

    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Pass a dummy HRManager instance for demonstration
                new AddEmployeeGUI(new HRManager("hr_manager", "hr_manager123")).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEmployee;
    private javax.swing.JComboBox<String> cbEmployeeDepartment;
    private javax.swing.JComboBox<String> cbEmployeeDesignation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEmployeeDepartment;
    private javax.swing.JLabel lblEmployeeDesignation;
    private javax.swing.JLabel lblEmployeeEPF;
    private javax.swing.JLabel lblEmployeeName;
    private javax.swing.JTextField txtEmployeeEPF;
    private javax.swing.JTextField txtEmployeeName;
    // End of variables declaration//GEN-END:variables
}
