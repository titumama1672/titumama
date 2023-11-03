import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame implements ActionListener {
    private JTextField textField;
    private String operator;
    private double num1, num2;

    public CalculatorGUI() {
        operator = "";
        num1 = num2 = 0.0;

        // Create the main frame
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create the text field for displaying the input and results
        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 20));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        add(textField, BorderLayout.NORTH);

        // Create buttons for digits and operators
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "C", "0", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 20));
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.matches("[0-9]")) {
            textField.setText(textField.getText() + command);
        } else if (command.matches("[-+*/]")) {
            operator = command;
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");
        } else if (command.equals("=")) {
            num2 = Double.parseDouble(textField.getText());

            switch (operator) {
                case "+":
                    textField.setText(Double.toString(num1 + num2));
                    break;
                case "-":
                    textField.setText(Double.toString(num1 - num2));
                    break;
                case "*":
                    textField.setText(Double.toString(num1 * num2));
                    break;
                case "/":
                    if (num2 != 0) {
                        textField.setText(Double.toString(num1 / num2));
                    } else {
                        textField.setText("Error: Division by zero");
                    }
                    break;
            }
        } else if (command.equals("C")) {
            textField.setText("");
            num1 = num2 = 0.0;
            operator = "";
        }
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }
}