import java.util.*;
class Array
{
    public static void main (String args[])
    {
        int s=0,i;
      Scanner s1=new Scanner(System.in);
      int a[]=new int [5];                  //5 cloum ka array benao
      System.out.println("Enter 5 Numbers:");
      for(i=0;i<a.length;i++)
      {
        a[i]=s1.nextInt();
        s=s+a[i];
      }
      System.out.println("Average is "+s);

    }
}