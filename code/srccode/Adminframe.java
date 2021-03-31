package onlineshoping;

import java.awt.Color;
import java.awt.Container;
import java.awt.Image;

import java.awt.event.*;
import javax.swing.*;


public class Adminframe extends JFrame implements ActionListener {
	
	
	JButton b[] = new JButton[20];
	ImageIcon icon[] = new ImageIcon[20];
	Image img[] = new Image[20];
	JLabel ca[] = new JLabel[20];
	JButton lo;
	Container c;
	Adminframe(){
		 c = this.getContentPane();
		 lo = new JButton("logout");
		 c.setBackground(Color.white);
		 this.setLayout(null);
		 lo.setBounds(900,10,100,50);
		 lo.addActionListener(this);
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
		    String s2 = Welcome.t[i];
		    ca[i]= new JLabel(s2);
		    b[i].setBounds(200+200*i,100,200,200);
		    ca[i].setBounds(250+200*i,300,200,40);
		    c.add(b[i]);
		    c.add(ca[i]);
		    c.add(lo);
		   b[i].addActionListener(this);
		}
		
	   JLabel l = new JLabel("PLEASE SELECT THE CATEGORY TO ADD AN ITEM TO THE RESPECTIVE CATEGORY");
	    l.setBounds(200,350,500,50);
	   c.add(l);
	    
	}
	public void actionPerformed(ActionEvent ae) {
		 if(ae.getSource() == lo) {
   		  Welcome f = new Welcome();
   		  f.setSize(1920,1080);
				f.setTitle("Login");
				f.setVisible(true);
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	  }
		 else {
			 
		 
			 for(int i=0;i<5;i++) {
				 if(ae.getSource() == b[i]) {
				 
					 Additem f = new Additem(Welcome.t[i]);
				
					 f.setSize(1920,1080);
					 f.setTitle("Add Item");
					 f.setVisible(true);
					 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 }
			}
		}
	}
	
}