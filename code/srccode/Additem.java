package onlineshoping;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
public class Additem extends JFrame implements ActionListener{
	JButton lo,at,back;
	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3;
	Container c;
	static String s1,a,b;
	static int p;
      Additem(String s){
    	  s1 = s;
    	  this.setLayout(null);
    	  c = this.getContentPane();
    	  c.setBackground(Color.white);
    	  Font f = new Font("TimesRoman",Font.BOLD,20);
    	  l1 = new JLabel("Category  " + s);
    	  
    	  l2 = new JLabel("Name of  new item");
    	  l3 = new JLabel("Price of new item");
    	  t2 = new JTextField(50);
    	  t3 = new JTextField(50);
    	  at = new JButton("Add item");
    	  back = new JButton("Back");
    	
    	 l1.setFont(f);
    	 l2.setFont(f);
    	 l3.setFont(f);
    	 l1.setBounds(100,20,300,50);
    	 l2.setBounds(50,100,300,50);
    	 l3.setBounds(50,200,300,50);
    	 t2.setBounds(400,100,150,50);
    	 t3.setBounds(400,200,150,50);
    	    	 at.setBounds(100,350,100,50);
    	 back.setBounds(300,350,100,50);
    	 c.add(l1);
    	 c.add(l1);
    	 c.add(l2);
    	 c.add(l3);
    	 c.add(t2);
    	 c.add(t3);
    	System.out.println(s1);
    	 c.add(at);
    	 c.add(back);
    	 
    	 back.addActionListener(this);
    	 at.addActionListener(this);
    	 t2.addActionListener(this);
    	 t3.addActionListener(this);
    	 
      }
      public void actionPerformed(ActionEvent ae) {
    	  
    	  
    	  		if(ae.getSource() == back) {
    	  			this.dispose();
    	  		}
    	  		else {
    	  			if(ae.getSource() == at) {
    	  				a = t2.getText();
    	  				b = t3.getText();
    	  				p = Integer.parseInt(b);
    	  				JOptionPane.showMessageDialog(null, a + " is added to  " +  s1 + " list");
    	  	    	if(s1 == "vegetabels") {
    			  Welcome.vege[Welcome.type_vege] = a;
    			  Welcome.vege_price[Welcome.type_vege] = p;
    			  Welcome.type_vege++;
    		  }
    		  else {
    			  if(s1 == "fruits") {
    				  Welcome.fr[Welcome.type_fr] = a;
        			  Welcome.fr_price[Welcome.type_fr] = p;
        			  Welcome.type_fr++;
    			  }
    			  else {
    				  if(s1 == "buiscuits and choclates") {
    					  Welcome.ch[Welcome.type_ch] = a;
            			  Welcome.ch_price[Welcome.type_ch] = p;
            			  Welcome.type_ch++;
    				  }
    				  else {
    					  if(s1 == "Grocery and stapels") {
    						  Welcome.g[Welcome.type_g] = a;
                			  Welcome.g_price[Welcome.type_g] = p;
                			  Welcome.type_g++;
    					  }
    					  else {
    						  Welcome.b[Welcome.type_b] = a;
                			  Welcome.b_price[Welcome.type_b] = p;
                			  Welcome.type_b++;
    					  }
    				  }
    			  }
    		  }
    	  }
    	  			}
    	  			
      }
}
