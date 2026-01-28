class Samsung1
{
    int mic;         //imv
    int speaker;
    int camera;
    int music;
    private static int ram;   
    static void f1()
    {
        ram=2;
        System.out.println(ram);
    }   
    void setRadio()  //imf
    {
       System.out.println("Radio set successfully");
    }
    void setWallpaper()
    {
       System.out.println("Wallpaper set successfully");
    }
}
class Sexample
{
    public static void main (String []args)
    {
        Samsung1 s1=new Samsung1();   //calss refrece variable 
        s1.mic=21;
        s1.speaker=1;
        s1.camera=50;
        s1.music=10;
        System.out.println(s1.mic);
        System.out.println(s1.speaker);
        System.out.println(s1.camera);
        System.out.println(s1.music);
        s1.setRadio();
        s1.setWallpaper();
        s1.f1();                 //function calling(object)
        
        Samsung1.f1();    //bena object benaye function calling (Samsung1 class me jo f1 name ka function hai usko 
        //chelao jeska leya function static type ka hona jaruri hai )


    }
}