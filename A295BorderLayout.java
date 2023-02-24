import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame{
    Button b1,b2,b3,b4,b5,b6;

    public MyFrame(){
        super("flow layout demo");

        b1=new Button("One");
        b2=new Button("Two");
        b3=new Button("Three");
        b4=new Button("Four");
        b5=new Button("Five");
        b6=new Button("Six");

        add(b1,BorderLayout.NORTH);
       // add(b2,BorderLayout.EAST);
        add(b3,BorderLayout.SOUTH);
        add(b4,BorderLayout.WEST);
        add(b5,BorderLayout.CENTER);
       // add(b6);

       Panel p = new Panel();
       p.setLayout(new GridLayout(3,1));
       p.add(new Button("Monday"));
       p.add(new Button("Tus"));
       p.add(new Button("WED"));

       add(p,BorderLayout.EAST);


    }
}

public class A295BorderLayout {
    public static void main(String[] args) {
        MyFrame f= new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
}

