class Nokia1        //class ka name same or function ka name same use constructor kahte hai
{
    private int mic;      //private members ko kisi dusre class me access nahi kar sakte hai 
    protected int keypad;  
    Nokia1()
    {
       System.out.println("Parent Class");
    }
    
}
class Nokia2 extends Nokia1   //extends ke help se Nokia1 class ka function ko Nokia2 class me lao
{
   Nokia2()   //compailer kud se super likhtra hai 9super ka metla parent class ko pahle chelao
    {
       System.out.println("Chaild Class");
    }
    
}
class Inheritence
{
    public static void main (String args[])
    {
        Nokia2 n2=new Nokia2();
        n2.keypad=55;
        System.out.println(n2.keypad);
    }
}