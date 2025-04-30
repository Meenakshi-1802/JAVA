import java.awt.*;
import java.awt.event.*;

public class ChoiceExample {
    ChoiceExample() {
        // Create a Frame
        Frame f = new Frame("AWT Choice Example");

        // Create a Choice (Dropdown)
        Choice choice = new Choice();

        // Add items to the Choice
        choice.add("Apple");
        choice.add("Banana");
        choice.add("Mango");
        choice.add("Grapes");
        choice.add("Orange");

        // Set bounds for the choice
        choice.setBounds(100, 100, 150, 30);

        // Add the choice to the frame
        f.add(choice);

        // Frame properties
        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);

        // Close the frame on window closing
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                f.dispose();
            }
        });
    }

    public static void main(String[] args) {
        new ChoiceExample();
    }
}