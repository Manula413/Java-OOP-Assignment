package models;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import ui.AdminGUI;

public class Admin extends User {

    public Admin(String username, String password) {
        super(username, password);
    }

    public void createUser(String username, String password, String role) throws IOException {
        File file = new File("users.txt");

        try {
            if (!file.exists()) {
                if (!file.createNewFile()) {
                    throw new IOException("Failed to create users.txt file.");
                }

                try (PrintWriter out = new PrintWriter(new FileWriter(file, true))) {
                    out.println("username,password,role");
                }
            }

            try (PrintWriter out = new PrintWriter(new FileWriter(file, true))) {
                out.println(username + "," + password + "," + role);
            }

        } catch (IOException e) {
            System.err.println("Error writing to users.txt: " + e.getMessage());
            throw e;
        }
    }

    public boolean userExists(String username) throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("users.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 1 && parts[0].equals(username)) {
                    return true;
                }
            }
            return false;
        } finally {
            if (br != null) {
                br.close();
            }
        }
    }

    @Override
    public void showMenu() {
        AdminGUI adminGUI = new AdminGUI(this);
        adminGUI.setVisible(true);
    }
}
