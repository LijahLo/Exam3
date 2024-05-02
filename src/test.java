import javax.swing.*;

class test {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Model m = new Model(new mySquare(20, "mySquare"));
                View v = new View(m.getIcon());

                Controller c = new Controller(m, v);
                c.control();
            }
        });
    }
}