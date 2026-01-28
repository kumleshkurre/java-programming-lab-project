class Process1 extends Thread
{
    public void run()
{
    int i;
    for(i=1;i<=10;i++)
    {
        System.out.println("P1:"+i);
    }
}
}
class Process2 extends Thread
{
    public void run()
{
    int i;
    for(i=1;i<=10;i++)
    {
        System.out.println("P2:"+i);
    }
}
}
 
class MultiT2
{
    public static void main(String args[])
    {
       Process1 p1=new Process1();
       Process2 p2=new Process2();
       p1.start();        //Tread ko chelane ka leya start name ka function pahle se bena hota hai
       p2.start();
     }
}