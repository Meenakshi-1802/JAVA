import java.awt.*;
import java.awt.event.*;

public class MenuExample {
    MenuExample() {
        // Create a frame
        Frame f = new Frame("AWT Menu Example");

        // Create a MenuBar
        MenuBar menuBar = new MenuBar();

        // Create Menus
        Menu file = new Menu("File");
        Menu edit = new Menu("Edit");

        // Create MenuItems
        MenuItem newItem = new MenuItem("New");
        MenuItem openItem = new MenuItem("Open");
        MenuItem saveItem = new MenuItem("Save");
        MenuItem exitItem = new MenuItem("Exit");

        // Add menu items to the File menu
        file.add(newItem);
        file.add(openItem);
        file.add(saveItem);
        file.addSeparator(); // adds a horizontal line
        file.add(exitItem);

        // Add menus to the menu bar
        menuBar.add(file);
        menuBar.add(edit);

        // Set the menu bar to the frame
        f.setMenuBar(menuBar);

        // Frame settings
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);

        // Add action for exit
        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });

        // Close window
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                f.dispose();
            }
        });
    }

    public static void main(String[] args) {
        new MenuExample();
    }
}