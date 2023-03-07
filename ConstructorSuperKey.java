class Ractangle{
    int length;
    int breadth;
    int x= 10;
    Ractangle(int length,int breadth){
        this.length = length;
        this.breadth = breadth;

    }
    }
        class Cuboid extends Ractangle{
            int height; 
            int x=20;
            Cuboid(int length,int breadth,int height){
                super(length,breadth);
                height = height;
        
            }
            void display(){
                System.out.println(super.x);
                System.out.println(x);
            }
 }

public class ConstructorSuperKey {
    public static void main(String[] args) {
        Cuboid c = new Cuboid(5,5,10);
        c.display();
        
    }
}
