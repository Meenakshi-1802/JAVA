import java.awt.*;

public class PanelExample {
    PanelExample() {
        Frame f = new Frame("AWT Panel Example");

        // Create a panel
        Panel panel = new Panel();

        // Add components to the panel
        panel.add(new Button("Button 1"));
        panel.add(new Button("Button 2"));

        // Set panel layout and background
        panel.setBackground(Color.lightGray);
        panel.setBounds(50, 50, 200, 100);

        // Add panel to the frame
        f.add(panel);

        // Frame properties
        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new PanelExample();
    }
}