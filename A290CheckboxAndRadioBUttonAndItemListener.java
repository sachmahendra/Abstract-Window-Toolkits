
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ItemListener {
    Label l;
    Checkbox c1,c2,c3;

    public MyFrame(){
        super("Checkbox Demo ");

        l=new Label("nothing to be written");
        c1=new Checkbox("java");
        c2 = new Checkbox("python");
        c3 = new Checkbox("c#");

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);


        setLayout(new FlowLayout());

        add(l);
        add(c1);
        add(c2);
        add(c3);
    }

    @Override
    public void itemStateChanged(ItemEvent e){

        String str="";

        if(c1.getState())
          str = str+" "+c1.getLabel();
       if(c2.getState())
          str = str+" "+c2.getLabel();
       if(c3.getState())
          str = str+" "+c3.getLabel();

          if(str.isEmpty())
            str="Nothing is selected";

          l.setText(str);
   


    }
}

public class A290CheckboxAndRadioBUttonAndItemListener {
    public static void main(String[] args) {
        
        MyFrame f= new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
}

/* 

//NOW WE WILL SEE THE USE OF RADIOBUTTON (MEANS ONLY ONE OF JAVA,PYTHON,C# CAN BE SELECTED AT A TIME)

import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ItemListener {
    Label l;
    Checkbox c1,c2,c3;
    CheckboxGroup cbg;

    public MyFrame(){
        super("Checkbox Demo ");

        cbg=new CheckboxGroup();

        l=new Label("nothing to be written");
        c1=new Checkbox("java",false,cbg);
        c2 = new Checkbox("python",false,cbg);
        c3 = new Checkbox("c#",false,cbg);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);


        setLayout(new FlowLayout());

        add(l);
        add(c1);
        add(c2);
        add(c3);
    }

    @Override
    public void itemStateChanged(ItemEvent e){

        String str="";

        if(c1.getState())
          str = str+" "+c1.getLabel();
       if(c2.getState())
          str = str+" "+c2.getLabel();
       if(c3.getState())
          str = str+" "+c3.getLabel();

          if(str.isEmpty())
            str="Nothing is selected";

          l.setText(str);
   


    }
}

public class A290CheckboxAndRadioBUttonAndItemListener {
    public static void main(String[] args) {
        
        MyFrame f= new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
}

*/
