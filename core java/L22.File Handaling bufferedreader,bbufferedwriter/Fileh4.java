import java.io.*;
class Fileh4
{
    public static void main(String []args) throws IOException
    {
       FileWriter f1=new FileWriter("avinash.text");
       BufferedWriter b1=new BufferedWriter(f1);  //BufferedWriter ake sath store kerata hai or 8192bytes ka hota 
       //                                              Buffer ka size ham chud rach sakte hai
       b1.write("Cooding");
       b1.close();
    }
}