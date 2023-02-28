import java.awt.*;
class MyFrame extends Frame implements Runnable{
    int x,y,tx,ty;

    MyFrame(){
        x=100;
        y=100;
        tx=ty=1;

        Thread t= new Thread(this);
        t.start();
    }

    public void paint(Graphics g){
        g.setColor(Color.RED);
      // g.fillOval(x, y, 50, 50);
       // g.(x, y, 50, 50);
       // g.drawString("I LOVE YOU", x,y);
       g.setFont(new Font("Times New Doman",Font.BOLD,30));
       g.drawString("I LOVE YOU",x, y);
    }

    public void run()
    {
         while(true){
            x+=tx;
            y+=ty;

            if(x<10 || x>380)
              tx=tx*-1;
            if(y<40 || y>370)
              ty=ty*-1;  
              repaint();
 
              try{Thread.sleep(30);} catch(Exception e){}

        }
        }
    }


public class A305Animation2 {
    public static void main(String[] args) {
        MyFrame f= new MyFrame();
        f.setSize(500,400);
        f.setVisible(true);
    }
}
