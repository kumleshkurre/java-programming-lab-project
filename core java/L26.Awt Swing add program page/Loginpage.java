import javax.swing.*;
import java.awt.event.*;   //event handaling
import java.awt.*;
class Loginpage extends JFrame
{
        JLabel l1,l2,l3;      //imv
        JTextField t1,t2;
        JButton b1,b2,b3;
   
    Loginpage(String s1)           //constructor
    {
        super (s1);
    }
    Loginpage()
    {  }
    void setComponents()
    {
        l1=new JLabel("Username");
        l2=new JLabel("Password");
        t1=new JTextField();
        t2=new JTextField();
        b1=new JButton("Login");
        b2=new JButton("Clear"); 
        b3=new JButton("Add");
        l3=new JLabel();

        ImageIcon ii1=new ImageIcon("C:/Users/kurre computers/Documents/Zero to Hero 3.0/core java/j1.png");
        l1.setIcon(ii1);

        add(l1);
        add(b2);
        add(l2);
        add(t1);
        add(t2);
        add(b1);
        add(l3);
        add(b3);
        setLayout(null);
        l1.setBounds(100,100,120,30);
        l2.setBounds(100,220,120,30);
        t1.setBounds(300,100,120,30);
        t2.setBounds(300,220,120,30);
        b1.setBounds(300,350,120,30);
        b2.setBounds(450,350,120,30);
        l3.setBounds(100,420,150,30);
        b3.setBounds(650,350,150,30);
        b1.addActionListener(new Log());
        b2.addActionListener(new Clear());
        b3.addActionListener(new Add());
         b3.addMouseListener(new Mouse());
    }
    public static void main(String []args)
    {
        Loginpage log1=new Loginpage("Coding Seekho");
        log1.setVisible(true);
        log1.setSize(500,400);
        log1.setComponents();
        log1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        log1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
          class Log implements ActionListener  //inerclass
       {
        public void actionPerformed(ActionEvent e1)   
            {
            String s1=t1.getText();
            String s2=t2.getText();
            if(s1.equals("admin") && s2.equals("1234"))
            {
                l3.setText("Login successfull");
            }
            else
            {
                l3.setText("Login Unsuccessfull");   
            }
        }
       }
         class Clear implements ActionListener
       {
         public void actionPerformed(ActionEvent e1) 
         {
           t1.setText("");
           t2.setText("");
           l3.setText("");
         }  
       }
       class Add implements ActionListener
       {
         public void actionPerformed(ActionEvent e1) 
         {
           int x=Integer.parseInt(t1.getText());
           int y=Integer.parseInt(t2.getText());
           int z=x+y;
           l3.setText("Addition is "+z);
         }  
       }
       class Mouse implements MouseListener
       {
         public void  mouseExited(MouseEvent e1)
         {
           b3.setBackground(Color.GREEN);
         }
         public void mouseEntered(MouseEvent e1)
        {
          b3.setBackground(Color.RED);
        }
        public void  mouseReleased(MouseEvent e1)
        {

        }
        public void mousePressed(MouseEvent e1)
        {
            b1.setBackground(Color.RED);
        }
        public void mouseClicked(MouseEvent e1)
        {
          b3.setBackground(Color.BLUE);
        } 
       }

    }