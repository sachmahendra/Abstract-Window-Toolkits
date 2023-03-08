/* 

// WITHOUT USING SYNCHRONISATION
class ATM{
    public void checkBalance(String name){
        System.out.print(name +" Checking ");

        try{Thread.sleep(1000);}catch(Exception e){}

        System.out.println(" Balence ");
    }

    public void Withdraw(String name,int amount){
      System.out.print(name+" Withdrawing ");
      
      try{Thread.sleep(1000);}catch(Exception e){}
      System.out.println(amount);

    }

}

class Customer extends Thread{
   ATM atm;
   String name;
   int amount;
   Customer(String n,int amt,ATM a ){   //WE USE CONSTRACTOR HERE FOR NAME,AMOUNT ,ATM
    amount = amt;
    name =n;
    
    atm = a;
   }
   public void useATM(){   //CALLING ATM METHOD HERE TO CHECK NAME AND WITHDRAW BALANCE
    atm.checkBalance(name);
    atm.Withdraw(name,amount);
 }
 public void run(){  //BECAUSE IT IS EXTENDS THREAD SO WE USE RUN() TO OVERWRITE MULTITHREADING HERE
         useATM();
 }
   
}

public class ABatmMachineProblem192 {
    public static void main(String[] args) {
        
        ATM atm = new ATM(); //we use this fopr the locality of atm
        Customer c1 = new Customer("mahi",100,atm);

        Customer c2 = new Customer("ishh",200,atm);

        c1.start();
        c2.start();
    }
}

*/

// BY USING SYNCHROISATION

class ATM{
    synchronized public void checkBalance(String name){
        System.out.print(name +" Checking ");

        try{Thread.sleep(1000);}catch(Exception e){}

        System.out.println(" Balence ");
    }

    synchronized public void Withdraw(String name,int amount){
      System.out.print(name+" Withdrawing ");
      
      try{Thread.sleep(1000);}catch(Exception e){}
      System.out.println(amount);

    }

}

class Customer extends Thread{
   ATM atm;
   String name;
   int amount;
   Customer(String n,int amt,ATM a ){   //WE USE CONSTRACTOR HERE FOR NAME,AMOUNT ,ATM
    amount = amt;
    name =n;
    
    atm = a;
   }
   public void useATM(){   //CALLING ATM METHOD HERE TO CHECK NAME AND WITHDRAW BALANCE
    atm.checkBalance(name);
    atm.Withdraw(name,amount);
 }
 public void run(){  //BECAUSE IT IS EXTENDS THREAD SO WE USE RUN() TO OVERWRITE MULTITHREADING HERE
         useATM();
 }
   
}

public class ABatmMachineProblem192 {
    public static void main(String[] args) {
        
        ATM atm = new ATM(); //we use this fopr the locality of atm
        Customer c1 = new Customer("mahi",100,atm);

        Customer c2 = new Customer("ishh",200,atm);

        c1.start();
        c2.start();
    }
}