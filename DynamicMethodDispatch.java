class Super{
    public void meth1(){
        System.out.println("Meth1");
    }
    public void meth2(){
        System.out.println("Meth2");
    }
}
class Sub extends Super{

    @Override
    public void meth2(){    // METHOD OVERRIDING
        System.out.println("Sub Meth2");
    }
    public void meth3(){
        System.out.println("sub Meth3");
    }

}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        /* Super sup = new Super();
        sup.meth1();
        sup.meth2(); */

       /*  Sub s = new Sub();
        s.meth1();
        s.meth2();
        s.meth3(); */
         Super sup = new Sub();
        sup.meth1();
        sup.meth2();  //OUTPUT WILL COME AS LINE 13 BECAUSE OF DYNAMIC METHOD DISPATCH AND OVERRIDING 


    }
}
