import java.util.*;
import java.awt.*;
import java.text.*;
import javax.swing.*;
import javax.swing.text.NumberFormatter;

class MyFrame extends JFrame
{
    MyFrame()
    {
        JTextField tf1= new JTextField();

        DateFormat df= new SimpleDateFormat("dd/MM/yyyy"); // IT IS USE FOR DATE FORMATTER
        JFormattedTextField tf2=new JFormattedTextField(df);
        tf1.setColumns(15);
        tf2.setValue(0);

        NumberFormat nf= NumberFormat.getCurrencyInstance(Locale.US);
      //  NumberFormat nf= NumberFormat.getInstance();
        NumberFormatter nft= new NumberFormatter(nf);
        nft.setAllowsInvalid(false); // USE TO SET ONLY NUMBER ARE ALLOWED
        nft.setMaximum(10000);   //USE TO SET MAX VALUSE 
        JFormattedTextField tf3= new JFormattedTextField(nft);

        tf3.setColumns(15);
        tf3.setValue(0) ;

        setLayout(new FlowLayout());
        add(tf1);
        add(tf2);
        add(tf3);

    }
}

public class A308JTextfeildJFormatedTextField {
    public static void main(String[] args) {
        MyFrame f= new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
}
