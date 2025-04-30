import java.awt.*;
import java.awt.event.*;

public class ListBoxExample {
    ListBoxExample() {
        // Create a Frame
        Frame f = new Frame("AWT ListBox Example");

        // Create a List (ListBox)
        List list = new List(5); // 5 visible rows

        // Add items to the List
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");
        list.add("Black");
        list.add("White");

        // Set bounds for the List
        list.setBounds(100, 100, 150, 100);

        // Add the list to the frame
        f.add(list);

        // Frame properties
        f.setSize(350, 250);
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
        new ListBoxExample();
    }
}