package onlineshoping;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



class BillingPage extends JFrame implements ActionListener
{    
	Container c;
	JButton b1,b2;
	JLabel nom,prenom,address,pin,state,city,country,phone;
	JTextField nom_t,prenom_t,pin_t,state_t,city_t,country_t,phone_t;
	JTextArea address_t;
	String s1;
	BillingPage(String s)
	{   this.s1=s;
		c = this.getContentPane();
		c.setLayout(null);



		nom = new JLabel("Lastname : ");
		prenom = new JLabel("Firstname : ");
		address = new JLabel("Address : ");
		pin = new JLabel("Postal Code : ");
		state = new JLabel("state : ");
		city = new JLabel("City: ");
		country = new JLabel("Country : ");
		phone=new JLabel("phone number : ");
		nom_t = new JTextField(20);
		prenom_t = new JTextField(35);
		address_t = new JTextArea(50,50);
		city_t = new JTextField(30);
		state_t = new JTextField(30);
		pin_t = new JTextField(25);
		country_t = new JTextField(30);
		phone_t=new JTextField(30);
		b1 = new JButton("Back");
		b2 = new JButton("Next step");



		nom.setBounds(250,100,100,30);
		nom_t.setBounds(370,100,100,45);
		prenom.setBounds(250,150,100,30);
		prenom_t.setBounds(370,150,100,45);
		address.setBounds(250,200,100,30);
		address_t.setBounds(370,200,200,100);
		country.setBounds(250,305,100,30);
		country_t.setBounds(370,305,100,45);
		state.setBounds(250,355,100,30);
		state_t.setBounds(370,355,100,45);
		city.setBounds(250,405,100,30);
		city_t.setBounds(370,405,100,45);
		pin.setBounds(250,455,100,30);
		pin_t.setBounds(370,455,100,45);
		phone.setBounds(250,500,100,30);
		phone_t.setBounds(370,505,100,45);
		b1.setBounds(250,555,100,30);
		b2.setBounds(370,555,100,30);




		c.add(nom);
		c.add(nom_t);
		c.add(prenom);
		c.add(prenom_t);
		c.add(address);
		c.add(address_t);
		c.add(city);
		c.add(city_t);
		c.add(state);
		c.add(state_t);
		c.add(pin);
		c.add(pin_t);
		c.add(country);
		c.add(country_t);
		c.add(b1);
		c.add(b2);
        c.add(phone);
        c.add(phone_t);
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
		else if(s=="Next step")
		{

			if(nom_t.getText().equals("")||prenom_t.getText().equals("")||pin_t.getText().equals("")||state_t.getText().equals("")||city_t.getText().equals("")||country_t.getText().equals("")||phone_t.getText().equals(""))
			{
			
		JOptionPane.showMessageDialog(null,"please fill all the deails");
		   
			}
		else {
			Billingpage1 ep = new Billingpage1(s1);
	        ep.setSize(1920,1080);
	        ep.setVisible(true);
	        ep.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        }
		}
	}
}