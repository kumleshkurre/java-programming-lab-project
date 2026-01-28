import java.util.Scanner;
class Exception2
{
    public static void main(String [] args)
    {
      int cb=10000;
      int wb;
      System.out.println("Current Balance is: "+cb);
      while(true)
      {
      Scanner s1=new Scanner(System.in);
      System.out.println("Enter Amount to withdrow:");
      wb=s1.nextInt();
      try
      {
        if(cb<wb)   //cb kam raha wb throw kardo
        { 
            throw new ArithmeticException("insufficent Bal");
        }
        //cb kam nahi raha raha wb se to nicha ka code chalao
        cb=cb-wb;
        System.out.println("Monney withdrow successfull");
        System.out.println("Current Balance is: "+cb);
    
    }
    catch( ArithmeticException e1)   //ArithmeticException recived
    {
       System.out.println(e1.getMessage ());  //message set (throw) karo
       System.out.println("Current Balance is: "+cb);
    }
    if(cb==0)   //jab teak cb me 0 nahi atahai tab tek chelao
    break;
    }
 }
}

    
