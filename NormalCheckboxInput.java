import java.awt.*;
import java.awt.event.*;

public class NormalCheckboxInput {
    public static void main(String[] args) {
        Frame frame = new Frame("Normal Checkbox Input");

        // Create Checkboxes
        Checkbox java = new Checkbox("Java");
        Checkbox python = new Checkbox("Python");
        Checkbox cpp = new Checkbox("C++");

        // Create Button
        Button submit = new Button("Show Selection");

        // Create Label to show result
        Label result = new Label();

        // Set bounds
        java.setBounds(100, 100, 100, 50);
        python.setBounds(100, 150, 100, 50);
        cpp.setBounds(100, 200, 100, 50);
        submit.setBounds(100, 270, 150, 30);
        result.setBounds(100, 320, 250, 30);

        // Add components to frame
        frame.add(java);
        frame.add(python);
        frame.add(cpp);
        frame.add(submit);
        frame.add(result);

        // Button click action
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String output = "Selected: ";
                if (java.getState()) output += "Java ";
                if (python.getState()) output += "Python ";
                if (cpp.getState()) output += "C++ ";
                result.setText(output);
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