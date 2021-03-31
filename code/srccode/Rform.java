package onlineshoping;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;

public class Rform extends JFrame implements ActionListener{
	JTextField name,mailid,password,cpassword;
	JLabel Name,Mailid,Password,Cpassword;
	JButton submit;
	String uid[]=new String[8];
	String pwd[]=new String[8];
	int temp;
	Rform(String uid[],String pwd[],int temp){
		this.temp=temp;
		for(int i=0;i<temp;i++) {
			this.uid[i]=uid[i];
			this.pwd[i]=pwd[i];
		}
		Container c = this.getContentPane();
		c.setBackground(Color.pink);
		this.setLayout(null);
		Name = new JLabel("Name");
		Mailid = new JLabel("Mailid");
		Password = new JLabel("Password");
		Cpassword = new JLabel("Confirm password");
		name = new JTextField();
		mailid = new JTextField();
		password = new JTextField();
		cpassword = new JTextField();
		submit = new JButton("submit");
		Name.setBounds(50,50,100,30);
		name.setBounds(200,50,200,30);
		Mailid.setBounds(50,100,100,30);
		mailid.setBounds(200,100,200,30);
		Password.setBounds(50,150,100,30);
		password.setBounds(200,150,200,30);
		Cpassword.setBounds(50,200,150,30);
		cpassword.setBounds(200,200 , 200, 30);
		submit.setBounds(250,250,100,30);
		c.add(Name);
		c.add(name);
		c.add(Mailid);
		c.add(mailid);
		c.add(Password);
		c.add(password);
		c.add(Cpassword);
		c.add(cpassword);
		c.add(submit);
		
		
		submit.addActionListener(this);
		
		
	}
	public void actionPerformed(ActionEvent e) {
		String s1 = mailid.getText();
		String s2 = password.getText();
		uid[temp] = s1;
		pwd[temp]=s2;
		
		
		if(e.getSource()==submit) {
			if(password.getText().equals(cpassword.getText()) && name.getText().length() != 0 && mailid.getText().length()!=0 ) {
				temp = temp+1;
				Login f = new Login(uid,pwd,temp);
				f.setSize(1920,1080);
				f.setTitle("Login");
				f.setVisible(true);
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			}
			
			else {
				if(password.getText().length() == 0 || cpassword.getText().length() == 0|| name.getText().length() == 0 || mailid.getText().length()==0 ) {
					JOptionPane.showMessageDialog(null, "Fill the form completely");
				}
				else {
					JOptionPane.showMessageDialog(null, "Plese enter correct password");
				}
			}
			
		}
	}
	


}