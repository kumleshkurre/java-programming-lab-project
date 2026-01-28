class Samsung
{
    int mic;         //imv
    int speaker;
    int camera;
    int music;
    static int ram;      //pahle ban geya (obejct ka ne bane par be ban jata hai)
	
	// यह instance member function hai
    void setRadio()  //imf
    {
       System.out.println("Radio set successfully");
    }
    void setWallpaper()
    {
       System.out.println("Wallpaper set successfully");
    }
}
class SIExample
{
    public static void main (String []args)
    {
        Samsung s1=new Samsung();   //calss refrece variable 
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
        s1.ram=2;               //same class ke variable ko access kar sakte hai
         System.out.println(s1.ram); 


         /*Samsung s2=new Samsung();   //calss refrece variable 
        s2.mic=21;
        s2.speaker=1;
        s2.camera=50;
        s2.music=10;
        System.out.println(s2.mic);
        System.out.println(s2.speaker);
        System.out.println(s2.camera);
        System.out.println(s2.music);
        s2.setRadio();
        s2.setWallpaper();*/
    }
}