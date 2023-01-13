package Height.Converter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HeightConverter extends JFrame {
    private JPanel mainPanel;
    private JTextField ftTxtField;
    private JButton convertBtn;
    private JTextField inchTxtField;
    private JButton clearBtn;
    private JButton exitBtn;
    private JLabel ftLabel;
    private JLabel inchLabel;
    private JLabel cmLabel;
    private JTextField cmTxtField;

    public HeightConverter(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        convertBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // grab the text from the ftTxtField
                // convert to a Double for height in inches and another one for height in centimetres
                // update the inchTxtField and cmTxtField
                double feet = Double.parseDouble(ftTxtField.getText());
                double inches = Double.parseDouble(inchTxtField.getText());
                double centimetres = (feet * 12 + inches) * 2.54;
                cmTxtField.setText(String.valueOf(centimetres));
            }
        });
        exitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // exit from application
                System.exit(0);
            }
        });
        clearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // clear the text fields
                ftTxtField.setText("");
                inchTxtField.setText("");
                cmTxtField.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new HeightConverter("Feet and inches conversion to centimetres");
        frame.setVisible(true);
        frame.setSize(450,300);
    }
}
