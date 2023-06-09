/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.createaccount3;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class CreateAccount3 {

    public static void main(String[] args) {
       int loginRegister = Integer.parseInt(JOptionPane.showInputDialog(null, "LOGIN/REGISTER" + "\n" + "\n" + "Choose one: " + "\n" + "1. Register " + "\n" + "2. Login" + "3. Exit"));
        
       Login loginclass = new Login();      
         
        if (loginRegister == 1){
             String  firstName = JOptionPane.showInputDialog(null, "Enter your First Name:");
             String  lastName = JOptionPane.showInputDialog(null, "Enter your Last Name");
             String username = JOptionPane.showInputDialog(null, "Enter your username"); 
             String password = JOptionPane.showInputDialog(null, "Enter your password");
           
            
         // loginclass = new Login();   
            
             loginclass.setFirstname(firstName); //sending all the values to the set methods. (Farrell, 2019)  
             loginclass.setLastname(lastName);
           
             loginclass.setUsername(username);
             loginclass.checkUserName(); //checking that username meets the criteria. (Farrell, 2019) 
            
             loginclass.setPassword(password);
             loginclass.checkPasswordComplexity(); //checking that the password meets the criteria. (Farrell, 2019) 
            
             JOptionPane.showMessageDialog(null, loginclass.registerUser());
            
            
            // main(args);
            
             
             }
            int loginNot = JOptionPane.showConfirmDialog(null, "Do you want to Login?", "LOGIN?", JOptionPane.YES_NO_OPTION);
             
             if (loginNot == 0){
             String username = JOptionPane.showInputDialog(null, "Enter your username");
             String password = JOptionPane.showInputDialog(null, "Enter your password"); 
            
             loginclass.loginUser(username, password); //Sending values to this method inside class. (Farrell, 2019) 
            
             JOptionPane.showMessageDialog(null, loginclass.returnLoginStaus(username, password));
             }
    }
}
