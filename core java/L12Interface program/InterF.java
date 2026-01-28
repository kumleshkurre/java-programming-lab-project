interface Bank1
{
    int x=5;  //public static fainal(interface me value pahle inesilaise karne hote hai keoke vo fainal hote hai)
    void fun1();   //public abstract
    static void fun2()   //koi bhe static function kisi or class me inhrret nahi hota
    {
        System.out.println("Static function of interface");
    }
}
class SavingAc implements Bank1 //ham interface me value pahle inselaise kar deta hai isley constructor nahi hota
{
    public void fun1()
    {
        System.out.println("Overridden function");
    }
}
 class InterF
{
    public static void main(String args[])
    {
       SavingAc s1=new SavingAc();
       s1.fun1();
       s1.fun2();
       Bank1.fun2();
    }
}