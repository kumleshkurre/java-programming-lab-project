class Example
{
    private static int x;        //kisi bhi private static member varable ko access k arne ka leya  
    static int y;                  //static intialzation block benate hai keo ki bena object benaya value 
    static                              //intialz karte hai
    {
        System.out.println(x);       
        x=5;
        System.out.println(x);
    }
}
class Intials
{
    public static void main(String args[])
    {
       Example.y=7;                         //bena object benaye
      System.out.println(Example.y);
    }
}