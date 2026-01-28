class Example
{
    int x;     //instance member variable
    int y;
   void fun1()
    {
       x=5;
       y=6;
    }
    void fun2()
    {
        System.out.println(x);
        System.out.println(y);
    }
    void fun3()
    {
        int p=7,q=-7;    //local variable
        p++;
        q++;
        System.out.println(p);
        System.out.println(q);
    }
   
}
    class Cons1
{ 
    public static void main (String []args)
    {
      Example e1=new Example();       
      e1.fun1();
      e1.fun2();
      e1.fun3();
      
      
    }
}