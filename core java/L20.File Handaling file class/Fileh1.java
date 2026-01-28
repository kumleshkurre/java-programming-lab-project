import java.io.*;
class Fileh1
{
    public static void main(String []args) throws IOException
    {
        File f1=new File("amit.text");
        f1.createNewFile();   //file crate hoga
        System.out.println(f1.canWrite());  //file avilable hai to write kar sakte hai (true print hoga)
        System.out.println(f1.exists());  //file exists karte hai kea (true print hoga)
        System.out.println(f1.length());   //file ka undar jo likha hoga uska length print hoga
        System.out.println(f1.getName());     //file ka undar jo likha hoga vo print hoga
   
    }
}