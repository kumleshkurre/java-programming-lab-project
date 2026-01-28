class Nokia1
{
void setMic()     //function ka name same megar arguments alag alag use function overloding kahte hai
{
  System.out.println("Parent Mic set successfull");  //campailer ko yea disaid karna padhe raha hai ki mai kes wale 
  //                                              version ko chalau use polymorfisiom kahte 
}
}
class Nokia2 extends Nokia1     //Nokia1 ka member ko Nokia2 me lao
{
    void setMic()           //function ka name same megar arguments bhi same use function overraiding kahte hai 
    {
        System.out.println("Child Mic set successfull");  //function overraiding same class me nahi hote hai
    }
void setMusic()
{
    System.out.println("Music set successfull");
}
}
class Funover
{
    public static void main(String args[])
    {
       Nokia2 n2=new Nokia2();
       n2.setMic();
       //n2.setMusic();

    }
} 