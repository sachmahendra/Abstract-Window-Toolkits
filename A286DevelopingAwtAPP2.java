/* 

import java.awt.*;

class MyFrame extends Frame{
    Label l;  // THESE ALL ARE REFERENCES
    TextField tf ;
    Button b;

    public MyFrame(){
        super("MyApp"); // CREATING CONSTRUCTOR

        setLayout(new FlowLayout());

        l= new Label("Name"); // THESE ALL ARE THE OBJEXT OF REFERENCES
        tf=new TextField(20);
        b=new Button("OK");

        add(l);
        add(tf);
        add(b);

    }
}

public class A286DevelopingAwtAPP2 {
    public static void main(String[] args) {
      MyFrame f = new MyFrame();
      f.setSize(400,400);
      f.setVisible(true);
    }
}

*/

//WE CAN MAKE THIS PROGRAM ONLY WITH MAIN CLASS LIKE BELOW

import java.awt.*;


public class A286DevelopingAwtAPP2 extends Frame{

    Label l;  // THESE ALL ARE REFERENCES
    TextField tf ;
    Button b;

    public A286DevelopingAwtAPP2(){
        super("MyApp"); // CREATING CONSTRUCTOR

        setLayout(new FlowLayout());

        l= new Label("Name"); // THESE ALL ARE THE OBJEXT OF REFERENCES
        tf=new TextField(20);
        b=new Button("OK");

        add(l);
        add(tf);
        add(b);

    }
    public static void main(String[] args) {
        A286DevelopingAwtAPP2 f = new A286DevelopingAwtAPP2();
      f.setSize(400,400);
      f.setVisible(true);
    }
}
