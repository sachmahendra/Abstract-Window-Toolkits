//class of object
class Object{

    //OBJECT PROPERTY METHOD
    private String subID;
    private String name;
    private int maxMark;
    private int markObtain;
     
    //OBJECT CONSTRACTOR METHOD
   
   
    public Object(String subID , String name, int maxMark){
        this.subID = subID;
        this.name = name;
        this.maxMark = maxMark;
    }

    

    //USE GET METHOD 
    public String getSubID(){
        return subID;
    }
    public String getName(){
        return name;
    }
    public int getMaxMark(){
        return maxMark;
    }
    public int getMarkObtain(){
        return markObtain;
    }

    //USE SET METHOD 
    public void setMaxMark(int mm){
        maxMark = mm;
    }
    public void setMarkObtain(int m){
        markObtain = m;
    }
    boolean isQualified(){
        return markObtain >= maxMark/10*4;
    }
    public String toString(){
        return "\nsubID : "+subID +"\nName : "+name +"\nMark Obtain : "+markObtain;

    }
    
    
}

public class ArrayOfObject{
    public static void main(String[] args) {
        
        //ARRAY OF OBJECT
        Object obs[]= new Object[3];
        obs[0]=new Object("S101","datatSructure",100);
        obs[1]=new Object("S102","Algorithm",100);
        obs[2]=new Object("S103","OperatingSystem",100);

        for(Object o:obs ){
            System.out.println(o);
        }


        
    }
}
