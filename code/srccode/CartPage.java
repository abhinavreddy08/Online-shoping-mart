package onlineshoping;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class CartPage extends JFrame implements ActionListener
{   
	JButton b1,b2;
	JButton b[] = new JButton[20];
	JButton In[] =  new JButton[20];
	JButton De[] = new JButton[20];
	JLabel totalbill;
	int j,bill =0 ;
	Container c;
	String s1;
	CartPage()
	{
		 c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.white);
	    b1 = new JButton("BUY");
	    b1.setBounds(900,600,100,50);
	    b2 = new JButton("Back");
	    b2.setBounds(10,600,100,50);
	    
		for(int i=0;i<Listframe.temp;i++)
		{
			
			JLabel l = new JLabel(Listframe.item[i]+"  "+Listframe.quantity[i]+" "+Listframe.quat[i]+"   "+Listframe.price[i] + "rupees");
			l.setBounds(100,50*i,300,50);

			l.setFont(new Font("TimesRoman", Font.PLAIN, 20));
			c.add(l);
		}
		
		for(int i=0;i<Listframe.temp;i++)
		{
			b[i] = new JButton("Remove" + "   " + Listframe.item[i]);
			In[i] = new JButton("+");
			De[i] = new JButton("-");
			b[i].setBounds(900,50*i,200,40);
			In[i].setBounds(500,50*i,50,40);
			De[i].setBounds(600,50*i,50,40);
			c.add(b[i]);
			c.add(In[i]);
			c.add(De[i]);
			b[i].addActionListener(this);
			In[i].addActionListener(this);
			De[i].addActionListener(this);
		}
		//hai();
		for(int i=0;i<Listframe.temp;i++) {
			bill = bill + Listframe.price[i];
		}
		String s = ""+bill;
		totalbill = new JLabel("Total bill" + "   " + s + "ruppes");
		totalbill.setBounds(100,50*Listframe.temp,400,50);
	
		c.add(b1);
		c.add(b2);
		c.add(totalbill);
		b1.addActionListener(this);
		b2.addActionListener(this);
				
	}

	public void actionPerformed(ActionEvent ae)
		{
		     
		     if(ae.getSource()==b2)
		     {
		     	dispose();
		     }
		     else
		     {
		    	 if(ae.getSource()==b1) {
		     	BillingPage f = new BillingPage(s1);
		     	f.setSize(1920,1080);
				f.setTitle("Login");
				f.setVisible(true);
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    	 }
		    	 else{
		    		 for(int i=0;i<Listframe.temp;i++) {
		    				if(ae.getSource()==b[i]) {
		    					
		    					Listframe.quantity[i] = 0  ;
		    					Listframe.quat[i] = "0" ;
		    					Listframe.price[i] = 0;
		    					text(i);
		    				}
		    				else {
		    					if(ae.getSource()==In[i]) {
			    					
			    					int p = Listframe.price[i]/Listframe.quantity[i];
			    					Listframe.quantity[i] = Listframe.quantity[i] +1;
			    					Listframe.price[i] = Listframe.price[i] + p;
			    					text(i);
			    				}
		    					else {
		    						if(ae.getSource()==De[i]) {
			    					
			    					int p = Listframe.price[i]/Listframe.quantity[i];
			    					Listframe.quantity[i] = Listframe.quantity[i] -1;
			    					Listframe.price[i] = Listframe.price[i] - p;
			    					text(i);
			    				}
		    				}
		    					
		    				}
		    			}
		    	 }
		     }
		}

	public void text(int j){
		this.j=j;
		Graphics g = c.getGraphics();
		g.setFont(new Font("TimesRoman", Font.BOLD, 20));
		g.setColor(Color.white);
		g.fillRect(0,0,500,600);
		g.fillRect(550,50*j,50,40);
		g.setColor(Color.black);
		for(int i=0;i<Listframe.temp;i++)
		{
			
			g.drawString(Listframe.item[i]+"  "+Listframe.quantity[i]+" "+Listframe.quat[i]+"   "+Listframe.price[i] + "rupees",100,30+50*i);
			String t=String.valueOf(Listframe.quantity[i]);
			g.drawString(t, 560, 30+50*i);
			//System.out.println(Listframe.quantity[i]);
		}
		bill = 0;
		for(int i=0;i<Listframe.temp;i++) {
			bill = bill + Listframe.price[i];
		}
		String s = ""+bill;
		s1=s;
		g.drawString("Total bill" + "   " + s + "rupees",100,30+50*Listframe.temp);
	}
}