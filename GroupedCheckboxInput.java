import java.awt.*;
import java.awt.event.*;

public class GroupedCheckboxInput {
    public static void main(String[] args) {
        Frame frame = new Frame("CheckboxGroup Input");

        // Create CheckboxGroup
        CheckboxGroup genderGroup = new CheckboxGroup();

        // Create grouped checkboxes
        Checkbox male = new Checkbox("Male", genderGroup, false);
        Checkbox female = new Checkbox("Female", genderGroup, false);
        Checkbox other = new Checkbox("Other", genderGroup, false);

        // Create Button
        Button submit = new Button("Show Selected Gender");

        // Create Label to show result
        Label result = new Label();

        // Set bounds
        male.setBounds(100, 100, 100, 50);
        female.setBounds(100, 150, 100, 50);
        other.setBounds(100, 200, 100, 50);
        submit.setBounds(100, 270, 200, 30);
        result.setBounds(100, 320, 250, 30);

        // Add components
        frame.add(male);
        frame.add(female);
        frame.add(other);
        frame.add(submit);
        frame.add(result);

        // Button click action
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Checkbox selected = genderGroup.getSelectedCheckbox();
                if (selected != null) {
                    result.setText("Selected Gender: " + selected.getLabel());
                } else {
                    result.setText("No Gender Selected");
                }
            }
        });

        // Frame properties
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);

        // Window closing
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}