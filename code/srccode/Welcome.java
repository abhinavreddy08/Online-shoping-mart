package onlineshoping;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Welcome extends JFrame implements ActionListener {
	JButton b1,b2,b3,b4;
	Container c;
	ImageIcon icon,icon1;
	JLabel l,l4,l5;
	public static String uid[]=new String[8];
	public static String pwd[]=new String[8];
	public static  String admin[] = {"admin@gmail.com"};
    public static String password[] = {"admin"};
    public static String vege[] = new String[16];
    public static int vege_price[] = new int[16];
    public static int type_vege =4;
    public static String fr[] = new String[16];
    public static int fr_price[] = new int[16];
    public static int type_fr =4;
    public static String g[] = new String[16];
    public static int g_price[] = new int[16];
    public static int type_g =4;
    public static String ch[] = new String[16];
    public static int ch_price[] = new int[16];
    public static int type_ch =4;
    public static String b[] = new String[16];
    public static int b_price[] = new int[16];
    public static int type_b =4;
    public static String t[] = new String[5];
	public static int temp=2;
Welcome()
{
	c=this.getContentPane();
	c.setBackground(Color.white);
	 icon = new ImageIcon("C:\\Users\\M.Abhinav Reddy\\Downloads\\javaproject\\edit\\a.jpeg");
	 icon1 = new ImageIcon("C:\\Users\\M.Abhinav Reddy\\Downloads\\javaproject\\edit\\b.jpeg");
	 Image i=icon.getImage();
	 Image i1=icon1.getImage();
	   Image newimg1 = i.getScaledInstance(1920,500,  java.awt.Image.SCALE_SMOOTH ) ;  
	   Image newimg2 = i1.getScaledInstance(400,300,  java.awt.Image.SCALE_SMOOTH ) ;
	 icon= new ImageIcon( newimg1 );
	 icon1= new ImageIcon( newimg2 );
	 l=new JLabel(icon);
	 l4=new JLabel(icon1);  
	b1=new JButton("sign in");
	b2=new JButton("sign up");
	b3=new JButton("lets go");
	b4 = new JButton("Admin Login");
    JLabel l1=new JLabel("new user ?");
    JLabel l2=new JLabel("Already a user?");
    JLabel l3=new JLabel("skip login");
    JLabel l5 = new JLabel("Admin login");
	c.setLayout(null);
	 uid[0]="abc@gmail.com";
     uid[1]="abcd@gmail.com";
	pwd[0]="hai";
	pwd[1]="hi";
	l1.setBounds(210,520,70,30);
	l2.setBounds(60,520,90,30);
	l3.setBounds(360,520,70,30);
	b1.setBounds(50,550,100,30);
	b2.setBounds(200,550,100,30);
	b3.setBounds(350,550,100,30);
	b4.setBounds(500,550,150,30);
	l.setBounds(0,0,1920,500);
	l4.setBounds(1300,450,400,300);
	l5.setBounds(530,520,150,30);
	c.add(l1);
	c.add(l2);
	c.add(b1);
	c.add(b2);
	c.add(b3);
	c.add(b4);
	c.add(l3);
	c.add(l);
	c.add(l4);
	c.add(l5);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
}
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==b1) {
	Login f = new Login(uid,pwd,temp);
	f.setSize(1920,1080);
	f.setTitle("Login");
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}
	else if(e.getSource()==b2){
		Rform f = new Rform(uid,pwd,temp);
		f.setSize(1920,1080);
		f.setTitle("Login");
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	else if(e.getSource()==b3) {
		 Listframea f1=new Listframea();
		 f1.setSize(1920,1080);
		 f1.setTitle("ListFrame");
		 f1.setVisible(true);
		 f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	else {
		Login f = new Login(admin,password,1);
		f.setTitle("Login");
		f.setSize(1920,1080);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
	public static void main(String[] args) {
Welcome w=new Welcome();
w.setSize(1920,1080);
w.setTitle("Login");
w.setVisible(true);
w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
uid[0]="abc@gmail.com";
uid[1]="abcd@gmail.com";
pwd[0]="hai";
pwd[1]="hi";
Welcome.vege[0] = "onion";
Welcome.vege[1] = "tomato";
Welcome.vege[2] = "potato";
Welcome.vege[3] = "bottlegaurd";
Welcome.vege_price[0] = 20;
Welcome.vege_price[1] = 25;
Welcome.vege_price[2] = 15;
Welcome.vege_price[3] = 10;
Welcome.fr[0] = "pomogranate";
Welcome.fr[1] = "watermelon";
Welcome.fr[2] = "apple";
Welcome.fr[3] = "mango";
Welcome.fr_price[0] = 60;
Welcome.fr_price[1] = 50;
Welcome.fr_price[2] = 150;
Welcome.fr_price[3] = 250;
Welcome.ch[0] = "sneakers";
Welcome.ch[1] = "oreo";
Welcome.ch[2] = "cookies";
Welcome.ch[3] = "silk";
Welcome.ch_price[0] = 45;
Welcome.ch_price[1] = 30;
Welcome.ch_price[2] = 80;
Welcome.ch_price[3] = 120;
Welcome.g[0] = "urad dal";
Welcome.g[1] = "moong dal";
Welcome.g[2] = "toor dal";
Welcome.g[3] = "chana dal";
Welcome.g_price[0] = 145;
Welcome.g_price[1] = 300;
Welcome.g_price[2] = 112;
Welcome.g_price[3] = 350;
Welcome.b[0] = "coca cola";
Welcome.b[1] = "mountaindew";
Welcome.b[2] = "redbull";
Welcome.b[3] = "monster";
Welcome.b_price[0] = 35;
Welcome.b_price[1] = 25;
Welcome.b_price[2] = 120;
Welcome.b_price[3] = 90;

	t[0]= "vegetabels";
	t[1]="fruits";
	t[2] = "buiscuits and choclates";
	t[3] = "Grocery and stapels";
	t[4] = "Beverges";	}

}