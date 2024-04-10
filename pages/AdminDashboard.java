package pages;

import javax.swing.*;
import java.awt.*;


public class AdminDashboard extends JFrame {

    public JButton addExamButton, addStudentButton, viewExamButton, studentResultsButton;
    public int w = 1540, h = 1200;
    public int wp = 8 * (w / 10), hp = 5 * (h / 10);

    public JButton logOutButton()
    {
        JButton logoutbtn = new JButton("Log Out");
        logoutbtn.setBounds(7*w/8,20,150,50);
        logoutbtn.setFont(new Font("Arial", Font.BOLD, 20)); // Set font size to 20
        logoutbtn.setBackground(Color.PINK);
        return logoutbtn;
    }
    public JPanel mainPanel()
    {
        // Create the main dashboard panel

        JPanel mPanel = new JPanel();
        mPanel.setLayout(null); // Set layout to null for absolute positioning
        mPanel.setBounds(w / 10, h / 10, wp, hp); // Adjust bounds as needed
        mPanel.setBackground(Color.LIGHT_GRAY);
        return mPanel;
    }

    public void initializeAdminDashboard() {
        setTitle("Admin Dashboard");


        setSize(w, h); // Set the same size as QuizLoginPage
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null); // Set layout of the frame to null for absolute positioning


//        // Create the main dashboard panel
//        dashboardPanel = new JPanel();
//        dashboardPanel.setLayout(null); // Set layout to null for absolute positioning
//        dashboardPanel.setBounds(w / 10, h / 10, wp, hp); // Adjust bounds as needed
//        dashboardPanel.setBackground(Color.LIGHT_GRAY);

        // Create buttons and position them at the four corners with margins
        addExamButton = new JButton("Add Exam");
        addExamButton.setBounds(wp / 8, hp / 6, 250, 100);
        addExamButton.setFont(new Font("Arial", Font.BOLD, 20)); // Set font size to 20

        addStudentButton = new JButton("Add Student");
        addStudentButton.setBounds(7 * (wp / 8) - 250, hp / 6, 250, 100);
        addStudentButton.setFont(new Font("Arial", Font.BOLD, 20)); // Set font size to 20

        viewExamButton = new JButton("View Exam");
        viewExamButton.setBounds(wp / 8, 5 * (hp / 6) - 100, 250, 100);
        viewExamButton.setFont(new Font("Arial", Font.BOLD, 20)); // Set font size to 20

        studentResultsButton = new JButton("Student Results");
        studentResultsButton.setBounds(7 * (wp / 8) - 250, 5 * (hp / 6) - 100, 250, 100);
        studentResultsButton.setFont(new Font("Arial", Font.BOLD, 20)); // Set font size to 20

        JPanel dashboardPanel = mainPanel();
        // Add buttons to the dashboard panel
        dashboardPanel.add(addExamButton);
        dashboardPanel.add(addStudentButton);
        dashboardPanel.add(viewExamButton);
        dashboardPanel.add(studentResultsButton);
        JPanel navPanel = new QuizLoginPage().createNavbarPanel("DashBoard");
        add(navPanel);
        JButton logOutbtn = logOutButton();


        navPanel.add(logOutbtn);

        // Add dashboardPanel to the frame
        add(dashboardPanel);
        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {


            AdminDashboard adminDashboard = new AdminDashboard();
            adminDashboard.initializeAdminDashboard();

    }
}
