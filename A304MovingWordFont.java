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
        g.setFont(new Font("Times New Doman",Font.BOLD,30));
        g.drawString("I LOVE YOU",x, y);

    }
}

public class A304MovingWordFont {
    public static void main(String[] args) {
        MyFrame f= new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
}
