abstract class Bank    //abstrac class ka object nahi benta 
{
     private int b;
    abstract void roi();       //class ka koi bhi membere abstract hai to class ko bhi abstract hona pedta hai 
    Bank()      //construcor
    {
        b=21;
        System.out.println(b+"Bank constructor");
    } 
}
class SavingAc extends Bank
{
    SavingAc()               //construcor
    {
        System.out.println("Saving constructor");
    }
   void roi()
   {
    System.out.println("Child function of Saving");
   }
}
 class CurrentAc extends Bank
{
    CurrentAc()   //construcor  is leya bena rahi hai keo ke ham abstract calss ka private memb. ko accsess kar sake
    //                 keo ki abstract class ka object nahi benta 
    {
        System.out.println("Current constructor");
    }
    void roi()
   {
    System.out.println("Child function of Current");
   }
}
class Abs
{
    public static void main(String args[])
    {
        SavingAc s1=new SavingAc();
        //s1.roi();
        CurrentAc c1=new CurrentAc();

    }
}