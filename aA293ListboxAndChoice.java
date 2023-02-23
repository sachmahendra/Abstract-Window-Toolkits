import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ItemListener,ActionListener{
    List l;
    TextArea ta;
    TextField tf;
    Choice c;

    public MyFrame(){
        super("Listbox choice demo");
        l=new List(4,true);
        c=new Choice();
        ta=new TextArea(20,30);

        l.add("monday");
        l.add("tuesday");
        l.add("wednesday");
        l.add("thursday");
        l.add("friday");
        l.add("saturday");
        l.add("sunday");

        c.add("juanuary");
        c.add("february");
        c.add("March");
        c.add("April");

        setLayout(new FlowLayout());
 
        add(l);
        add(c);
        add(ta);

        l.addItemListener(this);
        c.addItemListener(this);
        l.addActionListener(this);
    }

    public void itemStateChanged(ItemEvent ie){
        if(ie.getSource()==l)
          ta.setText(l.getSelectedItem());

        else
          ta.setText(c.getSelectedItem());

    }
    
    public void actionPerformed(ActionEvent ae){
        String  list[] =l.getSelectedItems();
        String txt=" ";

        for(String x:list)
          txt+= x+"\n";
          
          ta.setText(txt);
        
    }

}

public class aA293ListboxAndChoice {
    public static void main(String[] args) {
        
        MyFrame f= new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
