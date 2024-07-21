/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import models.HRManager;
import models.Employee;

public class SearchEmployeeGUI extends javax.swing.JFrame {

    private HRManager hrManager;

    public SearchEmployeeGUI(HRManager hrManager) {
        this.hrManager = hrManager;
        initComponents();
        setTitle("Search Employee");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        addListeners();
        loadAllEmployees();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSearchKey = new javax.swing.JLabel();
        txtSearchKey = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblSearchKey.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSearchKey.setText("Search Key :");

        txtSearchKey.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSearch.setText("Search");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Search Employee");

        jTable1.setBackground(new java.awt.Color(242, 242, 242));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Department", "Designation", "EPF Number"
            }
        ));
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setShowGrid(false);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSearchKey)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtSearchKey, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchKey)
                    .addComponent(txtSearchKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addListeners() {
        btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String searchKey = txtSearchKey.getText().trim().toLowerCase();
                List<Employee> employees = hrManager.searchEmployees(searchKey);

                // Clear previous search results
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);

                if (employees.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No employees found.");
                } else {
                    for (Employee emp : employees) {
                        model.addRow(new Object[]{
                            emp.getName(),
                            emp.getDepartment().getName(),
                            emp.getDesignation().getName(),
                            emp.getEpfNumber()
                        });
                    }
                }
            }
        });
    }
    
        private void loadAllEmployees() {
        List<Employee> employees = hrManager.searchEmployees("");
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Clear any existing rows
        for (Employee emp : employees) {
            model.addRow(new Object[]{
                emp.getName(),
                emp.getDepartment().getName(),
                emp.getDesignation().getName(),
                emp.getEpfNumber()
            });
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchEmployeeGUI(new HRManager("hrmanager", "password")).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblSearchKey;
    private javax.swing.JTextField txtSearchKey;
    // End of variables declaration//GEN-END:variables
}
