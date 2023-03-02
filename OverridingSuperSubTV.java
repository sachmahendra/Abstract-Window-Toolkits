import javax.swing.plaf.synth.SynthStyle;

class TV{
    public void SwitchOn(){
        System.out.println("TV is switchOn");
    }
    public void changeChanal(){
        System.out.println("TV chanal is changed");
    }
}
class SmartTV extends TV{
    @Override
    public void SwitchOn(){
        System.out.println("Smart tv is switch on");
    }
    @Override
    public void changeChanal(){
        System.out.println("smart tv chanal is changed");
    }
    public void browse(){
        System.out.println("browser search the thing");
    }
}

public class OverridingSuperSubTV {
    public static void main(String[] args) {
       /*  TV t = new TV();
        t.SwitchOn();

       SmartTV s =new SmartTV();
       s.changeChanal(); */

        // DYNAMIC METHOD DISPATCH USES HERE ESLIYE SUB CLASS IS CALLED HERE NOT SUPER CLASS

       TV t1 = new SmartTV();
       // t1.browse();  // YNHA PE YE WRONG SHOW HO RHA HAI KYUKI TV CLASS ME BROWSE METHOD HAI HI NHI 
       t1.changeChanal();

    }
}
