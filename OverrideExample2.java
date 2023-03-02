class Car{
    public void Start(){
        System.out.println("car stsrted");
    }
    public void accelerate(){
        System.out.println("car is accelerated");
    }
    public void changeGear(){
        System.out.println("car gera changed");
    }
}
class Luxarycar extends Car{
    public void changeGear(){
        System.out.println("automatic gear");
    }
    public void openRoof(){
        System.out.println("sun roof is opened");
    }
}

public class OverrideExample2 {
    public static void main(String[] args) {
        
        /* Car c = new Car();
        c.Start();
        c.accelerate();
        c.changeGear(); */
        Luxarycar l = new Luxarycar();
        l.Start();
        l.accelerate();
        l.changeGear(); //THIS LINE PRINT AUTOMATIC GEAR NOT PRINT CAR GEAR CHANGED (BECAUSE OF OVERRIDING) AND REST ABOVE TWO PRINT SAME AS LINE 25,26
        l.openRoof();
        
    }
}
