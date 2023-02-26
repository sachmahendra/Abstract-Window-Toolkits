import java.util.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements WindowListener{

    Label l;

    MyFrame(){

    super("Window event demo");

    l= new Label("     ");
    setLayout(new FlowLayout());
    add(l);
     addWindowListener(this);

    }   

    public void windowOpened(WindowEvent e) {
        l.setText("window opened");
    }

    
    public void windowClosing(WindowEvent e) {
        l.setText("window closing");

        System.exit(0);
    }

    
    public void windowClosed(WindowEvent e) {
        l.setText("window closed");
    }

   
    public void windowIconified(WindowEvent e) {
     
        l.setText("window Iconified");
    }

    
    public void windowDeiconified(WindowEvent e) {
        l.setText("window Deiconified");
    }

    public void windowActivated(WindowEvent e) {
        l.setText("window Activated");
    }

    
    public void windowDeactivated(WindowEvent e) {
        l.setText("window Deactivated");
    }
}

public class A300WindowEvent {
    public static void main(String[] args) {
        MyFrame f= new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
}
