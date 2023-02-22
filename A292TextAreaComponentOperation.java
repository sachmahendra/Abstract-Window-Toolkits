import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener{
    TextArea ta;
    TextField tf;
    Label l;
    Button b;

    MyFrame(){
        super("TextArea Demo");
        l=new Label("No text entered ");
        ta = new TextArea(10,30);
        tf= new TextField(20);
        b= new Button("click");

        setLayout(new FlowLayout());

        add(ta);
        add(l);
        add(tf);
        add(b);

        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae){
       // l.setText(ta.getSelectedText()); //THIS METHOD IS USED TO SELECT SOME PART OF TEXT AND EXTRACTOUT THAT
     //  ta.append(tf.getText()); //use to apend some text in the present text

     ta.insert(tf.getText(), ta.getCaretPosition());//IT IS USED TO INSERT SOME THING AT THE WANTED PLACE IN THE TEXT
    }

}


public class A292TextAreaComponentOperation {
    public static void main(String[] args) {
        
        MyFrame f = new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
}