import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.geom.*;
import java.awt.event.*;
public class Controller {
    private Model model;
    private View view;
    private ChangeListener changeListener;
    private ActionListener actionListener;

    public Controller(Model m, View v)
    {
        model = m;
        view = v;
    }

    public void control()
    {
        view.circButton().addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent actionEvent){
                view.wipe();
                model.setIcon(new mySquare(20, "Circle"));
                view.reset(model.getIcon());
            }
        });

        view.rectButton().addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent actionEvent){
                view.wipe();
                model.setIcon(new mySquare(20, "Square"));
                view.reset(model.getIcon());
            }
        });

        view.triButton().addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent actionEvent){
                view.wipe();
                model.setIcon(new mySquare(20, "Triangle"));
                view.reset(model.getIcon());
            }
        });

        view.redButton().addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent actionEvent){
                model.setColor(Color.RED);
                view.shift();
            }
        });

        view.blueButton().addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent actionEvent){
                model.setColor(Color.BLUE);
                view.shift();
            }
        });

        view.yellButton().addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent actionEvent){
                model.setColor(Color.YELLOW);
                view.shift();
            }
        });

        view.getSlider().addChangeListener(new ChangeListener(){
            public void stateChanged(ChangeEvent e){
                model.resize(((JSlider)e.getSource()).getValue());
                view.shift();
            }
        });
    }
}

