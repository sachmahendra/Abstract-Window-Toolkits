import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame
{
    int x=0, y=0;

    MyFrame()
    {
        super("Painting demo");


         /*
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) 
            {
                x=me.getX();
                y=me.getY();
                repaint();
            }
        });

        */

     //IF WE USE THIS PART INSTED OF FROM UPEER COMMENT PART THEN O/P ME OVEL CURSOR KE SATH MOVE KREGA
     
        addMouseMotionListener(new MouseAdapter() {
            public void mouseMoved(MouseEvent me) 
            {
                x=me.getX();
                y=me.getY();
                repaint();
            }
        });


    }
    public void paint(Graphics g){
        g.setColor(Color.RED);
       // g.drawOval(x, y, 50, 50);
        g.fillOval(x, y, 50, 50);

    }
}

public class A304Painting {
    public static void main(String[] args) {
        MyFrame f= new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
}
