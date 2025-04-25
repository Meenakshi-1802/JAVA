import javax.swing.*;

public class LabelExample {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Swing Label Example");

        // Create a label
        JLabel label = new JLabel("Hello, this is a Swing label!");

        // Set size and layout
        frame.setSize(300, 200);
        frame.setLayout(null); // Using no layout manager

        // Set label position and size
        label.setBounds(50, 50, 200, 30);

        // Add label to frame
        frame.add(label);

        // Make frame visible
        frame.setVisible(true);

        // Close the frame when the user clicks close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}