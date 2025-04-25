import java.awt.*;
import java.awt.event.*;

public class TextFieldButtonExample extends Frame implements ActionListener {
    TextField textField;
    Label label;
    Button button;

    TextFieldButtonExample() {
        // Set layout
        setLayout(new FlowLayout());

        // Create components
        label = new Label("Enter something:");
        textField = new TextField(20);  // width 20 columns
        button = new Button("Click Me");

        // Add action listener to the button
        button.addActionListener(this);

        // Add components to the frame
        add(label);
        add(textField);
        add(button);

        // Frame settings
        setTitle("AWT Example");
        setSize(300, 150);
        setVisible(true);

        // Close the window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        String input = textField.getText();
        label.setText("You entered: " + input);
    }

    public static void main(String[] args) {
        new TextFieldButtonExample();
    }
}