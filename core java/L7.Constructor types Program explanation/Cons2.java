class Example2
{
    int x;     //instance member variable
    int y;
   
   Example2(int p,int q)   //constuctor ka name same or argument alge aleg to use constructor overloding kahte hai
    {
       x=p;                //parameteraise constructor
       y=q;
    }
    Example2(int f)       //compailer ko compail time pe ye desaid karna pedta hai konse vale version ko chelau use polimorfisiom kahte hai
    {
        x=f;
        y=f;
    }
    Example2()     //default constructor
    {
        x=10;
        y=20;
    }
     void fun2()
    {
        System.out.println(x);
        System.out.println(y);
    }
   
}
    class Cons2
{ 
    public static void main (String []args)
    {
      Example2 e1=new Example2(5,6);       //Example name ka function apne ape chalega or use constructor kahte hai
      Example2 e2=new Example2(7);
      Example2 e3=new Example2();
      e1.fun2();
      e2.fun2();
      e3.fun2();
    
      
    }
}