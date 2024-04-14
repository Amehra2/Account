/*
 * Name: Akash Mehra
 * Student ID: 21435333
 * Instructor: DR Ikram Rehman
 * Date: 11-01-2021
 * Course name: Computer Science
 * Module: Programming.

For this task, I am required to create a class named account. This class should contain information regarding the bank id, the balance
of the account, the annualInterestRate and also when the account was created. In order for this class to work correctly, I have used accessor
and mutator methods. The final outcome of this task should be that, the output should be the given information that we have received.
It should also clearly display the balance, the monthly interest rate and the date when the account was created. 
 */
package bankaccount;
public class Bankaccount {
    public static void main(String[] args) {
         Account account = new Account(1122, 20000);//Here,I have created an account, with the ID of 1122, and a balance of $20.000
         account.setAnnualInterestRate(4.5); //Here, I have assigned the value of the annualInterestRate to 4.5%
        account.withdraw(2500); //For this procedure, I am withdrawing $2500 from the account.
        account.deposit(3000); //Here, I am sending a deposit of $3000 to the account.
        
        
        System.out.println("Your balance is: $ "+ account.getBalance()); // This method will retrieve the account balance, and display it
        System.out.println("Your monthly interest is: " + account.getMonthlyInterestRate()); // This method will retrieve the monthly interest rate and display it.
        System.out.println("This account was created on: "+ account.getDateCreated()); //This method will display the date and time the account was created.   
    }
    
}
