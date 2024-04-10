package pages;
import javax.swing.*;
import java.awt.*;

public class AddExam extends JFrame {

    private JPanel examDashboard, navbarPanel;
    private JLabel subjectL, questionSetL, questionL,correctOptz;
    private JTextField subjectField, option1, option2, option3, option4;
    private JTextArea questionText;
    private JComboBox<Integer> questionSetDropdown, correctOpts;
    private JButton logoutbtn, saveNext, previous;
    private Integer[] sets = {10, 15, 30};
    public int w = 1540, h = 1200;
    public int wp = 8 * (w / 10), hp = 5 * (h / 10);

    // Helper method to create text fields with centered text
    public JTextField inputs(String label) {
        JTextField inputField = new JTextField(label);
        inputField.setSize(200, 40);
        inputField.setHorizontalAlignment(JTextField.CENTER); // Centering text
        return inputField;
    }
    public JButton saveNext()
    {
        JButton saveNxt = new JButton("Save & Next");
        saveNxt.setBounds(600, 520, 170, 50);
        saveNxt.setFont(new Font("Arial", Font.BOLD, 20));
        return saveNxt;
    }
    public JButton previous()
    {
        JButton preVious = new JButton("Previous");
        preVious.setBounds(270, 520, 170, 50);
        preVious.setFont(new Font("Arial", Font.BOLD, 20));
        return preVious;
    }
    public JComboBox<Integer> correctOption()
    {
        Integer [] correct = {1,2,3,4};
        JComboBox<Integer> correctOpt = new JComboBox<>(correct);
        correctOpt.setBounds(950,450,100,50);
        correctOpt.setFont(new Font("Arial", Font.BOLD, 20));

       return correctOpt;
    }
    public void initializeAddExam() {
        setTitle("Welcome Admin");
        setSize(w, h); // Set the same size as QuizLoginPage
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null); // Set layout of the frame to null for absolute positioning

        // Labels
        subjectL = new JLabel("Subject:");
        subjectL.setFont(new Font("Arial", Font.BOLD, 25)); // Setting font size to 25 and bold
        questionSetL = new JLabel("Questions Set:");
        questionSetL.setFont(new Font("Arial", Font.BOLD, 25)); // Setting font size to 25 and bold
        questionL = new JLabel("Question:");
        questionL.setFont(new Font("Arial", Font.BOLD, 25)); // Setting font size to 25 and bold
        correctOptz = new JLabel("Correct Option");
        correctOptz.setFont(new Font("Arial", Font.BOLD, 25)); // Setting font size to 25 and bold


        // Inputs Field
        subjectField = inputs("Subject");
        subjectField.setFont(new Font("Arial", Font.BOLD, 25));
        option1 = inputs("option 1");
        option1.setFont(new Font("Arial", Font.BOLD, 25));
        option2 = inputs("option 2");
        option2.setFont(new Font("Arial", Font.BOLD, 25));
        option3 = inputs("option 3");
        option3.setFont(new Font("Arial", Font.BOLD, 25));
        option4 = inputs("option 4");
        option4.setFont(new Font("Arial", Font.BOLD, 25));

        questionText = new JTextArea("Please put your question here");
        questionText.setFont(new Font("Arial", Font.PLAIN, 25)); // Setting font size to 25
        questionText.setAlignmentX(JTextArea.CENTER_ALIGNMENT); // Centering text

        // DropDown
        questionSetDropdown = new JComboBox<>(sets);
        questionSetDropdown.setFont(new Font("Arial", Font.BOLD, 25));

        // setting the bounds
        subjectL.setBounds(50, 40, 150, 50);
        subjectField.setBounds(260, 40, 200, 50);

        questionSetL.setBounds(50, 120, 200, 50);
        questionSetDropdown.setBounds(260, 120, 200, 50);

        questionL.setBounds(50, 230, 150, 50);
        questionText.setBounds(200, 230, 850, 100);

        option1.setBounds(200, 380, 300, 50);
        option2.setBounds(540, 380, 300, 50);
        option3.setBounds(200, 450, 300, 50);
        option4.setBounds(540, 450, 300, 50);

        correctOptz.setBounds(900,380,200,50);

        // adding to the frame

        navbarPanel = new QuizLoginPage().createNavbarPanel("Add Exam");
        examDashboard = new AdminDashboard().mainPanel();
        logoutbtn = new AdminDashboard().logOutButton();
        saveNext = saveNext();
        previous = previous();
        correctOpts = correctOption();

        examDashboard.add(subjectL);
        examDashboard.add(subjectField);
        examDashboard.add(questionSetL);
        examDashboard.add(questionSetDropdown);
        examDashboard.add(questionL);
        examDashboard.add(questionText);
        examDashboard.add(option1);
        examDashboard.add(option2);
        examDashboard.add(option3);
        examDashboard.add(option4);
        examDashboard.add(saveNext);
        examDashboard.add(previous);
        examDashboard.add(correctOpts);
        examDashboard.add(correctOptz);

        navbarPanel.add(logoutbtn);
        add(examDashboard);
        add(navbarPanel);
        setVisible(true);
    }

    public static void main(String[] arg) {
        AddExam addExam = new AddExam();
        addExam.initializeAddExam();
    }
}
