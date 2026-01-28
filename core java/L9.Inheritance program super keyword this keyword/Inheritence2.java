class A
{
   int x; //instence member variable
    
}
class B extends A
{
  
}
class C extends A
{
void fun1()
{
    x=6;    //parent ka x
    System.out.println(x);
}
}
class D extends A
{
    int x;
void fun2()
{
     //x=7;     //caild ka x fist pravity melaga
    // System.out.println(x);
   
    super.x=7;    //parent ka x  parent ko pravity melaga
    System.out.println(super.x);
}
}
class E extends A
{
    int x;   //IMV
void fun3()
{
    /* int x;      //local variable(variable overloding)

       x=7;       //fuction ka undar caild ka x fist pravity melaga
       System.out.println(x);*/

      int x;               //function ka undar variable hota hai use local variable kehate hai       
      this.x=8;           //parent ka x ko fist pravity melaga
      System.out.println(this.x);
    //System.out.println(x);//function ka undar variable hota hai usme kuch rache bena print karenga to error ayega 
}
}
class Inheritence2 
{
    public static void main (String args[])
    {
        B b1=new B();
        b1.x=5;
        System.out.println(b1.x);

        C c1=new C();
        c1.fun1();

        D d1=new D();
        d1.fun2();

         E e1=new E();
        e1.fun3();
        
    } 
}
