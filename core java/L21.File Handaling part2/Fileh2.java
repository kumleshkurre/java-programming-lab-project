import java.io.*;
class Fileh2
{
    public static void main(String []args) throws IOException
    {
        //File f1=new File("amit.text");
        // FileOutputStream fo1=new FileOutputStream(f1,true);  //object beno purana data delete na ho is leya  //                                                  true ka use hai 
        FileOutputStream fo1=new FileOutputStream("amit.text",true); 
        String s1="kurre computers";           //String s1 me coding rekha 
        char c1[]=s1.toCharArray();   //String s1 ko converd kera array me
        int i;
        for(i=0;i<c1.length;i++)
        {
            fo1.write(c1[i]);    //write karo
        }
        fo1.close();
    }
}