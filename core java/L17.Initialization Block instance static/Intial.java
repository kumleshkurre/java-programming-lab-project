class Example
{
   private int x;    
  {                                //gisaka koi name hai nahi ho initialzation kahte hai
    System.out.println(x);
    x=22;
  }
  {
      System.out.println(x);
       x=6;
  }
  {
      System.out.println(x);
  }
  Example()
  {
     x=2;
      System.out.println(x);
  }
}
class Intial
{
    public static void main(String args[])
    {
      Example e1=new Example();
    }
}