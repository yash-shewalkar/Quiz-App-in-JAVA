package pages;

import javax.swing.*;
import java.awt.*;

public class StudentDashBoard  extends JFrame {
    public int w = 1540, h = 1200;
    public int wp = 8 * (w / 10), hp = 5 * (h / 10);
    public JLabel dbms, java, maths, ds,quizes;
    public JButton result,logoutbtn,startEnd1,startEnd2,startEnd3,startEnd4;

    public JPanel mainPanel, resultPanel,navPanel;

    public void initializeStudentDashBoard()
    {
        setTitle("Student Registration");
        setSize(w, h); // Set the same size as QuizLoginPage
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null); // Set layout of the frame to null for absolute positioning

        navPanel = new QuizLoginPage().createNavbarPanel("Student Exams");
        mainPanel = new AdminDashboard().mainPanel();
        mainPanel.setBounds(w / 8, 160, w / 2, h / 2);

        //  set bounds for labels n text fields
        quizes = new JLabel("Quizes");
        quizes.setFont(new Font("Arial", Font.BOLD, 29));
        quizes.setForeground(Color.BLUE);
        quizes.setBounds(50, 30, 100, 30);
        mainPanel.add(quizes);


        maths = new JLabel("Maths:");
        maths.setFont(new Font("Arial", Font.BOLD, 24));
        maths.setBounds(90, 100, 100, 30);
        mainPanel.add(maths);

        dbms = new JLabel("DBMS:");
        dbms.setFont(new Font("Arial", Font.BOLD, 24));
        dbms.setBounds(90, 200, 100, 30);
        mainPanel.add(dbms);

        java = new JLabel("JAVA:");
        java.setFont(new Font("Arial", Font.BOLD, 24));
        java.setBounds(90, 300, 100, 30);
        mainPanel.add(java);

        ds = new JLabel("DS:");
        ds.setFont(new Font("Arial", Font.BOLD, 24));
        ds.setBounds(90, 400, 100, 30);
        mainPanel.add(ds);


        // Buttons
        startEnd1 = new JButton("dynamic it");
        startEnd1.setFont(new Font("Arial", Font.BOLD, 24));
        startEnd1.setBounds(250, 100, 180, 50);
        startEnd1.setBackground(Color.BLUE);
        startEnd1.setForeground(Color.WHITE);
        mainPanel.add(startEnd1);

        startEnd2 = new JButton("dynamic it");
        startEnd2.setFont(new Font("Arial", Font.BOLD, 24));
        startEnd2.setBounds(250, 200, 180, 50);
        startEnd2.setBackground(Color.BLUE);
        startEnd2.setForeground(Color.WHITE);
        mainPanel.add(startEnd2);

        startEnd3 = new JButton("dynamic it");
        startEnd3.setFont(new Font("Arial", Font.BOLD, 24));
        startEnd3.setBounds(250, 300, 180, 50);
        startEnd3.setBackground(Color.BLUE);
        startEnd3.setForeground(Color.WHITE);
        mainPanel.add(startEnd3);

        startEnd4 = new JButton("dynamic it");
        startEnd4.setFont(new Font("Arial", Font.BOLD, 24));
        startEnd4.setBounds(250, 400, 180, 50);
        startEnd4.setBackground(Color.BLUE);
        startEnd4.setForeground(Color.WHITE);
        mainPanel.add(startEnd4);

        resultPanel = new AdminDashboard().mainPanel();
        resultPanel.setBounds(3 * w / 4 - 100, 160, w / 4, h / 2);

        result = new JButton("View Results");
        result.setFont(new Font("Arial", Font.BOLD, 24));
        result.setBounds(100, 100, 200, 50);
        result.setBackground(Color.BLUE);
        result.setForeground(Color.WHITE);
        resultPanel.add(result);

        logoutbtn = new AdminDashboard().logOutButton();
        navPanel.add(logoutbtn);
        add(resultPanel);
        add(mainPanel);
        add(navPanel);

        setVisible(true);
    }

    public static void main(String []args)
    {
        StudentDashBoard studDash = new StudentDashBoard();
        studDash.initializeStudentDashBoard();
    }


}
