class Ractangle{
    private double length;
    private double breadth;
    public Ractangle(){
        length = 1;
        breadth = 1;
    }
    public Ractangle(double l,double b){
        length=l;
        breadth=b;

    }
    public Ractangle(double s){
        length = breadth = s;
    }
    public double area(){
        return length * breadth;
    }
}



public class RactangleConstruction {
    public static void main(String[] args) {
        Ractangle r = new Ractangle();  //(it take value of length and breadth from line 5 and 6 and also if we dont use line 26)
        //Ractangle r = new Ractangle(10,5);

        System.out.println("area is: "+ r.area());
        
    }
}
