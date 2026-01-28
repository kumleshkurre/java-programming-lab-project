class Process1 implements Runnable
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
class Process2 implements Runnable
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
 
class MultiT1
{
    public static void main(String args[])
    {
       Process1 p1=new Process1();
       Process2 p2=new Process2();
       Thread t1=new Thread(p1);           //Theread name ka class pahle se bena hota hai
       Thread t2=new Thread(p2);
       t1.start();        //Tread ko chelane ka leya start name ka function pahle se bena hota hai
       t2.start();
     }
}