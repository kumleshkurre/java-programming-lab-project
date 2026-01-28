class Demo
{
    public static void f1()
    {
        System.out.println("Fun1 executed");
    }
    public static void f2()
    {
        System.out.println("Fun2 executed");
    }
    public static void main(String args[])
    {
        System.out.println("main executed");
        f1();                //function calling
        f2();
    }
}