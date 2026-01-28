class Cla
{
    public static void main (String []args)
    {
        int i,s=0;
        for (i=0;i<args.length;i++)
        {
        //System.out.println(args[i]);       //String type array
           s=s+Integer.parseInt(args [i]);    //Integer.parseInt data ko int type ka data me convert kerta hai
        }
        System.out.println("Sum is "+s);
        
    }
}