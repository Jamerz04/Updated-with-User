package book.system.user;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;



public class UserView{

	private UserController userController;

	


	public void userGui(JFrame tempFrame,String getName){


		userController = new UserController(this);


		JPanel userPanel = new JPanel();



		userPanel.setSize(400,500);
		userPanel.setBackground(new Color(232,209,132));
		userPanel.setLayout(null);


		


		JLabel greet = new JLabel("Hello! " + getName);
		greet.setBounds(10,10,90,30);
		userPanel.add(greet);




		JButton logoutBtn = new JButton("logoutBtn");
		logoutBtn.setBounds(280,10,90,30);
		logoutBtn.addActionListener(userController.getLogoutButton(tempFrame));
		userPanel.add(logoutBtn);






		
		tempFrame.add(userPanel);



	}



























}
