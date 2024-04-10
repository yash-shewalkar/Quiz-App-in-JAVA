package pages;

import javax.swing.*;
import java.awt.*;

public class StudentResult extends JFrame {
    public int w = 1540, h = 1200;
    public int wp = 8 * (w / 10), hp = 5 * (h / 10);
    public JLabel sName, sPRR, subjects,marks,grades,results;
    public JTextField name, prn,MarksGot, GradesGot, ResultsGot;
    public JButton result,logoutbtn;
    public JComboBox<String> subjectDropdown;
    public String[] subs = {"DS", "DBMS", "OOPS","IOT"};
    public JPanel mainPanel, marksheetPanel,navPanel;
    public void initializeStudentResult()
    {
        setTitle("Student Registration");
        setSize(w, h); // Set the same size as QuizLoginPage
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null); // Set layout of the frame to null for absolute positioning

        navPanel = new QuizLoginPage().createNavbarPanel("Student Results");
        mainPanel = new AdminDashboard().mainPanel();
        mainPanel.setBounds(w / 8, 160, w / 2, h / 2);

        //  set bounds for labels n text fields
        sName = new JLabel("Name:");
        sName.setFont(new Font("Arial", Font.BOLD, 24));
        sName.setBounds(90, 100, 100, 30);
        mainPanel.add(sName);

        name = new JTextField();
        name.setBounds(240, 100, 300, 30);
        name.setFont(new Font("Arial", Font.BOLD, 24));
        mainPanel.add(name);

        sPRR = new JLabel("PRN:");
        sPRR.setFont(new Font("Arial", Font.BOLD, 24));
        sPRR.setBounds(90, 200, 100, 30);
        mainPanel.add(sPRR);

        prn = new JTextField(8);
        prn.setBounds(240, 200, 200, 30);
        prn.setFont(new Font("Arial", Font.BOLD, 24));
        mainPanel.add(prn);

        // Create and set bounds for the subjects label
        subjects = new JLabel("Subjects:");
        subjects.setFont(new Font("Arial", Font.BOLD, 24));
        subjects.setBounds(90, 300, 150, 30);
        mainPanel.add(subjects);

        // Create and set bounds for the subjectDropdown JComboBox
        subjectDropdown = new JComboBox<>(subs);
        subjectDropdown.setBounds(240, 300, 120, 30);
        subjectDropdown.setFont(new Font("Arial", Font.BOLD, 24));
        mainPanel.add(subjectDropdown);

        // Create and set bounds for the result button
        result = new JButton("Get Result");
        result.setFont(new Font("Arial", Font.BOLD, 24));
        result.setBounds(w/4-100, 500, 180, 50);
        result.setBackground(Color.BLUE);
        result.setForeground(Color.WHITE);
        mainPanel.add(result);

        marksheetPanel = new AdminDashboard().mainPanel();
        marksheetPanel.setBounds(3 * w / 4 - 100, 160, w / 4, h / 2);



        // Create and set bounds for labels and non-editable text fields in marksheetPanel
        marks = new JLabel("Marks:");
        marks.setFont(new Font("Arial", Font.BOLD, 24));
        marks.setBounds(50, 100, 100, 30);
        marksheetPanel.add(marks);

        MarksGot = new JTextField();
        MarksGot.setEditable(false);
        MarksGot.setBounds(150, 100, 200, 30);
        MarksGot.setFont(new Font("Arial", Font.BOLD, 24));
        marksheetPanel.add(MarksGot);

        grades = new JLabel("Grades:");
        grades.setFont(new Font("Arial", Font.BOLD, 24));
        grades.setBounds(50, 200, 100, 30);
        marksheetPanel.add(grades);

        GradesGot = new JTextField();
        GradesGot.setEditable(false);
        GradesGot.setBounds(150, 200, 200, 30);
        GradesGot.setFont(new Font("Arial", Font.BOLD, 24));
        marksheetPanel.add(GradesGot);

        results = new JLabel("Results:");
        results.setFont(new Font("Arial", Font.BOLD, 24));
        results.setBounds(50, 300, 100, 30);
        marksheetPanel.add(results);

        ResultsGot = new JTextField();
        ResultsGot.setEditable(false);
        ResultsGot.setBounds(150, 300, 200, 30);
        ResultsGot.setFont(new Font("Arial", Font.BOLD, 24));
        marksheetPanel.add(ResultsGot);

        logoutbtn = new AdminDashboard().logOutButton();
        navPanel.add(logoutbtn);
        add(marksheetPanel);
        add(mainPanel);
        add(navPanel);
        logoutbtn = new AdminDashboard().logOutButton();
        navPanel.add(logoutbtn);
        add(marksheetPanel);
        add(mainPanel);
        add(navPanel);

        setVisible(true);
    }
    public static void main(String []arg)
    {
        StudentResult studResult = new StudentResult();
        studResult.initializeStudentResult();
    }
}
