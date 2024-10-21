import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorApp extends JFrame {
    private JTextField display = new JTextField(10);
    private String operator = "";
    private double firstOperand = 0;

    public CalculatorApp() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+", "C"
        };

        JPanel buttonPanel = new JPanel(new GridLayout(5, 4, 10, 10));

        ActionListener buttonListener = e -> {
            String command = ((JButton) e.getSource()).getText();
            if ("0123456789.".contains(command)) {
                display.setText(display.getText() + command);
            } else if ("+-*/".contains(command)) {
                operator = command;
                firstOperand = Double.parseDouble(display.getText());
                display.setText("");
            } else if ("=".equals(command)) {
                double secondOperand = Double.parseDouble(display.getText());
                display.setText(String.valueOf(calculate(firstOperand, secondOperand, operator)));
            } else if ("C".equals(command)) {
                display.setText("");
            }
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(buttonListener);
            buttonPanel.add(button);
        }

        setLayout(new BorderLayout());
        add(display, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
    }

    private double calculate(double operand1, double operand2, String operator) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 != 0) return operand1 / operand2;
                else return Double.NaN;
            default:
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculatorApp().setVisible(true));
    }
}
