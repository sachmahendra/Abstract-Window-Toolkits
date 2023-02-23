class Ractangle{
    private double length;
    private double breadth;

    //using get and set method for data hiding

     public double getlength()
     {
        return length;
     }
     public double getbreadth()
     {
        return breadth;
     }
     //using set method 

     public void setlength(double l)
     {
        if(l>=0)
          length = l;
          else
          length = 0;
     }
     public void setbreadth(double b)
     {
        if(b>=0)
           breadth = b;
         else
         breadth = 0;  
     }




    public double area(){
        return length * breadth;
    }
    public double perimeter(){
        return 2 *(length + breadth);
    }
    public boolean isSquare(){
        if(length == breadth){
            return true;
        }
        else{
            return false;
        }
    
    }
    }
    public class RactangleDataHiding {
        public static void main(String[] args) {
            Ractangle r1  = new Ractangle();
            r1.setlength (10.5 );
            r1.setbreadth (5.5);
            System.out.println("area1 is: "+ r1.area());
            System.out.println("perimeter is: "+ r1.perimeter());
            System.out.println("is it a square: "+ r1.isSquare());
            System.out.println("length: "+ r1.getlength());
            System.out.println("breadth: "+ r1.getbreadth());
    
    
            
        }
    }
    