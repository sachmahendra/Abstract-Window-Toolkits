class Circle{
    public double radius;
    public double area(){
        return Math.PI * radius * radius;
    }
    public double perimeter(){
        return Math.PI * 2 * radius;
    }
    public double circumference(){
        return perimeter();
    }
    }
    
    public class Circle1 {
        public static void main(String[] args) {
            Circle c1 = new Circle();
            Circle c2 = new Circle();
            c1.radius = 7;
            c2.radius = 14;
            System.out.println("Area1 is :"+ c1.area());
            System.out.println("perimeter1 is :"+ c1.perimeter());
            System.out.println("circumference1 is :"+ c1.circumference());
    
            System.out.println("Area2 is :"+ c2.area());
            System.out.println("perimeter2 is :"+ c2.perimeter());
            System.out.println("circumference2 is :"+ c2.circumference());
            
        }
    }
    