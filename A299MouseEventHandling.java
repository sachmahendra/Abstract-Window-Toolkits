import java.util.*;
import java.awt.*;
import java.awt.event.*;


class MyFrame extends Frame implements MouseListener, MouseMotionListener
{
    Label l1,l2;

    MyFrame(){
        super("MouseEvenrt demo");

        l1= new Label("");
        l2=new Label("");

        setLayout(null);

        l1.setBounds(10,50,100,20);
        l1.setBounds(10,100,200,20);

        add(l1);
        add(l2);

        addMouseListener(this);
        addMouseMotionListener(this);

        
    }
    
    public void mouseClicked(MouseEvent e) {
       l1.setText("MouseClicked");
    }
    
    public void mousePressed(MouseEvent e) {
        l1.setText("Mouse Pressed");
    }
    
    public void mouseReleased(MouseEvent e) {
        l1.setText("Mouse Released");
    }
    
    public void mouseEntered(MouseEvent e) {
        l1.setText("Mouse entered");
    }
    
    public void mouseExited(MouseEvent e) {
        l1.setText("Mouse exited");

    }
    public void mouseDragged(MouseEvent e){
        l1.setText("Mouse Dragged");

    }

    public void mouseMoved(MouseEvent e){
        l1.setText("Mouse Moved");
        l2.setText("("+e.getX()+","+e.getY()+")");

    }

}


public class A299MouseEventHandling {
    public static void main(String[] args) {
        MyFrame f= new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
}
