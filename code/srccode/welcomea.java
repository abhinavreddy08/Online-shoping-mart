package onlineshoping;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class welcomea extends JFrame implements ActionListener {
	JButton b1,b2,b3;
	Container c;
	String uid[]=new String[8];
	String pwd[]=new String[8];
	int temp=2;
welcomea()
{
	c=this.getContentPane();
	c.setBackground(Color.pink);
	b1=new JButton("sign in");
	b2=new JButton("sign up");
    JLabel l=new JLabel("WELCOME");
    JLabel l1=new JLabel("new user ?");
    JLabel l2=new JLabel("Already a user?");
	c.setLayout(null);
	 uid[0]="abc@gmail.com";
     uid[1]="abcd@gmail.com";
	pwd[0]="hai";
	pwd[1]="hi";
	l.setBounds(130,50,100,30);
	l1.setBounds(210,120,70,30);
	l2.setBounds(60,120,90,30);
	b1.setBounds(50,150,100,30);
	b2.setBounds(200,150,100,30);
	c.add(l);
	c.add(l1);
	c.add(l2);
	c.add(b1);
	c.add(b2);
	b1.addActionListener(this);
	b2.addActionListener(this);
}
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==b1) {
	Login f = new Login(uid,pwd,temp);
	f.setSize(1366,768);
	f.setTitle("Login");
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}
	else if(e.getSource()==b2){
		Rform f = new Rform(uid,pwd,temp);
		f.setSize(1366,768);
		f.setTitle("Login");
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}
	public static void main(String[] args) {
Welcome w=new Welcome();
w.setSize(1366,768);
w.setTitle("Login");
w.setVisible(true);
w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
