/*

import java.util.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame{
    MyFrame()
    {
        super("Adapter Demo");
        addWindowListener(new MyWindowAdapter());

    }
    class MyWindowAdapter extends WindowAdapter{
        public void windowClosing(WindowEvent we)
        {
            System.exit(0);
        }
    }
}

public class A301AdapterClasses {
    public static void main(String[] args) {
        
        MyFrame f= new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
}


 */
//ANOTHER METHOD FOR THE SAME CODE WE CAN MAKE A SEPERATE CLASS FOR WINDOWADAPTER


import java.util.*;
import java.awt.*;
import java.awt.event.*;



class MyWindowAdapter extends WindowAdapter{
    public void windowClosing(WindowEvent we)
    {
        System.exit(0);
    }
}



class MyFrame extends Frame{
    MyFrame()
    {
        super("Adapter Demo");
        addWindowListener(new MyWindowAdapter());
    }
}
public class A301AdapterClasses {
    public static void main(String[] args) {
        
        MyFrame f= new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
}
