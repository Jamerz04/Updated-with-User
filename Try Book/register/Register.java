package book.system.register;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


class Register {


	public void registerFileHandling(String rName , String rUser,  String rPassword){
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Administrator\\Desktop\\Try Book\\database\\users.dat",true))){

			writer.write(rName + ", " + rUser + ", " + rPassword);
			writer.newLine();

			JOptionPane.showMessageDialog(null,"Register Succesfull!");




		}catch (IOException e){
			e.printStackTrace();
		}












	}



















}