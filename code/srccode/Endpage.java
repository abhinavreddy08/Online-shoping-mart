package onlineshoping;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class EndPage extends JFrame implements ActionListener
{   ImageIcon icon,icon1;
	JLabel l,l1;
	JButton b1,b2;
	Container c;
	EndPage()
	{
 c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.white);
		 icon = new ImageIcon("C:\\Users\\M.Abhinav Reddy\\Downloads\\javaproject\\edit\\f.jpeg");
		 icon1 = new ImageIcon("C:\\Users\\M.Abhinav Reddy\\Downloads\\javaproject\\edit\\g.jpeg");
		 Image i=icon.getImage();
		 Image i1=icon1.getImage();
		   Image newimg1 = i.getScaledInstance(760,300,  java.awt.Image.SCALE_SMOOTH ) ;  
		   Image newimg2 = i1.getScaledInstance(600,300,  java.awt.Image.SCALE_SMOOTH ) ;
		 icon= new ImageIcon( newimg1 );
		 icon1= new ImageIcon( newimg2 );
		 l=new JLabel(icon);
		 l1=new JLabel(icon1);
		 l1.setBounds(0,0,600,300);
		 l.setBounds(600,0,760,300);
		   b1 = new JButton("Continue Shopping");
		b2 = new JButton("Log Out");
		b1.setBounds(800,450,100,80);
		b2.setBounds(800,600,100,80);

		c.add(l);
		c.add(b1);
		c.add(b2);
        c.add(l1);
		b1.addActionListener(this);
		b2.addActionListener(this);
		}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == b2)
		{
			Listframe.temp = 0;
			Welcome w=new Welcome();
			w.setSize(1920,1080);
			w.setTitle("Login");
			w.setVisible(true);
			w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		else
		{
			Listframe.temp = 0;
            Listframe w = new Listframe();
            
			w.setSize(1920,1080);
			w.setTitle("Login");
			w.setVisible(true);
			w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}
	
}
