package pages;

import javax.swing.*;
import java.awt.*;

public class StudentRegistration extends JFrame {

    public int w = 1540, h = 1200;
    public int wp = 8 * (w / 10), hp = 5 * (h / 10);
    public JPanel registrationPanel,navPanel;
    public JButton register,logoutbtn;
    public JLabel sName, sEmail,sDept, sPRN,sPassword;
    public JTextField sNameF, sEmailF,sPRNF;
    public JPasswordField sPasswordF;
    public  JComboBox<String> depts;
    String [] departments = {"AIDS","CSE","ENTC","CHEM","IT","INSTRU"};

    public void initializeStudentRegistration()
    {
        setTitle("Student Registration");
        setSize(w, h); // Set the same size as QuizLoginPage
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null); // Set layout of the frame to null for absolute positioning

        //panels
        navPanel = new QuizLoginPage().createNavbarPanel("Student Registration");
        registrationPanel = new AdminDashboard().mainPanel();
        registrationPanel.setBounds(w/4,160,w/2,h/2);
        logoutbtn = new AdminDashboard().logOutButton();

        // Labels
        sName = new JLabel("Name:");
        sName.setFont(new Font("Arial", Font.BOLD, 24)); // Set font size to 24
        sEmail = new JLabel("Email:");
        sEmail.setFont(new Font("Arial", Font.BOLD, 24)); // Set font size to 24
        sDept = new JLabel("Department:");
        sDept.setFont(new Font("Arial", Font.BOLD, 24)); // Set font size to 24
        sPRN = new JLabel("PRN:");
        sPRN.setFont(new Font("Arial", Font.BOLD, 24)); // Set font size to 24
        sPassword = new JLabel("Password:");
        sPassword.setFont(new Font("Arial", Font.BOLD, 24)); // Set font size to 24

        // Text Fields
        sNameF = new JTextField();
        sNameF.setFont(new Font("Arial", Font.BOLD, 24)); // Set font size to 24
        sEmailF = new JTextField();
        sEmailF.setFont(new Font("Arial", Font.BOLD, 24)); // Set font size to 24
        depts = new JComboBox<>(departments);
        depts.setFont(new Font("Arial", Font.BOLD, 24)); // Set font size to 24
        sPRNF = new JTextField();
        sPRNF.setFont(new Font("Arial", Font.BOLD, 24)); // Set font size to 24
        sPasswordF = new JPasswordField();
        sPasswordF.setFont(new Font("Arial", Font.BOLD, 24)); // Set font size to 24

        // Register Button
        register = new JButton("Register");
        register.setFont(new Font("Arial", Font.BOLD, 24)); // Set font size to 24

        // Set bounds for labels and text fields
        sName.setBounds(50, 50, 150, 50);
        sNameF.setBounds(200, 50, 300, 50);
        sEmail.setBounds(50, 150, 150, 50);
        sEmailF.setBounds(200, 150, 300, 50);
        sDept.setBounds(50, 250, 150, 50);
        depts.setBounds(200, 250, 200, 50);
        sPRN.setBounds(50, 350, 150, 50);
        sPRNF.setBounds(200, 350, 300, 50);
        sPassword.setBounds(50, 450, 150, 50);
        sPasswordF.setBounds(200, 450, 300, 50);
        register.setBounds(w/4 - 100, 540, 200, 50); // Adjust the bounds as needed


        // Add components to the registration panel
        registrationPanel.add(sName);
        registrationPanel.add(sNameF);
        registrationPanel.add(sEmail);
        registrationPanel.add(sEmailF);
        registrationPanel.add(sDept);
        registrationPanel.add(depts);
        registrationPanel.add(sPRN);
        registrationPanel.add(sPRNF);
        registrationPanel.add(sPassword);
        registrationPanel.add(sPasswordF);
        registrationPanel.add(register);

        //adds
        navPanel.add(logoutbtn);
        add(registrationPanel);
        add(navPanel);


        setVisible(true);
    }
    public static void main(String []arg)
    {
        StudentRegistration sr = new StudentRegistration();
        sr.initializeStudentRegistration();
    }


}
