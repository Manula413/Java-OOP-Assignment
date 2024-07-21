/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import models.Admin;

class CreateUserGUI extends javax.swing.JFrame {

    private Admin admin;

    public CreateUserGUI(Admin admin) {
        this.admin = admin;
        initComponents();
        setTitle("Create User");
//      setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        addListeners();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRole = new javax.swing.JLabel();
        cbUserRole = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        lblUserPassword = new javax.swing.JLabel();
        pwUserPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRole.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRole.setText("Role :");

        cbUserRole.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbUserRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HRManager", "HRAssistant " }));

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setText("X");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Create User");

        lblUserName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUserName.setText("Username :");

        txtUserName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnCreate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCreate.setText("Create");

        lblUserPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUserPassword.setText("Password :");

        pwUserPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 367, Short.MAX_VALUE)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCreate, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblRole)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbUserRole, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblUserPassword)
                                    .addComponent(lblUserName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                    .addComponent(pwUserPassword))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUserPassword)
                    .addComponent(pwUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbUserRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRole))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btnCreate)
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addListeners() {
        btnCreate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = txtUserName.getText().trim();
                String password = new String(pwUserPassword.getPassword()).trim();
                String role = (String) cbUserRole.getSelectedItem();

                if (username.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Username and Password cannot be empty.");
                } else {
                    try {
                        if (admin.userExists(username)) {
                            JOptionPane.showMessageDialog(null, "Username already exists.");
                        } else {
                            admin.createUser(username, password, role);
                            JOptionPane.showMessageDialog(null, "User created successfully.");
                            dispose();
                        }
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "Error creating user.");
                    }
                }
            }
        });

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateUserGUI(new Admin("admin", "admin123")).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JComboBox<String> cbUserRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblUserPassword;
    private javax.swing.JPasswordField pwUserPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
