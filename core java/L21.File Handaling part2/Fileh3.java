import java.io.*;
class Fileh3
{
    public static void main(String []args) throws IOException
    {
       FileInputStream f1=new FileInputStream("amit.text");
       
      /* int g=0;
       while(g!=-1)
       {
         g=f1.read();
       System.out.print((char)g);
       }*/
      int g;
     
      do
      {
        g=f1.read();
        if(g!=-1)
        {
          System.out.print((char)g);
        }
      } while(g!=-1);
    }
}