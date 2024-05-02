import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class mySquare implements Icon {
    private int width, height, size;
    private Color color;
    private String shape;

    public mySquare(int s,String s2)
    {
        shape = s2;
        this.width = s;
        this.height = s;
        this.size = s;
        this.color=Color.YELLOW;
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
        size = x;
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
        if(this.shape.equalsIgnoreCase("SQUARE"))
        {
            Graphics2D g2 = (Graphics2D) g;
            Rectangle2D.Double rectangle =new Rectangle2D.Double(x,y,width,height);
            g2.setColor(color);
            g2.fill(rectangle);
        }
        else if(this.shape.equalsIgnoreCase("CIRCLE"))
        {
            Graphics2D g2 = (Graphics2D) g;
            Ellipse2D.Double rectangle =new Ellipse2D.Double(x,y,width,height);
            g2.setColor(color);
            g2.fill(rectangle);
        }
        else if(this.shape.equalsIgnoreCase("TRIANGLE"))
        {
            Graphics2D g2 = (Graphics2D) g;
            int[] p={0,size/2,size}; //x-coordinates of vertexes
            int[] q={size,0,size}; //y coordinates of the vertexes
            Polygon tri = new Polygon(p,q, 3);
            g2.setColor(color);
            g2.fill(tri);
        }
    }
}
