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
        b.addActionListener(new ActionListener() { //HERE WE CREATED AN ANONYMOUS CLASS
            public void actionPerformed(ActionEvent ae)
            {
                count++;
                tf.setText(String.valueOf(count));
            }
        });

    }
    

}

public class A302HandilingEventBYAnonymus {
    public static void main(String[] args) {
        MyFrame f= new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);

    }
}