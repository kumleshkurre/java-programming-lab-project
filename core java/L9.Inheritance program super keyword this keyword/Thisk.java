class F 
{
    private int x,y;       //private members ko ham function ke help se access kar sakte hai 
    void setData(int p,int q)
    {  
       x=p;
       y=q;
    }
    void disPlay()
    {
       System.out.println(x+" "+y);
    }
}
class Thisk
{
    public static void main (String agrs[])
    {
      F a1=new F();
      a1.setData(10,20);
      a1.disPlay();
    }
}