import java.io.*;
class Exception3
{
    public static void main(String [] args) throws IOException,ClassNotFoundException   // campalier redday
    {
    System.out.println("A");
    try
    {
        throw new IOException(); //agar error aye to campailer tum radday raho handel karne ka leya
        
    }
    catch(IOException il)  //IOException recived
    {
      System.out.println("Exception");
    }
    finally      
    {                        //chahe error aye na aye mai to chalunga
    System.out.println("finally exception");
    }
    }
}
    
