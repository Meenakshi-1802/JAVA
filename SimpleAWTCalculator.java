import java.awt.*;
import java.awt.event.*;

public class SimpleAWTCalculator extends Frame implements ActionListener {
    TextField num1, num2, result;
    Label label1, label2, labelResult;
    Button add, sub, mul, div;

    SimpleAWTCalculator() {
        // Set frame properties
        setTitle("Simple AWT Calculator");
        setSize(350, 350);
        setLayout(null);
        setVisible(true);

        // Create labels
        label1 = new Label("Enter First Number:");
        label1.setBounds(50, 40, 150, 20);

        label2 = new Label("Enter Second Number:");
        label2.setBounds(50, 90, 150, 20);

        labelResult = new Label("Result:");
        labelResult.setBounds(50, 140, 150, 20);

        // Create text fields
        num1 = new TextField();
        num1.setBounds(50, 60, 200, 25);

        num2 = new TextField();
        num2.setBounds(50, 110, 200, 25);

        result = new TextField();
        result.setBounds(50, 160, 200, 25);
        result.setEditable(false); // Make result field non-editable

        // Create buttons
        add = new Button("+");
        add.setBounds(50, 210, 50, 30);

        sub = new Button("-");
        sub.setBounds(110, 210, 50, 30);

        mul = new Button("*");
        mul.setBounds(170, 210, 50, 30);

        div = new Button("/");
        div.setBounds(230, 210, 50, 30);

        // Add components to frame
        add(label1);
        add(num1);
        add(label2);
        add(num2);
        add(labelResult);
        add(result);
        add(add);
        add(sub);
        add(mul);
        add(div);

        // Add action listeners
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        // Window Closing
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double n1 = Double.parseDouble(num1.getText());
            double n2 = Double.parseDouble(num2.getText());
            double res = 0;

            if (e.getSource() == add) {
                res = n1 + n2;
            } else if (e.getSource() == sub) {
                res = n1 - n2;
            } else if (e.getSource() == mul) {
                res = n1 * n2;
            } else if (e.getSource() == div) {
                if (n2 != 0) {
                    res = n1 / n2;
                } else {
                    result.setText("Cannot divide by zero");
                    return;
                }
            }

            result.setText(String.valueOf(res));
        } catch (NumberFormatException ex) {
            result.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        new SimpleAWTCalculator();
    }
}
