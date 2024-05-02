import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.geom.*;

public class Model
{
    private int size;
    private mySquare s;

    public Model(mySquare icon)//(int w, int h)
    {
        s=icon;
    }

    public void resize(int x)
    {
        s.setSize(x);
    }

    public void setIcon(mySquare icon)
    {
        s=icon;
    }

    public mySquare getIcon()
    {
        return s;
    }

    public void setColor(Color c)
    {
        this.getIcon().setColor(c);
    }
}