import java.util.*;
class Account     //constructor
{ 
    private int bal;
    void checkBal()
    {
       System.out.println("Current Bal is :"+bal); 
    }
    Account(int b)
    {
        bal=b;
    }
    boolean isSufficientBal(int w)  //inSufficientBal boolean type ka data hai
    {
        if(bal>=w)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
   void withdraw(int wb,String n)
    {
        bal=bal-wb;
        System.out.println("withdraw Successful by " +n);
        System.out.println("Current Bal is :"+bal);
    }
}
class Customer extends Thread
{
    String name;  //imv
    Account a1;   //imv
    Customer(String s1,Account h1)   //constructor
    {
          name=s1;
          a1=h1;
    }
    public void run()
    {
        synchronized(a1)  //ake ke bad ake chaleya use synchronized kahte hai
        {
        System.out.println(name+ " Enter amount to withdraw");
        Scanner s1=new Scanner(System.in);
        int wb=s1.nextInt();
        if(a1.isSufficientBal(wb))
        {
            a1.withdraw(wb,name);
        }
        else
        {
            System.out.println("Insufficent Balance");
            a1.checkBal();
        }
        }
    }
    }
class MultiT3
{
    public static void main(String args[])
    {
        Account a1=new Account(5000);
       Customer c1=new Customer("Ajay",a1);
       Customer c2=new Customer("Vijay",a1);
       c1.start();
       c2.start();
    }
}