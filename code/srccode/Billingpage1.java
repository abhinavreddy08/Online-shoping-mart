package onlineshoping;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class Billingpage1 extends JFrame implements ActionListener
{
	JRadioButton cod,cred;
	JButton b1,b2;
	ButtonGroup bg;
	ImageIcon icon,icon1,icon2;
	JLabel l,l4,l5;
	String s1;
	Billingpage1(String s)
	{this.s1=s;
		Container c = this.getContentPane();
		c.setLayout(null);
        c.setBackground(Color.white);
		cod = new JRadioButton("cash on delivery",true);
		cred = new JRadioButton("credit card or debit card");
		b1 = new JButton("Back");
		b2 = new JButton("Submit"); 

		icon = new ImageIcon("C:\\Users\\M.Abhinav Reddy\\Downloads\\javaproject\\edit\\d.jpeg");
		icon1 = new ImageIcon("C:\\Users\\M.Abhinav Reddy\\Downloads\\javaproject\\edit\\e.jpeg");
		icon2 = new ImageIcon("C:\\Users\\M.Abhinav Reddy\\Downloads\\javaproject\\edit\\c.jpeg");
		 Image i=icon.getImage();
		 Image i1=icon1.getImage();
		 Image i2=icon2.getImage();
		   Image newimg1 = i.getScaledInstance(700,700,  java.awt.Image.SCALE_SMOOTH ) ;  
		   Image newimg2 = i1.getScaledInstance(200,200,  java.awt.Image.SCALE_SMOOTH ) ;
		   Image newimg3 = i2.getScaledInstance(200,200,  java.awt.Image.SCALE_SMOOTH ) ;
		 icon= new ImageIcon( newimg1 );
		 icon1= new ImageIcon( newimg2 );
		 icon2= new ImageIcon( newimg3 );
		 l=new JLabel(icon);
		 l4=new JLabel(icon1);
		 l5=new JLabel(icon2);
		cod.setBounds(900,100,200,30);
		cred.setBounds(900,300,250,50);
		b1.setBounds(900,500,100,50);
		b2.setBounds(1100,500,100,50);
        l.setBounds(0,0,700,700);
        l4.setBounds(700,0,200,200);
        l5.setBounds(700,200,200,200);
		bg = new ButtonGroup();
		bg.add(cod);
		bg.add(cred);
        c.add(l4);
		c.add(cod);
		c.add(cred);
		c.add(b1);
		c.add(b2);
        c.add(l);
        c.add(l5);
		cod.addActionListener(this);
		cred.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);


	}
	public void actionPerformed(ActionEvent ae)
	{
		String s = ae.getActionCommand();
		if(s == "Back")
		{
			dispose();
		}
		else if(s == "Submit")
		{
			if (cod.getModel().isSelected()) 
			{ JOptionPane.showMessageDialog(null,"please pay"+" "+s1+"rupees   to the delivery agent");
				EndPage ep = new EndPage();
		        ep.setSize(1920,1080);
		        ep.setVisible(true);
		        ep.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			}
			else
			{
				JOptionPane.showMessageDialog(null,"its very complicated right, when banks are involved we are currently working on it");
			}
		}
	}
	}