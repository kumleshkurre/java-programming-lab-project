class Example
{
void fun1()     //function ka name same megar arguments alag alag use function overloding kahte hai
{
  System.out.println("Hellow");    //campailer ko yea disaid karna padhe raha hai ki mai kes wale version ko chalau 
//                                       use polymorfisiom kahte hai
}
void fun1(int x)
{
   System.out.println("Hellow2");
}
void fun1(int x,int y)
{
   System.out.println("Hellow3");
}
}
class Over
{
    public static void main(String args[])
    {
    Example e1=new Example();
    e1.fun1();
    e1.fun1(4);
    e1.fun1(5,6);
    }
} 