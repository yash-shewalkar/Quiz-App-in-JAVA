package pages;
import javax.swing.*;
import java.awt.*;

public class StartQuiz extends JFrame {

    private JPanel examDashboard, navbarPanel;
    private JLabel subjectL, questionL;
    private JLabel option1Label, option2Label, option3Label, option4Label; // Change JTextField to JLabel
    private JLabel questionText;
    private JComboBox<String> subjectDropdown;
    private JButton logoutbtn, saveNext, previous,submit;
    private String[] subs = {"DS", "DBMS", "OOPS","IOT"};
    public int w = 1540, h = 1200;
    public int wp = 8 * (w / 10), hp = 5 * (h / 10);

    // Helper method to create text fields with centered text
    public JTextField inputs(String label) {
        JTextField inputField = new JTextField(label);
        inputField.setSize(200, 40);
        inputField.setHorizontalAlignment(JTextField.CENTER); // Centering text
        return inputField;
    }

    // Helper method to create radio buttons for options
    public JRadioButton optionRadioButton(String label) {
        JRadioButton radioButton = new JRadioButton(label);
        radioButton.setFont(new Font("Arial", Font.BOLD, 20));
        return radioButton;
    }

    public JButton saveNext() {
        JButton saveNxt = new JButton("Save & Next");
        saveNxt.setBounds(600, 520, 170, 50);
        saveNxt.setFont(new Font("Arial", Font.BOLD, 20));
        saveNxt.setBackground(Color.green);
        return saveNxt;
    }

    public JButton previous() {
        JButton preVious = new JButton("Previous");
        preVious.setBounds(270, 520, 170, 50);
        preVious.setFont(new Font("Arial", Font.BOLD, 20));
        preVious.setBackground(Color.cyan);
        return preVious;
    }
    public JButton submiT()
    {
        JButton subt = new JButton("Submit");
        subt.setBounds(850, 40, 150, 50);
        subt.setFont(new Font("Arial", Font.BOLD, 20));
        subt.setBackground(Color.GREEN);
        return subt;
    }



    public void initializeStartQuiz() {
        setTitle("Welcome Student");
        setSize(w, h); // Set the same size as QuizLoginPage
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null); // Set layout of the frame to null for absolute positioning

        // Labels
        subjectL = new JLabel("Subject:");
        subjectL.setFont(new Font("Arial", Font.BOLD, 25)); // Setting font size to 25 and bold

        questionL = new JLabel("Question:");
        questionL.setFont(new Font("Arial", Font.BOLD, 25)); // Setting font size to 25 and bold

        // Inputs Field
        questionText = new JLabel("Please put your question here");
        questionText.setFont(new Font("Arial", Font.PLAIN, 25)); // Setting font size to 25
//        questionText.setAlignmentX(JTextArea.CENTER_ALIGNMENT); // Centering text

        // DropDown
        subjectDropdown = new JComboBox<>(subs);
        subjectDropdown.setFont(new Font("Arial", Font.BOLD, 25));

        // setting the bounds
        subjectL.setBounds(50, 40, 150, 50);
        subjectDropdown.setBounds(260, 40, 200, 50);

        questionL.setBounds(50, 230, 150, 50);
        questionText.setBounds(200, 230, 850, 100);

        // Change JTextField to JLabel and add radio buttons for options
        option1Label = new JLabel("1:");
        option1Label.setFont(new Font("Arial", Font.BOLD, 25));
        option2Label = new JLabel("2:");
        option2Label.setFont(new Font("Arial", Font.BOLD, 25));
        option3Label = new JLabel("3:");
        option3Label.setFont(new Font("Arial", Font.BOLD, 25));
        option4Label = new JLabel("4:");
        option4Label.setFont(new Font("Arial", Font.BOLD, 25));

        // Creating radio buttons for options
        JRadioButton option1RadioButton = optionRadioButton("Option 1");
        JRadioButton option2RadioButton = optionRadioButton("Option 2");
        JRadioButton option3RadioButton = optionRadioButton("Option 3");
        JRadioButton option4RadioButton = optionRadioButton("Option 4");

        // Grouping radio buttons so that only one can be selected at a time
        ButtonGroup optionGroup = new ButtonGroup();
        optionGroup.add(option1RadioButton);
        optionGroup.add(option2RadioButton);
        optionGroup.add(option3RadioButton);
        optionGroup.add(option4RadioButton);

        // Set bounds for labels and radio buttons
        option1Label.setBounds(140, 380, 50, 50);
        option1RadioButton.setBounds(200, 380, 300, 50);
        option2Label.setBounds(550, 380, 50, 50);
        option2RadioButton.setBounds(600, 380, 300, 50);
        option3Label.setBounds(140, 450, 50, 50);
        option3RadioButton.setBounds(200, 450, 300, 50);
        option4Label.setBounds(550, 450, 50, 50);
        option4RadioButton.setBounds(600, 450, 300, 50);

        // adding to the frame
        navbarPanel = new QuizLoginPage().createNavbarPanel("All the Best!! ");
        examDashboard = new AdminDashboard().mainPanel();
        logoutbtn = new AdminDashboard().logOutButton();
        saveNext = saveNext();
        previous = previous();
        submit = submiT();

        examDashboard.add(subjectL);
        examDashboard.add(subjectDropdown);
        examDashboard.add(questionL);
        examDashboard.add(questionText);
        examDashboard.add(option1Label);
        examDashboard.add(option1RadioButton);
        examDashboard.add(option2Label);
        examDashboard.add(option2RadioButton);
        examDashboard.add(option3Label);
        examDashboard.add(option3RadioButton);
        examDashboard.add(option4Label);
        examDashboard.add(option4RadioButton);
        examDashboard.add(saveNext);
        examDashboard.add(previous);
        examDashboard.add(submit);

        navbarPanel.add(logoutbtn);
        add(examDashboard);
        add(navbarPanel);
        setVisible(true);
    }

    public static void main(String[] arg) {
        StartQuiz startExam = new StartQuiz();
        startExam.initializeStartQuiz();
    }
}
