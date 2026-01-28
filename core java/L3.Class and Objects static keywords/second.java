class A
{
    int x;    //non-static instance member variable 
    int y;
   static int z;     //pahle ban geya (obejct ka ne bane par be ban jata hai)
   
    void f1()     //instance member variable non-static function

    {
        System.out.println("Fun1 executed");
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String args[])
    {
        A a1=new A();
        a1.x=3;
        a1.y=4;
        a1.f1();
        a1.z=5;          //s1 z me 5 rakh do
        System.out.println(z);

        A b1=new A();
        b1.x=5;
        b1.y=80;
        A.z=100;
        b1.f1();
        System.out.println(z);
    }
}