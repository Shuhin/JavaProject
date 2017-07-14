/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaApplication48;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Administrator
 */
public class ITT extends Frame implements ActionListener{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel l1,l2,l3,l4,l5;
    JRadioButton r1a,r1b, r1c,r1d,r2a,r2b, r2c,r2d,r3a,r3b, r3c,r3d,r4a,r4b, r4c,r4d,r5a,r5b, r5c,r5d;
    JButton b;
    
    ITT(){
        //Question 1  starts----->
    l1= new JLabel("Q1: 3+3 = ?");
    l1.setBounds(50,50,500,20);
    add(l1);
    
    r1a =new JRadioButton("4");
    r1a.setBounds(50,75,50,20);
    add(r1a);
    
    r1b =new JRadioButton("6");
    r1b.setBounds(100,75,50,20);
    add(r1b);
    
    r1c =new JRadioButton("60");
    r1c.setBounds(150,75,50,20);
    add(r1c);
    
    r1d =new JRadioButton("70");
    r1d.setBounds(200,75,50,20);
    add(r1d);
    
  
        //question 1 ends
   
    
       
        

    //Question 2 starts:------------------>
    l2= new JLabel("Q2: 3+31 = ?");
    l2.setBounds(50,100,150,20);
    add(l2);
    
      r2a =new JRadioButton("34");
    r2a.setBounds(50,120,50,20);
    add(r2a);
    
    r2b =new JRadioButton("3");
    r2b.setBounds(100,120,50,20);
    add(r2b);
    
    r2c =new JRadioButton("0");
    r2c.setBounds(150,120,50,20);
    add(r2c);
    
    r2d =new JRadioButton("7");
    r2d.setBounds(200,120,50,20);
    add(r2d);
    
   
    //question 2 ends
    
    
    
    
    
    //question 3 starts-------->
    
    
    l3= new JLabel("Q3: 13+3 = ?");
    l3.setBounds(50,150,150,20);
    add(l3);
    
    r3a =new JRadioButton("34");
    r3a.setBounds(50,175,50,20);
    add(r3a);
    
    r3b =new JRadioButton("63");
    r3b.setBounds(100,175,50,20);
    add(r3b);
    
    r3c =new JRadioButton("16");
    r3c.setBounds(150,175,50,20);
    add(r3c);
    
    r3d =new JRadioButton("710");
    r3d.setBounds(200,175,50,20);
    add(r3d);
    
  
     //question 3 ends
     
     
     //question 4 starts
     
    l4= new JLabel("Q4: 32+3 = ?");
    l4.setBounds(50,200,150,20);
    add(l4);
    
     
    r4a =new JRadioButton("21");
    r4a.setBounds(50,225,50,20);
    add(r4a);
    
    r4b =new JRadioButton("11");
    r4b.setBounds(100,225,50,20);
    add(r4b);
    
    r4c =new JRadioButton("35");
    r4c.setBounds(150,225,50,20);
    add(r4c);
    
    r4d =new JRadioButton("0");
    r4d.setBounds(200,225,50,20);
    add(r4d);
    
    
    //question 4 ends
    
    //question 5 starts 
    l5= new JLabel("Q5: 3+23 = ?");
    l5.setBounds(50,250,150,20);
    add(l5);
    
  
    
     
    r5a =new JRadioButton("35");
    r5a.setBounds(50,275,50,20);
    add(r5a);
    
    r5b =new JRadioButton("121");
    r5b.setBounds(100,275,50,20);
    add(r5b);
    
    r5c =new JRadioButton("25");
    r5c.setBounds(150,275,50,20);
    add(r5c);
    
    r5d =new JRadioButton("10");
    r5d.setBounds(200,275,50,20);
    add(r5d);
    
    
     //quesrion 5 ends
   
    // checking button starts
    
      b= new JButton("check");
    b.setBounds(300,300,100,20);
    b.addActionListener(this);
    add(b);
    
    //checking button ends
    
    
    setSize(400,400);
    setLayout(null);
    setVisible(true);
    }
    
  
    public void actionPerformed (ActionEvent e){
        
        int sum=0;
        //for ques number 1
        if (r1b.isSelected()){
            JOptionPane.showMessageDialog(this," Q1 is correct");
    
            sum=sum+1;
        }   
        else if (r1a.isSelected()||r1c.isSelected()||r1d.isSelected()){
    JOptionPane.showMessageDialog(b," Q1 is incorrect");
        }
        
        //for question number 2
             if (r2a.isSelected()){
            JOptionPane.showMessageDialog(this," Q2 is correct");
    
             sum = sum+1;
             }   
        else if (r2b.isSelected()||r2c.isSelected()||r2d.isSelected()){
    JOptionPane.showMessageDialog(b," Q2 is incorrect");
        }
             
        //for question number 3
                 if (r3c.isSelected()){
            JOptionPane.showMessageDialog(this," Q3 is correct");
                sum = sum+1;
                 }   
        else if (r3b.isSelected()||r3a.isSelected()||r3d.isSelected()){
    JOptionPane.showMessageDialog(b," Q3 is incorrect");
        }
        
        //for question number 4
        
                 if (r4c.isSelected()){
            JOptionPane.showMessageDialog(this," Q4 is correct");
                sum = sum+1;
                 }   
        else if (r4b.isSelected()||r4a.isSelected()||r4d.isSelected()){
    JOptionPane.showMessageDialog(b," Q4 is incorrect");
        }
         
                 
       //for question number 5
       
                if (r5c.isSelected()){
            JOptionPane.showMessageDialog(this," Q5 is correct");
            sum = sum+1;
                }   
        else if (r5b.isSelected()||r5a.isSelected()||r5d.isSelected()){
    JOptionPane.showMessageDialog(b," Q5 is incorrect");
        }
    
    
    JOptionPane.showMessageDialog(b,"you have got"+sum);
    
    
    }
    public static void main(String args []){
    	new ITT();
    }
}