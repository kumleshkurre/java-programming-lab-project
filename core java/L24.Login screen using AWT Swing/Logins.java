import javax.swing.*;     //import Jframe
import java.awt.*;        //import Fontstyle
class Logins
{
    public static void main(String []args)
    {
        //f1.setTitle("Kumlesh Kurre");
        JFrame f1=new JFrame("Wellcome to Kurre Computers");
        f1.setVisible(true);
        f1.setSize(500,400);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(null);

        Font f2=new Font("Times New Roman",Font.BOLD,28);  //font name,font Bold,font size

        JButton b1=new JButton("Click Me"); // Button create
        b1.setBounds(150,100,100,20);       //button set on size
        f1.add(b1); 

        JTextField  t1=new JTextField();    //input text create
        t1.setBounds(300,100,100,20);       //input text setnon size
        f1.add(t1);                         //jframe f1  me l1 ko add karo

        JLabel l1=new JLabel("LOGIN");    //Login layout create
        l1.setBounds(250,250,150,50);
        f1.add(l1);                      
        l1.setFont(f2);               //setfont style
        l1.setForeground(Color.RED);   //l1 me red color set karo

        Cursor c1=new Cursor(Cursor.HAND_CURSOR);
        Cursor c2=new Cursor(Cursor.CROSSHAIR_CURSOR);
        
        b1.setCursor(c1);
        t1.setCursor(c2);





        
    }
}