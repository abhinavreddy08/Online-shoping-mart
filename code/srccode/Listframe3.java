package onlineshoping;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Listframe3 extends JFrame implements ActionListener{
	JButton b5,cart;
	
	JComboBox cb;
	Container c;
	String s="";
	
	
	JButton b[] = new JButton[20];
	ImageIcon icon[] = new ImageIcon[20];
	Image img[] = new Image[20];
	JLabel ca[] = new JLabel[20];
	Listframe3(){
	c=this.getContentPane();
	this.setLayout(null);
	 icon[0] = new ImageIcon("C:\\Users\\M.Abhinav Reddy\\Downloads\\javaproject\\choclates\\s.jpeg");
	icon[1] = new ImageIcon("C:\\Users\\M.Abhinav Reddy\\Downloads\\javaproject\\choclates\\o.jpeg");
	 icon[2] = new ImageIcon("C:\\Users\\M.Abhinav Reddy\\Downloads\\javaproject\\choclates\\g.jpeg");
	 icon[3] = new ImageIcon("C:\\Users\\M.Abhinav Reddy\\Downloads\\javaproject\\choclates\\d.jpeg");
	 for(int i=0;i<Welcome.type_ch;i++) {
		 if(i>=4) {
			 icon[i] = new ImageIcon("C:\\Users\\M.Abhinav Reddy\\Downloads\\javaproject\\vegetabels\\c.jpng");
		 }
			img[i] = icon[i].getImage() ;  
			Image newi = img[i].getScaledInstance(200, 200,  java.awt.Image.SCALE_SMOOTH ) ;  
			icon[i] = new ImageIcon( newi );
		    b[i] = new JButton(icon[i]);
		    String s1 = Welcome.ch[i] + "  per item  "  + Welcome.ch_price[i] + "rs" ;
		    ca[i]= new JLabel(s1);
		    b[i].setBounds(200+200*i,100,200,200);
		    ca[i].setBounds(250+200*i,300,200,40);
		    c.add(b[i]);
		    c.add(ca[i]);
		    b[i].addActionListener(this);
		}
    b5 = new JButton("Back");
    cb=new JComboBox();
    
    cb.addItem("VEGETABLES");
    cb.addItem("FRUITS");
    cb.addItem("GROCERY AND STAPELS");
    cb.addItem("BEVERAGES");
    
    b5.setBounds(50,600,70,70);
    cb.setBounds(20,50,160,30);
    cart =new JButton("view cart");
    cart.setBounds(1000,10,100,20);
    c.add(cart);
    cart.addActionListener(this);
    
    c.add(cb);
    c.add(b5);
    b5.addActionListener(this);
    cb.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b5) {
			this.dispose();
		}
		else if(e.getSource()==cart) {
			CartPage t=new CartPage();
			t.setSize(1920,1080);
			t.setVisible(true);
			t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		else if(e.getSource()==cb)
		{
			s=(String) cb.getSelectedItem();
			if(s=="VEGETABLES")
			{	Listframe1 lf=new Listframe1();
			 lf.setSize(1920,1080);
			 lf.setTitle("Listframe1");
			 lf.setVisible(true);
			 lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
			else if(s=="FRUITS")
			{
				Listframe2 lf1=new Listframe2();
				lf1.setSize(1920,1080);
				 lf1.setTitle("Listframe1");
				 lf1.setVisible(true);
				 lf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
			else if(s=="GROCERY AND STAPELS")
			{
				Listframe4 lf3=new Listframe4();
				 lf3.setSize(1920,1080);
				 lf3.setTitle("Listframe1");
				 lf3.setVisible(true);
				 lf3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
			else if(s=="BEVERAGES")
			{
				Listframe5 lf4=new Listframe5();
				 lf4.setSize(1920,1080);
				 lf4.setTitle("Listframe1");
				 lf4.setVisible(true);
				 lf4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		}
		else {
			for(int i=0;i<Welcome.type_ch;i++) {
				if(e.getSource()==b[i]) {
				 Itemframe1 f= new Itemframe1(icon[i],Welcome.ch[i],Welcome.ch_price[i]);
				f.setSize(1920,1080);
				f.setTitle("Login");
				f.setVisible(true);
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
			}
		}
	}
}
