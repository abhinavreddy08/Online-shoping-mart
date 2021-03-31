package onlineshoping;

import java.awt.Container;
import java.awt.Image;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Listframe extends JFrame implements ActionListener{
	public static  String item[]=new String[16];
	public static int price[]=new int[16];
	public static int quantity[]=new int[16];
	public static String quat[]=new String[16];
	public static int temp=0;
	JButton cart;
	JButton b[] = new JButton[20];
	ImageIcon icon[] = new ImageIcon[20];
	Image img[] = new Image[20];
	JLabel ca[] = new JLabel[20];
	JButton lo;
	Container c;
	Listframe(){
		 c = this.getContentPane();
		
		 this.setLayout(null);
		icon[0]= new ImageIcon("C:\\Users\\M.Abhinav Reddy\\Downloads\\javaproject\\list\\vege.png");
		icon[1]=new ImageIcon("C:\\Users\\M.Abhinav Reddy\\Downloads\\javaproject\\list\\f2.png");
		icon[2]=new ImageIcon("C:\\Users\\M.Abhinav Reddy\\Downloads\\javaproject\\list\\bi.png");
		icon[3] = new ImageIcon("C:\\Users\\M.Abhinav Reddy\\Downloads\\javaproject\\list\\g.png");
		icon[4] = new ImageIcon("C:\\Users\\M.Abhinav Reddy\\Downloads\\javaproject\\list\\be.png");
		for(int i=0;i<5;i++) {
			img[i] = icon[i].getImage() ;  
			Image newi = img[i].getScaledInstance(200, 200,  java.awt.Image.SCALE_SMOOTH ) ;  
			icon[i] = new ImageIcon( newi );
		    b[i] = new JButton(icon[i]);
		    String s = Welcome.t[i];
		    ca[i]= new JLabel(s);
		    b[i].setBounds(200+200*i,100,200,200);
		    ca[i].setBounds(250+200*i,300,200,40);
		    c.add(b[i]);
		    c.add(ca[i]);
		    b[i].addActionListener(this);
		}
		
	   lo = new JButton("Logout");
	    c.add(lo);
	    lo.setBounds(900,10,100,20);
		 lo.addActionListener(this);
	    cart =new JButton("view cart");
	    cart.setBounds(1000,10,100,20);
	    c.add(cart);
	    cart.addActionListener(this);
	    
	}
	
	public void actionPerformed(ActionEvent ar) {
		if(ar.getSource() == lo) {
	   		  Welcome f = new Welcome();
	   		  f.setSize(1920,1080);
					f.setTitle("Login");
					f.setVisible(true);
					f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   	  }
		else {
		if(ar.getSource()==b[0]) {
			Listframe1 lf=new Listframe1();
			 lf.setSize(1920,1080);
			 lf.setTitle("Listframe1");
			 lf.setVisible(true);
			 lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		else if(ar.getSource()==cart) {
			CartPage t=new CartPage();
			t.setSize(1920,1080);
			t.setVisible(true);
			t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		else {
			if(ar.getSource() == b[1]) {
				Listframe2 lf1=new Listframe2();
				 lf1.setSize(1920,1080);
				 lf1.setTitle("Listframe1");
				 lf1.setVisible(true);
				 lf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			}
			else {
				if(ar.getSource()==b[2]) {
					
					Listframe3 lf2=new Listframe3();
					 lf2.setSize(1920,1080);
					 lf2.setTitle("Listframe1");
					 lf2.setVisible(true);
					 lf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
				else {
					if(ar.getSource()==b[3]) {
						Listframe4 lf3=new Listframe4();
						 lf3.setSize(1920,1080);
						 lf3.setTitle("Listframe1");
						 lf3.setVisible(true);
						 lf3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					}
					else {
						Listframe5 lf4=new Listframe5();
						 lf4.setSize(1920,1080);
						 lf4.setTitle("Listframe1");
						 lf4.setVisible(true);
						 lf4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					}
					
				}
					
			}
		}
	}
	}

}