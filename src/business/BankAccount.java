/*
 * BankAccount.java class
 * Matt Koenen
 * IS 286 695
 * Project 2 - Meramec Banking System
 * 07/01/18
 */

package business;

public class BankAccount {
    //BankAccount member variables
    private String acctNumber;
    private String firstName;
    private String lastName;
    private String owner;
    private double balance;
    
    //default constructor 
    public BankAccount() {
        acctNumber="";
        firstName="";
        lastName="";
        owner="";
        balance=0.0;             
    }
    //constructor with parameters
    public BankAccount(String acctNumber,String firstName,String lastName){
        this.acctNumber=acctNumber;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    /**
     * @return the acctNumber
     */
    public String getAcctNumber() {
        return acctNumber;
    }

    /**
     * @param acctNumber the acctNumber to set
     */
    public void setAcctNumber(String acctNumber) {
        this.acctNumber = acctNumber;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the owner
     */
    public String getOwner() {
        return "Account # "+this.acctNumber+" - "+this.firstName+" "+this.lastName;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    //funtional mehtod - deposit
    public double depositAmount(double amount) {
        return this.balance+=amount;
    }
    
        //functional method - withdraw w/two params
    public boolean withdrawAmount(double amountWithdrawn,CheckingAccountType type){
      boolean overdraft = false;
      if (type==CheckingAccountType.Premier && amountWithdrawn > this.balance)
          overdraft = true;
      else {
          //check if balance is greater than withdraw amount
          if (amountWithdrawn > this.balance)
              throw new IllegalArgumentException("Insufficient funds. Enter a smaller amount");
      }
      
      if (amountWithdrawn < 0){
          throw new IllegalArgumentException("No negative amount allowed. Enter valid amount");
      }
      if (amountWithdrawn > 300){
              throw new IllegalArgumentException("Your daily maximum withdrawal is $300 or less.");
      }
    //update balance
    this.balance-=amountWithdrawn;
    return overdraft;
    }
    
    public boolean withdrawAmount(double amountWithdrawn){
      boolean overdraft = false;
          //check if balance is greater than withdraw amount
      if (amountWithdrawn > this.balance)
          throw new IllegalArgumentException("Insufficient funds. Enter a smaller amount");
      
      
      if (amountWithdrawn < 0){
          throw new IllegalArgumentException("No negative amount allowed. Enter valid amount");
      }
      if (amountWithdrawn > 300){
          throw new IllegalArgumentException("Your daily maximum withdrawal is $300 or less.");
      }
    //update balance
    this.balance-=amountWithdrawn;
    return overdraft;
    }
}
