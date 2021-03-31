package onlineshoping;

 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Login extends JFrame implements ActionListener{
	String uid[]=new String[8];
	String pwd[]=new String[8];
	int temp,t=0;
	JTextField ui;
	JPasswordField pass;
	JLabel userid,password;
	JButton login,back;
	String user,passw ;
	Container c;
	
	Login(String uid[],String pwd[],int temp){
		this.temp=temp;
		for(int i=0;i<temp;i++) {
			this.uid[i]=uid[i];
			this.pwd[i]=pwd[i];
			
		}
		c = this.getContentPane();
		c.setBackground(Color.pink);
		ui = new JTextField(30);
		pass = new JPasswordField(30);
		userid = new JLabel("USER ID");
		password = new JLabel("PASSWORD");
		login = new JButton("Login");
		back = new JButton("Back");
		pass.setEchoChar('*');
		this.setLayout(null);
		userid.setBounds(50,50,100,30);
		password.setBounds(50,150,100,30);
		ui.setBounds(170,50,200,30);
		pass.setBounds(170,150,200,30);
		login.setBounds(270,200,100,30);
		back.setBounds(50,200,100,30);
		c.add(userid);
		c.add(ui);
		c.add(password);
		c.add(pass);
		c.add(login);
		c.add(back);
		login.addActionListener(this);
		back.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent a) {
		String s1 = ui.getText();
		String s2 = pass.getText();
		if(a.getSource( )== back) {
			this.dispose();
		}
		if(a.getSource()==login) {
			for(int i=0;i<temp;i++) {
				if(s1.equals(uid[i])== true && s2.equals(pwd[i])==true)
				{
			
					if(s1.equals(Welcome.admin[0])== true && s2.equals(Welcome.password[0])==true) {
						Adminframe f1=new Adminframe();
						f1.setSize(1920,1080);
						f1.setTitle("ListFrame");
						f1.setVisible(true);
						f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						t=1;
						}
			    
					else {
						Listframe f1=new Listframe();
						f1.setSize(1920,1080);
						f1.setTitle("ListFrame");
						f1.setVisible(true);
						f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						t=1;
					}
				}
					else if(s1.equals(uid[i])== true && s2.equals(pwd[i])==false ) {
						pass.setText("");
						Graphics g=c.getGraphics();
						g.drawString("incorrect password",170 ,140 );
						g.setColor(Color.pink);
						g.fillRect(170,30,170,10);
						t=1;
					}
				}
			if(t==0) {
				pass.setText("");
				ui.setText("");
				Graphics g1=c.getGraphics();
				g1.drawString("incorrect id and password",170,40);
				g1.setColor(Color.pink);
				g1.fillRect(170,130,170,10);
			}
		}
		
		
	}

}
