/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrick.baduya_automated.teller.machine.atm;
import java.util.Scanner;  
/**
 *
 * @author Patrick Baduya
 */
public class PatrickBaduya_AutomatedTellerMachineATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         //declare and initialize balance, withdraw, and deposit  
        int balance = 100000, withdraw, deposit;  
          
        //create scanner class object to get choice of user  
        Scanner sc = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("Automated Teller Machine");  
            System.out.println("Choose 1 for Withdraw");  
            System.out.println("Choose 2 for Deposit");  
            System.out.println("Choose 3 for Check Balance");  
            System.out.println("Choose 4 for EXIT");  
            System.out.print("Choose the operation you want to perform!");
            
              
            //get choice from user  
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:  
                    System.out.println(" ");  
                    System.out.println(" "); 
        System.out.print("Enter money to be withdrawn:");  
                      
        //get the withdrawl money from user  
        withdraw = sc.nextInt();  
                      
        //check whether the balance is greater than or equal to the withdrawal amount  
        if(balance >= withdraw)  
        {  
            //remove the withdrawl amount from the total balance  
            balance = balance - withdraw;  
                    System.out.println(" ");  
                    System.out.println(" "); 
            System.out.println("Please collect your money!");  
        }  
        else  
        {  
            //show custom error message   
                    System.out.println(" ");  
                    System.out.println(" "); 
            System.out.println("Insufficient Balance!");  
        }  
        System.out.println("");  
        break;  
   
                case 2:  
                     System.out.println(" ");  
                     System.out.println(" "); 
        System.out.print("Enter money to be deposited:");  
                      
        //get deposite amount from te user  
        deposit = sc.nextInt();  
                      
        //add the deposit amount to the total balanace  
        balance = balance + deposit; 
                     System.out.println(" ");  
                     System.out.println(" "); 
        System.out.println("Your Money has been successfully deposited!");  
        System.out.println("");  
        break;  
   
                case 3:  
        //displaying the total balance of the user  
                     System.out.println(" ");  
                     System.out.println(" "); 
        System.out.println("Balance: "+balance);  
        System.out.println("");  
        break;  
   
                case 4:  
        //exit from the menu  
        System.exit(0);  
            }  
        }  
        
        
        // TODO code application logic here
    }
    
}
