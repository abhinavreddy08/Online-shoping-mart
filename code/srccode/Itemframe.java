package onlineshoping;

import java.awt.Image;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Itemframe extends JFrame implements ActionListener{
	ImageIcon icon;
	String name,s;
	int price,cost;
	JButton b,add,back,view;
	JRadioButton r1,r2,r3,r4,r5;
	ButtonGroup bg;
	Container c;
	Itemframe(ImageIcon icon,String name,int price){
		this.setLayout(null);
		this.icon = icon; 
		this.name = name;
		this.price = price;
		c = this.getContentPane();
		c.setBackground(Color.white);
		Image img = icon.getImage() ;  
		Image newimg = img.getScaledInstance(200, 200,  java.awt.Image.SCALE_SMOOTH ) ;  
		icon = new ImageIcon( newimg );
	    b = new JButton(icon);
	    r1 = new JRadioButton("1 kg",false);
	    r2 = new JRadioButton("2 kgs",false);
	    r3 = new JRadioButton("3 kgs",false);
	    r4 = new JRadioButton("4 kgs",false);
	    r5 = new JRadioButton("5 kgs",false);
	    bg = new ButtonGroup();
	    add = new JButton("Add to cart");
	    back = new JButton("Back");
	    view=new JButton("view");
	    bg.add(r1);
	    bg.add(r2);
	    b.setBounds(300,200,200,200);
	    r1.setBounds(520,200,80,20);
	    r2.setBounds(520,240,80,20);
	    r3.setBounds(520,280,80,20);
	    r4.setBounds(520,320,80,20);
	    r5.setBounds(520,360,80,20);
	    back.setBounds(100,500,80,20);
	    add.setBounds(1000,500,100,20);
	    view.setBounds(1000,10,100,20);
	    bg.add(r3);
	    bg.add(r4);
	    bg.add(r5);
	    c.add(b);
	    c.add(r1);
	    c.add(r2);
	    c.add(r3);
	    c.add(r4);
	    c.add(r5);
	    c.add(back);
	    c.add(add);
	    c.add(view);
	    r1.addActionListener(this);
	    r2.addActionListener(this);
	    r3.addActionListener(this);
	    r4.addActionListener(this);
	    r5.addActionListener(this);
	    back.addActionListener(this);
	    add.addActionListener(this);
	    view.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==back) {
			this.dispose();
		}
		else if(ae.getSource()==add) {
			JOptionPane.showMessageDialog(null, "Item is added to cart");
			Listframe.item[Listframe.temp]=name;
			Listframe.price[Listframe.temp]=cost;
			if(r1.isSelected()) {
				Listframe.quantity[Listframe.temp]=1;
				Listframe.quat[Listframe.temp]="kg";}
				else if(r2.isSelected()) {
					Listframe.quantity[Listframe.temp]=2;
					Listframe.quat[Listframe.temp]="kgs";}
				else if(r3.isSelected()) {
					Listframe.quantity[Listframe.temp]=3;
					Listframe.quat[Listframe.temp]="kgs";}
				else if(r4.isSelected()) {
					Listframe.quantity[Listframe.temp]=4;
					Listframe.quat[Listframe.temp]="kgs";}
				else if(r5.isSelected()) {
					Listframe.quantity[Listframe.temp]=5;
					Listframe.quat[Listframe.temp]="kgs";
				}
			Listframe.temp++;
		}
		else if(ae.getSource()==view) {
			CartPage t=new CartPage();
			t.setSize(1920,1080);
			t.setVisible(true);
			t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
			else {
				if(r1.isSelected()) {
					cost = 1*price;
					s = ""+cost;
					text(name,"1 kg",s);
				}
				else {
					if(r2.isSelected()) {
						cost = 2*price;
						s = ""+cost;
						text(name,"2 kgs",s);
					}
					else {
						if(r3.isSelected()) {
							cost = 3*price;
							s = ""+cost;
							text(name,"3 kgs",s);
						}
						else {
							if(r4.isSelected()) {
								cost = 4*price;
								s = ""+cost;
								text(name,"4 kgs",s);
							}
							else{
								if(r5.isSelected()) {
									cost = 5*price;
									s = ""+cost;
									text(name,"5 kgs",s);
								}
							}
						}
					}
				}
			}
		}

	public void text(String name,String quantity,String price){
		Graphics g = c.getGraphics();
		g.setColor(Color.white);
		g.fillRect(800,250,300,100);
		g.setColor(Color.black);
		g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		g.drawString("ITEM", 800, 300);
		g.drawString("Quantity", 900, 300);
		g.drawString("TOTAL PRICE", 1000, 300);
		g.drawString(name, 800, 330);
		g.drawString(quantity, 900, 330);
		g.drawString(price, 1000, 330);
	}

}
