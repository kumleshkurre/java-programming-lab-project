import java.io.*;
class Fileh5
{
    public static void main(String []args) throws IOException
    {
       FileReader f1=new FileReader("avinash.text");
       BufferedReader b1=new BufferedReader(f1);     //File se Buffer me data ake sath ajata hai
       /*System.out.print(b1.readLine());
       int g;
       while((g=b1.read())!=-1)      //jab tak read ka ro tabtak -1 na ajaye tab tak chlao
       {
          System.out.print((char)g);            
       }*/
       char c1[]=new char[20];
       b1.read(c1,2,6);          //c1 me 6 cloum hai usmes ka 2 clolum ko chodh do        
       System.out.println(c1[0]);
       System.out.println(c1[1]);
       System.out.println(c1[2]);
       System.out.println(c1[3]);
       System.out.println(c1[4]);
   }
}