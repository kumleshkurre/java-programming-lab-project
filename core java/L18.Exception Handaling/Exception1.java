class Exception1
{
    public static void main(String args[])
    {
        System.out.println("Hii");
        String s1=null;
        try
        {
        System.out.println(s1.length());
        }
        catch(NullPointerException n1)
       // catch(Exception1 n1)
        {
            System.out.println(n1.getMessage());
        }
        /*int x;
        int y;
        int z=x/y;
        System.out.println(z);*/
        System.out.println("Hello");
    }
}