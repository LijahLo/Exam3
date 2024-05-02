import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.geom.*;

public class myCircle
{
    private int width, height, size;
    private Color color;

    public myCircle(int s)
    {
        width=s;
        height=s;
        color=Color.YELLOW;
    }

    public int getIconWidth()
    {
        return width;
    }

    public int getIconHeight()
    {
        return height;
    }

    public void setWidth(int x)
    {
        this.width=x;
    }

    public void setHeight(int x)
    {
        this.height=x;
    }

    public void setSize(int x)
    {
        width = x;
        height= x;
    }

    public void setColor(Color c)
    {
        color = c;
    }

    public Color getColor()
    {
        return color;
    }

    public void paintIcon(Component c, Graphics g, int x, int y)
    {
        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D.Double circle =new Ellipse2D.Double(x,y,width,height);
        g2.setColor(color);
        g2.fill(circle);
    }
}