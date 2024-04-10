package pages;

import javax.swing.*;
import java.awt.*;

public class CreateExam extends JFrame {

    public int w = 1540, h = 1200;
    public int wp = 8 * (w / 10), hp = 5 * (h / 10);
    public JPanel registrationPanel,navPanel;
    public JButton end,create,logoutbtn;
    public JLabel subject, status;

    public JComboBox<String> subjectDropdown, statusDropdown;
    public String[] subs = {"DS", "DBMS", "OOPS","IOT"};
    public String[] stats = {"Active","InActive"};
    public void initializeCreateExam()
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
        subject = new JLabel("Subject:");
        subject.setFont(new Font("Arial", Font.BOLD, 24)); // Set font size to 24

        status = new JLabel("Status:");
        status.setFont(new Font("Arial", Font.BOLD, 24)); // Set font size to 24


        // Text Fields
        subjectDropdown = new JComboBox<>(subs);
        subjectDropdown.setFont(new Font("Arial", Font.BOLD, 24)); // Set font size to 24

        // DropDown
        statusDropdown = new JComboBox<>(stats);
        statusDropdown.setFont(new Font("Arial", Font.BOLD, 25));


        // Register Button
        create = new JButton("Create");
        create.setFont(new Font("Arial", Font.BOLD, 24)); // Set font size to 24
        create.setBackground(Color.green);
        end = new JButton("End");
        end.setFont(new Font("Arial", Font.BOLD, 24)); // Set font size to 24
        end.setBackground(Color.ORANGE);

        // Set bounds for labels and text fields
        subject.setBounds(50, 50, 150, 50);
        subjectDropdown.setBounds(200, 50, 300, 50);

        status.setBounds(50, 250, 150, 50);
        statusDropdown.setBounds(200, 250, 200, 50);
        create.setBounds(w/4 - 250, 500, 150, 50); // Adjust the bounds as needed
        end.setBounds(w/4 + 100, 500, 150, 50);

        // Add components to the registration panel
        registrationPanel.add(subject);
        registrationPanel.add(subjectDropdown);

        registrationPanel.add(status);
        registrationPanel.add(statusDropdown);
        registrationPanel.add(end);
        registrationPanel.add(create);

        //adds
        navPanel.add(logoutbtn);
        add(registrationPanel);
        add(navPanel);

        setVisible(true);
    }
    public static void main(String []arg)
    {
        CreateExam sr = new CreateExam();
        sr.initializeCreateExam();
    }


}
