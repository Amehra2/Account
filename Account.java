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
public class Account {
    //Here below, I have created the data fields. I have also set the access modifiers to private.
    private int id;
    private double balance;
    private double annualInterestRate;
    private java.util.Date dateCreated;
   
    public Account(){ //Here below, I am declaring the default values of the account.
      id=0;
      balance =0;
      annualInterestRate=0;
      dateCreated = new java.util.Date(); //This syntax, will enable for the date and time to be displayed. For the purpose of when the account was created.
      
    }
    
    // Here below, I have assigned the method identities. This has been done for the balance, the ID.
public Account(int id, double balance){
    this();
    this.id = id; //Whenever we would be required to refer to the id, we can type in the method identity this.id
    this.balance = balance; //Whenever we would be required to refer to the balance of the account, we can type in the method identity this.balance.
    
    
}// Here below, I have declared the accessor methods, also known as the getter method.
public int getId(){ // In order for us to retrieve the account id. We would need to declare it first as getId.
    return this.id; // By entering this.id the value of the account Id would be returned to us.
}
public double getBalance(){ // In order for us to retrieve the account balance, we would be required to declare it first as getBalance.
    return this.balance; // This will ensure that the value of the balance gets shown to us. 
}
public double getAnnualInterestRate(){ // Here, I have declared the method to retrieve the annualInterestRate.
    return annualInterestRate; // This will ensure that the value of the annualInterestRate gets shown to us.
}
public String getDateCreated(){ // Here, I have declared the method, which allows us to get the date,the account was created.
    return this.dateCreated.toString(); //This will return the value, which is the date the account was created.
}

//Here below, I have declared the mutator methods, these are also known as the setter methods.
public void setId(int id){ //In order to set the Id, we have to declare it first. Which has been done here.
    this.id = id; // In order to set the value of the Id, we use this.id
}
public void setBalance(double balance){ //Here I have assigned the set method for the balance.
    this.balance = balance; //This method here known as this.balance, will allow us to set the value of the account balance.
}
public void setAnnualInterestRate(double annualInterestRate){ // Here, I have set the method, which enables us to give a value to the AnnualInterestRate.
    this.annualInterestRate = annualInterestRate; //By entering this.annualInterestRate, we are able to give a set value to the annualInterestRate
}

//Here I have declared the method that will return the MonthlyInterestRate.
public double getMonthlyInterestRate(){
    return annualInterestRate/12; // In order to get the MonthlyInterestRate, we take the value of the annualInterestRate and divide it by 12.
}

public double getMontlhyInterest(){
    return balance * getMonthlyInterestRate();
}


    //Here below, I have created a method, that allows money to be withdrawn from the account.
    public void withdraw(double amount){
        this.balance -= amount;
    }
  
   /// Here below, I have created the method called deposit. This method allows money to be deposited to the account.
    public void deposit(double amount){
        this.balance += amount;
    }
    }
  
   
    
  
  

 