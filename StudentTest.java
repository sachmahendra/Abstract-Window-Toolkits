class Student{
    public  int roll;
    public String name;
    public String course;
    public int m1, m2, m3;
    public int total(){
        return m1+m2+m3;
    }
    public int average(){
        return (m1+m2+m3)/3;
    }
    public char grade(){
        if(average()>=60){
            return 'A';
        }
        else{
            return 'B';
        }
    }
    public String detail()
   // public String toString()     
    {
        return "roll "+roll +"\n"+ "name "+name+"\n"+"course "+course +"\n";
}
}
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll=1;
        s1.name = "mahi";
        s1.course = "cse";
        s1.m1=70;
        s1.m2=80;
        s1.m3=65;
        System.out.println("total number is: "+s1.total());
        System.out.println("average number is: "+s1.average());
        System.out.println("grade is: "+s1.grade());
      System.out.println("detail of student is: "+s1.detail());
        //System.out.println("detail of student is: "+s1);
        
    }

}
