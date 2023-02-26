//BY USING FIRST METHOD USIG IMPLEMENTS AFTER EXTENDS
/* 
import java.util.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener
{
    TextField tf;
    Button b;
    int count =0;

    MyFrame()
    {
        super("Event Demo");
        tf=new TextField("0",20) ;
        b=new Button("Click");

        setLayout(new FlowLayout());

        add(tf);
        add(b);
        b.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae)
    {
        count++;
        tf.setText(String.valueOf(count));
    }

}

public class A302DifferentWaysOfHandlingEvent {
    public static void main(String[] args) {
        MyFrame f= new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);

    }
}


*/
// SAME CODE BY USING INEER CLASS


import java.util.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame 
{
    TextField tf;
    Button b;
    int count =0;

    MyFrame()
    {
        super("Event Demo");
        tf=new TextField("0",20) ;
        b=new Button("Click");

        setLayout(new FlowLayout());

        add(tf);
        add(b);
        b.addActionListener(new MyListener());

    }
    class MyListener implements ActionListener
    {
         public void actionPerformed(ActionEvent ae)
    {
        count++;
        tf.setText(String.valueOf(count));
    }
}

}

public class A302DifferentWayOfHandilingEvents {
    public static void main(String[] args) {
        MyFrame f= new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);

    }
}