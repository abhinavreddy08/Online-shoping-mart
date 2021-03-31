package onlineshoping;

import java.awt.Container;
import java.awt.Image;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Listframea extends JFrame implements ActionListener{
JButton signin;
JButton cart,back;
JButton b[] = new JButton[20];
ImageIcon icon[] = new ImageIcon[20];
Image img[] = new Image[20];
JLabel ca[] = new JLabel[20];
Container c;
	Listframea(){
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
		back = new JButton("Back");
		back.setBounds(50,300,100,30);
		c.add(back);
		back.addActionListener(this);
		cart =new JButton("view cart");
	    cart.setBounds(1000,10,100,20);
	    c.add(cart);
	    cart.addActionListener(this);
	    signin=new JButton("Sign In");
	    signin.setBounds(1200,10,100,20);
	    c.add(signin);
	    signin.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ar) {
		if(ar.getSource() == back) {
			this.dispose();
		}
		else {
		if(ar.getSource()==b[0]) {
			Listframe1a lf=new Listframe1a();
			 lf.setSize(1920,1080);
			 lf.setTitle("Listframe1");
			 lf.setVisible(true);
			 lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		else if(ar.getSource()==cart) {
			JOptionPane.showMessageDialog(null, "Please sign in");
		}
		else if(ar.getSource() == b[1]) {
				Listframe2a lf1=new Listframe2a();
				 lf1.setSize(1920,1080);
				 lf1.setTitle("Listframe1");
				 lf1.setVisible(true);
				 lf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			}
			else if(ar.getSource()==b[2]) {
					
					Listframe3a lf2=new Listframe3a();
					 lf2.setSize(1920,1080);
					 lf2.setTitle("Listframe1");
					 lf2.setVisible(true);
					 lf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
				else if(ar.getSource()==b[3]) {
						Listframe4a lf3=new Listframe4a();
						 lf3.setSize(1920,1080);
						 lf3.setTitle("Listframe1");
						 lf3.setVisible(true);
						 lf3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					}
					else if(ar.getSource()==b[4]){
						Listframe5a lf4=new Listframe5a();
						 lf4.setSize(1920,1080);
						 lf4.setTitle("Listframe1");
						 lf4.setVisible(true);
						 lf4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					}
					else {
						welcomea w=new welcomea();
						 w.setSize(1920,1080);
						 w.setTitle("Listframe1");
						 w.setVisible(true);
						 w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						
					}
					
				}
	}
}
	
