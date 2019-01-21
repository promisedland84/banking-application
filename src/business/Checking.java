/*
 * Checking.java class
 * Matt Koenen
 * IS 286 695
 * Project 2 - Meramec Banking System
 * 07/01/18
 */

package business;

public class Checking extends BankAccount {
    private final double FEE_PER_OVER_DRAFT = 25.0;
    //CheckingAccount member variables
    private String owner;
    private CheckingAccountType checkAccountType;
    private double overdraftFee;
    private int numOfOverdrafts;
    //default constructor
    public Checking() {
        numOfOverdrafts=0;
        overdraftFee=0.0;
    }
    //customer constructor w/three params
    public Checking(String acctNo,String fName,String lName ){
        //call super class constructor
        super (acctNo,fName,lName);
    }

    public String getOwner() {
        return "Checking-"+super.getOwner();
    }

    public CheckingAccountType getCheckAccountType() {
        return checkAccountType;
    }

    public void setCheckAccountType(CheckingAccountType checkAccountType) {
        this.checkAccountType = checkAccountType;
    }

    public double getOverdraftFee() {
        return overdraftFee;
    }

    public int getNumOfOverdrafts() {
        return numOfOverdrafts;
    }
    //functional method - withdrawAmount
    @Override
    public boolean withdrawAmount(double transaction,CheckingAccountType type){
        boolean status = false;
        boolean overdraft = super.withdrawAmount(transaction, type);
        if (overdraft) {
            //if overdraft is true, charge overdraft fee
            this.overdraftFee += FEE_PER_OVER_DRAFT;
            //increment numOfOverdraft count
            numOfOverdrafts++;
            status = true;
        }
        return status;
    }
    
}
