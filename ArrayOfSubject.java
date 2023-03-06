//CLASS FOR ARRAY OF OBJECT
class Subject{

    //OBJECT PROPERTY METHOD
    private String rollnumber;
    private String name;
    private String dept;
    private String subject;
     
    //OBJECT CONSTRACTOR METHOD
    public Subject(String rollnumber , String name, String dept, String subject){
        this.rollnumber = rollnumber;
        this.name= name;
        this.dept = dept;
        this.subject=subject;
    }

    //USE GET METHOD 
    public String getRollnumber(){
        return rollnumber;
    }
    public String getName(){
        return name;
    }
    public String getDept(){
        return dept;
    }
    public String getSubject(){
        return subject;
    }

    //USE SET METHOD 
    /*  public void setMaxMark(int mm){
        maxMark = mm;
    }
    public void setMarkObtain(int m){
        markObtain = m;
    }
    boolean isQualified(){
        return markObtain >= maxMark/10*4;  
    }*/
    public void setSubject(String abc){
        subject = abc;
    }
    public String toString(){
        return "\nRollnumber : "+rollnumber +"\nName : "+name +"\nDept : "+dept +"\nSubject :"+subject;

    }
}

public class ArrayOfSubject{
    public static void main(String[] args) {
        
        //ARRAY OF OBJECT
        Subject sub[]= new Subject[4];
        sub[0]=new Subject("S101","MAHENDRA","CSE","DS");
        sub[1]=new Subject("S102","NANDESH","EE","MACHINE");
        sub[2]=new Subject("S103","NASIR","ECE","NETWORK");
        sub[2]=new Subject("S103","NASIR","ECE","NETWORK");
       sub[2]=new Subject("S103","NASIR","ECE","NETWORK");

        for(Subject o:sub ){
            System.out.println(o);
        }


        
    }
}

