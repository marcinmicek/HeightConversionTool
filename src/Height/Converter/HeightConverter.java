package Height.Converter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HeightConverter extends JFrame {
    private JPanel mainPanel;
    private JTextField feetTextField;
    private JButton convertButton;
    private JTextField inchesTextField;
    private JButton clearButton;
    private JButton exitButton;
    private JLabel feetLabel;
    private JLabel inchesLabel;
    private JLabel centimetresLabel;
    private JTextField centimetrestextField;

    public HeightConverter(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // grab the text from the metricTextField
                // convert to a Double
                // update the imperialTextField
                double inchesHeight = Double.parseDouble(feetTextField.getText()) / 25.4;
                inchesTextField.setText(String.valueOf(inchesHeight));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new HeightConverter("My Height Converter");
        frame.setVisible(true);
    }
}
