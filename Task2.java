import java.awt.*;
import java.awt.event.*;

public class Task2 extends Frame implements ActionListener {
    Label subject1Label, subject2Label, subject3Label, resultLabel;
    TextField subject1Field, subject2Field, subject3Field, resultField;
    Button calculateButton;

    public Task2() {
        setLayout(new FlowLayout());

        subject1Label = new Label("Enter marks for DBMS:");
        add(subject1Label);
        subject1Field = new TextField(20);
        add(subject1Field);

        subject2Label = new Label("Enter marks for Computer Network:");
        add(subject2Label);
        subject2Field = new TextField(20);
        add(subject2Field);

        subject3Label = new Label("Enter marks for Operating System:");
        add(subject3Label);
        subject3Field = new TextField(20);
        add(subject3Field);

        calculateButton = new Button("Calculate");
        add(calculateButton);
        calculateButton.addActionListener(this);

        resultLabel = new Label("\n\nResult:");
        add(resultLabel);
        resultField = new TextField(60);
        resultField.setEditable(false); // Make it read-only means (not editable). 
        add(resultField);

        setTitle("Student Grade Calculator");
        setSize(300, 250);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            try {
                // Parse marks from text fields
                int marks1 = Integer.parseInt(subject1Field.getText());
                int marks2 = Integer.parseInt(subject2Field.getText());
                int marks3 = Integer.parseInt(subject3Field.getText());

                // Calculate sum of marks
                int sum = marks1 + marks2 + marks3;
                double percentile = calculatePercentile(sum);
                String grade = calculateGrade(percentile);

                // Display results
                String resultText = String.format("Sum of marks: %d\nPercentile: %.2f%%\nGrade: %s", sum, percentile, grade);
                resultField.setText(resultText);
            } catch (NumberFormatException ex) {
                resultField.setText("Please enter valid marks (numeric values).");
            }
        }
    }

    private double calculatePercentile(int sumOfMarks) {
       
        return (sumOfMarks / 3.0);    }

    private String calculateGrade(double percentile) {
        // Example calculation of grade based on percentile
        if (percentile >= 80) {
            return "A";
        } else if (percentile >= 60) {
            return "B";
        } else if (percentile >= 40) {
            return "C";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {
        new Task2();
    }
    
}

