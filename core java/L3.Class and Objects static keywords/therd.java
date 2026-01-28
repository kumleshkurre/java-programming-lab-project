class B
{
    int x;    //instance member variable
    int y;
   private static int z;
   static void f1()
   {
     z=5;
     
   }
    public static void main(String args[])
    {
         

        B.z=123;      //B class ke z me 123 ko rakho 
        B a1=new B();
        //a1.z=13;      //same class ke variable ko access kar sakte hai
       // B.f1();     //static function calling
       System.out.println(z);

    }
}