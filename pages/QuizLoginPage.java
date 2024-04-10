package pages;
import javax.swing.*;
import java.awt.*;

public class QuizLoginPage extends JFrame {
//    public JFrame login_frame;
    public JPanel adminPanel, studentPanel, navbarPanel;
    public JButton adminLoginButton, adminSignInButton, studentLoginButton, studentSignInButton;
    public JLabel adminUsernameLabel, adminPasswordLabel, studentUsernameLabel, studentPasswordLabel, titleLabel, adminTitleLabel, studentTitleLabel,navbarLabel;
    public JTextField adminUsernameField, studentUsernameField;
    public JPasswordField adminPasswordField, studentPasswordField;
//    public JComboBox<String> admin_stud;
//    String [] adminStud = {"Admin", "Student"};
    int w = 1540, h = 1200;
    public JFrame frame()
    {
        JFrame mainFrame = new JFrame("Login Page");

        mainFrame.setSize(w, h);
        mainFrame.setLocationRelativeTo(null);

        return mainFrame;

    }

    public JPanel createNavbarPanel(String title)
    {
        navbarPanel = new JPanel();
        navbarPanel.setLayout(null);
        navbarPanel.setBounds(0, 0, w, 100);
        navbarPanel.setBackground(Color.BLUE);

        // Title labels
        titleLabel = new JLabel("Quizee");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setVerticalAlignment(SwingConstants.CENTER);
        titleLabel.setBounds(25, 25, 200, 50); // Centered horizontally, 25 pixels from the top
        titleLabel.setFont(new Font("Arial", Font.BOLD, 34)); // Set font size to 24 and style to bold
        titleLabel.setForeground(Color.WHITE); // Set font color to white

        // NavBar  label

        navbarLabel = new JLabel(title);
        navbarLabel.setHorizontalAlignment(SwingConstants.CENTER);
        navbarLabel.setVerticalAlignment(SwingConstants.CENTER);
        navbarLabel.setBounds(w/2-175, 25, 350, 50); // Centered horizontally, 25 pixels from the top
        navbarLabel.setFont(new Font("Arial", Font.BOLD, 34)); // Set font size to 24 and style to bold
        navbarLabel.setForeground(Color.WHITE); // Set font color to white

        navbarPanel.add(titleLabel);
        navbarPanel.add(navbarLabel);

        return navbarPanel;


    }


    public void initializeQuizLoginPage() {



        // Fonts
        Font labelFont = new Font("Arial", Font.BOLD, 24);

        // DropDown
//        admin_stud = new JComboBox<>(adminStud)


        // Panels
        adminPanel = new JPanel();
        adminPanel.setLayout(null);
        studentPanel = new JPanel();
        studentPanel.setLayout(null);


        adminPanel.setBounds(w / 8, h / 8, w / 3, h / 2);
        studentPanel.setBounds(7 * w / 8 - w / 3, h / 8, w / 3, h / 2);

        adminPanel.setBackground(Color.GRAY);
        studentPanel.setBackground(Color.GRAY);


        // Fields
        adminUsernameField = new JTextField();
        adminUsernameField.setBounds(250, 200, 200, 30);
        adminPasswordField = new JPasswordField();
        adminPasswordField.setBounds(250, 300, 200, 30);
        studentUsernameField = new JTextField();
        studentUsernameField.setBounds(250, 200, 200, 30);
        studentPasswordField = new JPasswordField();
        studentPasswordField.setBounds(250, 300, 200, 30);



        // Panel labels
        adminTitleLabel= new JLabel("Login as Admin");
        adminTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        adminTitleLabel.setVerticalAlignment(SwingConstants.CENTER);
        adminTitleLabel.setBounds(110, 25, 300, 50); // Centered horizontally, 25 pixels from the top
        adminTitleLabel.setFont(new Font("Arial", Font.BOLD, 34)); // Set font size to 24 and style to bold
//        adminTitleLabel.setForeground(Color.WHITE); // Set font color to white

        studentTitleLabel= new JLabel("Login as Student");
        studentTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        studentTitleLabel.setVerticalAlignment(SwingConstants.CENTER);
        studentTitleLabel.setBounds(110, 25, 300, 50); // Centered horizontally, 25 pixels from the top
        studentTitleLabel.setFont(new Font("Arial", Font.BOLD, 34)); // Set font size to 24 and style to bold
//        studentTitleLabel.setForeground(Color.WHITE); // Set font color to white

        // Labels

        adminUsernameLabel = new JLabel("Username");
        adminUsernameLabel.setBounds(100, 200, 220, 30);
        adminUsernameLabel.setFont(labelFont);

        adminPasswordLabel = new JLabel("Password");
        adminPasswordLabel.setBounds(100, 300, 220, 30);
        adminPasswordLabel.setFont(labelFont);

        studentUsernameLabel = new JLabel("Username");
        studentUsernameLabel.setBounds(100, 200, 220, 30);
        studentUsernameLabel.setFont(labelFont);

        studentPasswordLabel = new JLabel("Password");
        studentPasswordLabel.setBounds(100, 300, 220, 30);
        studentPasswordLabel.setFont(labelFont);

        // Buttons
        adminLoginButton = new JButton("Login");
        adminLoginButton.setBounds(w/6 - 70, 400, 140, 50);
        adminLoginButton.setFont(labelFont);

        adminSignInButton = new JButton("Sign In");
        adminSignInButton.setBounds(w/6 - 70, 500, 140, 50);
        adminSignInButton.setFont(labelFont);

        studentLoginButton = new JButton("Login");
        studentLoginButton.setBounds(w/6 - 70, 400, 140, 50);
        studentLoginButton.setFont(labelFont);

        studentSignInButton = new JButton("Sign In");
        studentSignInButton.setBounds(w/6 - 70, 500, 140, 50);
        studentSignInButton.setFont(labelFont);

        // Add components to panels
        adminPanel.add(adminUsernameLabel);
        adminPanel.add(adminPasswordLabel);
        adminPanel.add(adminUsernameField);
        adminPanel.add(adminPasswordField);
        adminPanel.add(adminLoginButton);
        adminPanel.add(adminSignInButton);
        adminPanel.add(adminTitleLabel);


        studentPanel.add(studentUsernameLabel);
        studentPanel.add(studentPasswordField);
        studentPanel.add(studentPasswordLabel);
        studentPanel.add(studentUsernameField);
        studentPanel.add(studentLoginButton);
        studentPanel.add(studentSignInButton);
        studentPanel.add(studentTitleLabel);

        JFrame mainFrame = frame();
        // Add panels to frame
        mainFrame.add(adminPanel);
        mainFrame.add(studentPanel);

        navbarPanel = createNavbarPanel("Login/Sign in");
        mainFrame.add(navbarPanel);

        mainFrame.setLayout(null);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



    public static void main(String[] args) {
       QuizLoginPage LoginPage =new QuizLoginPage();
       LoginPage.initializeQuizLoginPage();
    }
}
