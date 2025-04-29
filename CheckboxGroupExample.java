import java.awt.*;
import java.awt.event.*;

public class CheckboxGroupExample {
    public static void main(String[] args) {
        // Create a frame
        Frame frame = new Frame("AWT CheckboxGroup Example");

        // Create a CheckboxGroup
        CheckboxGroup genderGroup = new CheckboxGroup();

        // Create checkboxes and attach them to the group
        Checkbox male = new Checkbox("Male", genderGroup, false);
        Checkbox female = new Checkbox("Female", genderGroup, false);
        Checkbox other = new Checkbox("Other", genderGroup, false);

        // Set positions
        male.setBounds(100, 100, 100, 50);
        female.setBounds(100, 150, 100, 50);
        other.setBounds(100, 200, 100, 50);

        // Add checkboxes to frame
        frame.add(male);
        frame.add(female);
        frame.add(other);

        // Frame properties
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);

        // Close the frame when window is closed
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}