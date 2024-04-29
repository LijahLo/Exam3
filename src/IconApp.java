import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IconApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Model model = new Model();
            View view = new View(model);
            Controller controller = new Controller(model, view);
            view.createAndShowGUI();
        });
    }
}

class Model {
    private int size;
    private String type;
    private Color color;

    public Model() {
        size = 50; // Default size
        type = "Rectangle"; // Default type
        color = Color.RED; // Default color
    }

    // Getters and setters for size, type, and color
}

class View {
    private Model model;
    private JFrame frame;
    private JPanel iconPanel;
    private JSlider sizeSlider;
    private JButton rectangleButton;
    private JButton eclipseButton;
    private JButton triangleButton;
    private JButton redButton;
    private JButton blueButton;
    private JButton yellowButton;

    public View(Model model) {
        this.model = model;
    }

    public void createAndShowGUI() {
        // Create GUI components and layout

        // Add event listeners to components
    }

    // Update icon display based on model changes
    public void updateIcon() {
        // Update icon display
    }
}

class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // Add event listeners and handle user interactions
}
