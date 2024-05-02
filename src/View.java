import java.util.*;
import javax.swing.*;
import java.awt.*;

public class View
{
    private JFrame frame;
    private JLabel label;
    private JButton circle, rectangle, triangle, red, blue, yellow;
    private JSlider resizer;
    private JPanel shape;

    public View(mySquare i)
    {
        //for frame
        frame = new JFrame("View");
        frame.getContentPane().setLayout(new BorderLayout(20,50));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);

        //for slider
        resizer=new JSlider(JSlider.VERTICAL,20,150,20);
        resizer.setMajorTickSpacing(150);
        resizer.setMinorTickSpacing(20);

        resizer.setPaintTicks(true);
        resizer.setPaintLabels(true);
        Hashtable<Integer,JLabel> pos = new Hashtable<Integer,JLabel>();
        pos.put(20, new JLabel("20"));
        pos.put(30, new JLabel("30"));
        pos.put(40, new JLabel("40"));
        pos.put(50, new JLabel("50"));
        pos.put(60, new JLabel("60"));
        pos.put(70, new JLabel("70"));
        pos.put(80, new JLabel("80"));
        pos.put(90, new JLabel("90"));
        pos.put(100, new JLabel("100"));
        pos.put(110, new JLabel("110"));
        pos.put(120, new JLabel("120"));
        pos.put(130, new JLabel("130"));
        pos.put(140, new JLabel("140"));
        pos.put(150, new JLabel("150"));

        resizer.setLabelTable(pos);
        frame.getContentPane().add(resizer, BorderLayout.WEST);

        //the shape itself
        shape = new JPanel(new BorderLayout(20,50));
        label = new JLabel(i, SwingConstants.CENTER);
        shape.add(label, BorderLayout.CENTER);
        frame.getContentPane().add(shape, BorderLayout.CENTER);

        //paneling buttons
        JPanel np = new JPanel();
        np.setLayout(new GridLayout (1,3));

        JPanel sp = new JPanel();
        sp.setLayout(new GridLayout(1,3));

        //buttons
        rectangle = new JButton("Rectangle");
        np.add(rectangle);

        triangle = new JButton("Triangle");
        np.add(triangle);

        circle = new JButton("Circle");
        np.add(circle);

        frame.getContentPane().add(np, BorderLayout.NORTH);

        red = new JButton("RED");
        sp.add(red, BorderLayout.SOUTH);

        blue = new JButton("BLUE");
        sp.add(blue, BorderLayout.SOUTH);

        yellow = new JButton("YELLOW");
        sp.add(yellow, BorderLayout.SOUTH);

        frame.getContentPane().add(sp, BorderLayout.SOUTH);

        frame.pack();
    }

    //buttons for controller module
    public JButton circButton()
    {
        return circle;
    }

    public JButton rectButton()
    {
        return rectangle;
    }

    public JButton triButton()
    {
        return triangle;
    }

    public JButton redButton()
    {
        return red;
    }

    public JButton blueButton()
    {
        return blue;
    }

    public JButton yellButton()
    {
        return yellow;
    }

    public JSlider getSlider()
    {
        return resizer;
    }

    //repaint or displaying new icon
    public void shift()
    {
        label.repaint();
        shape.revalidate();
    }

    public void reset(mySquare i)
    {
        shape = new JPanel(new BorderLayout(20,50));
        label = new JLabel(i, SwingConstants.CENTER);
        shape.add(label, BorderLayout.CENTER);
        frame.add(shape);
        shift();
    }
    public void wipe()
    {
        frame.remove(shape);
        shift();
    }
}