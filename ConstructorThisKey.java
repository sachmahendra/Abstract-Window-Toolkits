class Ractangle1{

    int length ;
    int breadth;

    Ractangle1(int length, int breadth){
        this.length = length;
        this.breadth = breadth;

    }
    void display(){
        System.out.println("Length: "+ this.length);
        System.out.println("Breadth: "+this.breadth);
    }
    
}
public class ConstructorThisKey {
    public static void main(String[] args) {
        Ractangle1 c = new Ractangle1(5,10);
         c.display();

    }
}
