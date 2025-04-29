import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextButtonExample {
    public static void main(String[] args) {
        // Create a new frame (window)
        JFrame frame = new JFrame("Text and Button Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // No layout manager - using absolute positioning

        // Create a text field
        JTextField textField = new JTextField();
        textField.setBounds(50, 50, 200, 30);
        frame.add(textField);

        // Create a button
        JButton button = new JButton("Show Text");
        button.setBounds(260, 50, 100, 30);
        frame.add(button);

        // Create a label to display the text
        JLabel label = new JLabel("");
        label.setBounds(50, 100, 300, 30);
        frame.add(label);

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String inputText = textField.getText(); // Get text from text field
                label.setText("You typed: " + inputText); // Set label text
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
