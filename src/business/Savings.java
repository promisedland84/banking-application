/*
 * Savings.java class
 * Matt Koenen
 * IS 286 695
 * Project 2 - Meramec Banking System
 * 07/02/18
 */
package business;


public class Savings extends BankAccount {
    //Savings member variables
    private String owner;
    private double interestEarned;

      
    //default constructor
    public Savings(){
        interestEarned = 0.00;
    }
    
    //constructor with three parameters
    public Savings (String acctNo, String fName, String lName){
        super (acctNo, fName, lName);
    }
    
    
    @Override
    public String getOwner(){
        return "Savings-" + super.getOwner();
    }

    public double getInterestEarned() {
        return interestEarned;
    }
    
    public String getFormattedInterest(){
        double i = getInterestEarned();
        double Interest = (double)Math.round(i * 100d) / 100d;
        String formatInterest = Double.toString(Interest);
        return formatInterest;
    }

    public void setInterestEarned(double interestEarned) {
        this.interestEarned = interestEarned;
    }
    
    public double addInterest(){
        if (super.getBalance() > 100.00){
            super.setBalance(super.getBalance()*1.02);
            this.interestEarned += super.getBalance()*0.02;
        } 
        return super.getBalance();
    }
    
}
