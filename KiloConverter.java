import javax.swing.*;
import java.awt.event.*;

public class KiloConverter extends JFrame
{
    private JPanel panel; 
    private JLabel messageLabel; 
    private JTextField kiloTextField; 
    private JButton calcButton; 
    
    public KiloConverter()
    {

        setTitle("Kilometer Converter");
        setSize(310, 100);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        buildPanel();
        add(panel);
        setVisible(true);
    }

    private void buildPanel()
    {
        messageLabel = new JLabel("Enter a distance in kilometers:"); 
        kiloTextField = new JTextField(10);  
        calcButton = new JButton("Calculate"); 
        calcButton.addActionListener(new CalcButtonListener());

        panel = new JPanel();
        panel.add(messageLabel);
        panel.add(kiloTextField);
        panel.add(calcButton);
    }
    private class CalcButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String input; 
            double miles;
            double meters;
            double centimeters;

            input = kiloTextField.getText();

            miles = Double.parseDouble(input) * 0.6214;
            meters = Double.parseDouble(input) * 1000;
            centimeters = Double.parseDouble(input) * 100000;
              
            JOptionPane.showMessageDialog(null, input + " kilometers is \n"  + miles + " miles and \n "  + meters + " meters and \n" + centimeters +" centimeters");
        }
    }        
    public static void main(String[] args)
    {
        new KiloConverter();
    }
}    