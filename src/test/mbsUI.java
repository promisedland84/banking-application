/*
 * mbsUI.java class
 * Matt Koenen
 * IS 286 695
 * Project 2 - Meramec Banking System
 * 07/01/18
 */

package test;

import business.AccountType;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import validation.Validator;
import java.text.*;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import business.*;
import java.time.LocalDate;
import java.util.Date;  
import java.util.Locale;
import javax.swing.ImageIcon;

public class mbsUI extends javax.swing.JFrame {
Checking checkingacct;
Savings savingacct;
BankAccount bankacct;

//format balance/deposit/withdrawal/fees to currency
NumberFormat money = NumberFormat.getCurrencyInstance();

//format date per USA convention
DateFormat formatDate = DateFormat.getDateInstance();
String today = formatDate.format(new Date());

    public mbsUI() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("money-dollar-circle.png")).getImage());
        this.setLocationRelativeTo(this);
        disableButtons();
        disableDWT();
        //call populateComboBox() method
        populateComboBoxBankAcct();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldAcctnum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldFirstnm = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldLastnm = new javax.swing.JTextField();
        jComboBoxBankAccount = new javax.swing.JComboBox();
        jRadioBasic = new javax.swing.JRadioButton();
        jRadioPremier = new javax.swing.JRadioButton();
        jLabelChecking = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldDepositAmt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldWithdrawAmt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaMsg = new javax.swing.JTextArea();
        jButtonWelcome = new javax.swing.JButton();
        jButtonDeposit = new javax.swing.JButton();
        jButtonWithdrawal = new javax.swing.JButton();
        jButtonBalance = new javax.swing.JButton();
        jButtonStatement = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Meramec On-line Banking System");

        jPanel1.setBackground(new java.awt.Color(13, 134, 186));

        jPanel2.setBackground(new java.awt.Color(125, 190, 251));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customer Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Account:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Account Number:");

        jTextFieldAcctnum.setToolTipText("Enter a valid Account Number");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("First Name:");

        jTextFieldFirstnm.setToolTipText("Enter your First Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Last Name:");

        jTextFieldLastnm.setToolTipText("Enter your Last Name");

        jComboBoxBankAccount.setToolTipText("Select Checking or Savings");
        jComboBoxBankAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBankAccountActionPerformed(evt);
            }
        });

        jRadioBasic.setBackground(new java.awt.Color(125, 190, 251));
        buttonGroup1.add(jRadioBasic);
        jRadioBasic.setText("Basic");

        jRadioPremier.setBackground(new java.awt.Color(125, 190, 251));
        buttonGroup1.add(jRadioPremier);
        jRadioPremier.setSelected(true);
        jRadioPremier.setText("Premier");

        jLabelChecking.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelChecking.setText("Checking Type:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelChecking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(36, 36, 36)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldAcctnum, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLastnm, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioBasic)
                    .addComponent(jTextFieldFirstnm, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jRadioPremier)
                        .addComponent(jComboBoxBankAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxBankAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioBasic)
                    .addComponent(jRadioPremier)
                    .addComponent(jLabelChecking))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAcctnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldFirstnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldLastnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(125, 190, 251));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Transactions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Deposit Amount:");

        jTextFieldDepositAmt.setToolTipText("Enter the amount you'd like to Deposit");
        jTextFieldDepositAmt.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Withdrawal Amount:");

        jTextFieldWithdrawAmt.setToolTipText("Enter the amount you'd like to Withdrawal");
        jTextFieldWithdrawAmt.setEnabled(false);

        jTextAreaMsg.setEditable(false);
        jTextAreaMsg.setColumns(20);
        jTextAreaMsg.setRows(5);
        jTextAreaMsg.setEnabled(false);
        jScrollPane1.setViewportView(jTextAreaMsg);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldDepositAmt, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldWithdrawAmt)))
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldDepositAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldWithdrawAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButtonWelcome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonWelcome.setText("Welcome");
        jButtonWelcome.setToolTipText("Click \"Welcome\" to load your Account");
        jButtonWelcome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonWelcome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWelcomeActionPerformed(evt);
            }
        });

        jButtonDeposit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonDeposit.setText("Deposit");
        jButtonDeposit.setToolTipText("Click \"Deposit\" to complete your deposit");
        jButtonDeposit.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDepositActionPerformed(evt);
            }
        });

        jButtonWithdrawal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonWithdrawal.setText("Withdrawal");
        jButtonWithdrawal.setToolTipText("Click \"Withdrawal\" to complete your withdrawal");
        jButtonWithdrawal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonWithdrawal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWithdrawalActionPerformed(evt);
            }
        });

        jButtonBalance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonBalance.setText("Show Balance");
        jButtonBalance.setToolTipText("Click \"Show Balance\" to show the current balance of your Account");
        jButtonBalance.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBalanceActionPerformed(evt);
            }
        });

        jButtonStatement.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonStatement.setText("Print Statement");
        jButtonStatement.setToolTipText("Click \"Print Statement\" to display your current statement");
        jButtonStatement.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonStatement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStatementActionPerformed(evt);
            }
        });

        jButtonClear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonClear.setText("Clear");
        jButtonClear.setToolTipText("Click \"Clear\" to reset the form");
        jButtonClear.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jButtonExit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonExit.setText("Exit");
        jButtonExit.setToolTipText("Click \"Exit\" to exit the application");
        jButtonExit.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonWelcome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDeposit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonWithdrawal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBalance)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonStatement)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonWelcome)
                    .addComponent(jButtonDeposit)
                    .addComponent(jButtonWithdrawal)
                    .addComponent(jButtonBalance)
                    .addComponent(jButtonStatement)
                    .addComponent(jButtonClear)
                    .addComponent(jButtonExit))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonWelcomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWelcomeActionPerformed
       //local variables
       String accntNo="";
       String fName="";
       String lName="";
       String statusMsg="";
       //read user input and assign input to variables
       accntNo=jTextFieldAcctnum.getText();
       fName=jTextFieldFirstnm.getText();
       lName=jTextFieldLastnm.getText();
       if (jComboBoxBankAccount.getSelectedItem()==AccountType.Checking) {
           if(Validator.isValidAccountNumber(jTextFieldAcctnum) &&
                   Validator.isTextFieldNotEmpty(jTextFieldAcctnum) &&
                   Validator.isValidName(jTextFieldFirstnm) && 
                   Validator.isTextFieldNotEmpty(jTextFieldFirstnm) &&
                   Validator.isValidName(jTextFieldLastnm) &&
                   Validator.isTextFieldNotEmpty(jTextFieldLastnm)){
           checkingacct = new Checking(accntNo,fName,lName);
           }else return;
           if (jRadioBasic.isSelected()) {
               checkingacct.setCheckAccountType(CheckingAccountType.Basic);
               jTextAreaMsg.setText("Customer : \n"+checkingacct.getOwner());
           }
           else if (jRadioPremier.isSelected()) {
               checkingacct.setCheckAccountType(CheckingAccountType.Premier);
               jTextAreaMsg.setText("Customer : \n"+checkingacct.getOwner());
           }
           else {
           JOptionPane.showMessageDialog(rootPane, "Select Basic or Premier");
           }
      
       }
       else if (jComboBoxBankAccount.getSelectedItem()==AccountType.Savings) {
           if(Validator.isValidAccountNumber(jTextFieldAcctnum) &&
                   Validator.isTextFieldNotEmpty(jTextFieldAcctnum) &&
                   Validator.isValidName(jTextFieldFirstnm) && 
                   Validator.isTextFieldNotEmpty(jTextFieldFirstnm) &&
                   Validator.isValidName(jTextFieldLastnm) &&
                   Validator.isTextFieldNotEmpty(jTextFieldLastnm)){
           savingacct = new Savings(accntNo, fName, lName);
           jTextAreaMsg.setText("Customer : \n" + savingacct.getOwner());
           } else return;
           
       } else if (Validator.isValidAccount(jComboBoxBankAccount)){
       } else return;
     
        enableButtons();
        disableInputs();
        disableRadios();
        enableDWT();
    }//GEN-LAST:event_jButtonWelcomeActionPerformed

    private void jButtonDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDepositActionPerformed
        double amount;

        if (Validator.isTextFieldNotEmpty(jTextFieldDepositAmt) &&
            Validator.isTextFieldDouble(jTextFieldDepositAmt)){}
        else return;

        try {
            amount=Double.parseDouble(jTextFieldDepositAmt.getText());
        }
        catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, "Deposit amount must be a number");
            return;
        }
        String output="New Deposit: \n" + money.format(amount);
        output += "\n Current Balance: \n";
        if (jComboBoxBankAccount.getSelectedItem()==AccountType.Checking) {
                checkingacct.depositAmount(amount);
                output += money.format(checkingacct.getBalance());
        }
        else {
                savingacct.depositAmount(amount);
                savingacct.addInterest();
            
            output += money.format(savingacct.getBalance());
        }
        jTextAreaMsg.setText(output);
        jTextFieldDepositAmt.setText("");
    }//GEN-LAST:event_jButtonDepositActionPerformed

    private void jButtonWithdrawalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWithdrawalActionPerformed
        double amount=0.00;
        
        if (Validator.isTextFieldNotEmpty(jTextFieldWithdrawAmt) &&
            Validator.isTextFieldDouble(jTextFieldWithdrawAmt)){}
        else return;
        
        try {
            amount=Double.parseDouble(jTextFieldWithdrawAmt.getText());
            
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Withdraw amount must be a number");
           
        }
        String output="New Withdrawal: \n" + money.format(amount);
        output += "\n Current Balance: \n";
        if (jComboBoxBankAccount.getSelectedItem()==AccountType.Checking) {
             try {
                    if (jRadioBasic.isSelected()){
                        checkingacct.withdrawAmount(amount, CheckingAccountType.Basic);
                    }
                    else {
                       checkingacct.withdrawAmount(amount, CheckingAccountType.Premier); 
                    }
                    output += money.format(checkingacct.getBalance());
                }
            
        
            catch (IllegalArgumentException e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
            return;}
                    
        }
        else {
           try{
               savingacct.withdrawAmount(amount, null);
               savingacct.addInterest();
               output += money.format(savingacct.getBalance());
               
           }
           catch (IllegalArgumentException e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
            return;}
        }
        jTextAreaMsg.setText(output);
        jTextFieldWithdrawAmt.setText("");
    }//GEN-LAST:event_jButtonWithdrawalActionPerformed

    private void jButtonBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBalanceActionPerformed
        if (jComboBoxBankAccount.getSelectedItem() == AccountType.Checking){
            JOptionPane.showMessageDialog(null, 
                    "Customer " + 
                            checkingacct.getFirstName() + 
                            " " + 
                            checkingacct.getLastName() +
                            " has " + 
                            money.format(checkingacct.getBalance()) + 
                            " in account " +
                            checkingacct.getAcctNumber(), 
                    "Checking Account Balance", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else if (jComboBoxBankAccount.getSelectedItem() == AccountType.Savings) {
                        JOptionPane.showMessageDialog(null, 
                    "Customer " + 
                            savingacct.getFirstName() + 
                            " " + 
                            savingacct.getLastName() +
                            " has " + 
                            money.format(savingacct.getBalance()) + 
                            " in account " +
                            savingacct.getAcctNumber(), 
                    "Savings Account Balance", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonBalanceActionPerformed

    private void jComboBoxBankAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBankAccountActionPerformed
        if (jComboBoxBankAccount.getSelectedItem() == AccountType.Savings){
            disableRadios();
        }
        else if (jComboBoxBankAccount.getSelectedItem()==AccountType.Money_Market) {
           jComboBoxBankAccount.setSelectedIndex(-1);
           JOptionPane.showMessageDialog(null, "Money Market accounts haven't "
                   + "been implemented.", 
                   "No Implementation", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (jComboBoxBankAccount.getSelectedItem()==AccountType.CD) {
           jComboBoxBankAccount.setSelectedIndex(-1);
           JOptionPane.showMessageDialog(null, "Certificate of Deposit accounts "
                   + "haven't been implemented.", 
                   "No Implementation", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            enableRadios();
        }
            
    }//GEN-LAST:event_jComboBoxBankAccountActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        enableInputs();
        disableButtons();
        disableDWT();
        enableRadios();
        clearText();
        jComboBoxBankAccount.setSelectedIndex(-1);
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
            if (jButtonExit.isSelected()) {
            JOptionPane confirmed = new JOptionPane(
                "",
                JOptionPane.QUESTION_MESSAGE,
                JOptionPane.YES_NO_OPTION);
        }

        int confirmed = JOptionPane.showConfirmDialog(
                        null, "Are you sure you would like to exit the program?",
                            "Exit Program?", 
                            JOptionPane.YES_NO_OPTION);
        
        if(confirmed == JOptionPane.YES_OPTION) {
            
            System.exit(0);
        } 
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonStatementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStatementActionPerformed
        if (jComboBoxBankAccount.getSelectedItem() == AccountType.Checking){
            JOptionPane.showMessageDialog(null, 
                    "Statement as of " + today + " for : \n" + checkingacct.getOwner() + "\n" +
                            "Checking Account Balance is : " + money.format(checkingacct.getBalance()) + "\n\n" +
                            "Amount of overdraft fees for the month is : " + money.format(checkingacct.getOverdraftFee()) + "\n" + 
                            "The number of overdrafts this month is : " + checkingacct.getNumOfOverdrafts(), 
                    "Checking Account Statement as of " + today, 
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else if (jComboBoxBankAccount.getSelectedItem() == AccountType.Savings) {
            JOptionPane.showMessageDialog(null, 
                    "Statement as of " + today + " for : \n" + savingacct.getOwner() + "\n\n" +
                            "Savings Account Balance is : " + money.format(savingacct.getBalance()) + "\n" +
                            "Interest earned fo this month is : " + money.format(savingacct.getInterestEarned()), 
                    "Savings Account Statement as of " + today, 
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonStatementActionPerformed
    //method to disable buttons
    private void disableButtons() {
        jButtonDeposit.setEnabled(false);
        jButtonWithdrawal.setEnabled(false);
        jButtonStatement.setEnabled(false);
        jButtonBalance.setEnabled(false);
    }
    
    //method to disable customer info input fields
    private void disableInputs(){
        jComboBoxBankAccount.setEnabled(false);
        jTextFieldAcctnum.setEnabled(false);
        jTextFieldFirstnm.setEnabled(false);
        jTextFieldLastnm.setEnabled(false);
    }
    
    //method to enable customer info input fields
    private void enableInputs(){
        jComboBoxBankAccount.setEnabled(true);
        jTextFieldAcctnum.setEnabled(true);
        jTextFieldFirstnm.setEnabled(true);
        jTextFieldLastnm.setEnabled(true);
    }
    
    //method to enable Deposit, Withdrawal, and TextArea
    private void enableDWT(){
        jTextFieldWithdrawAmt.setEnabled(true);
        jTextFieldDepositAmt.setEnabled(true);
        jLabel5.setEnabled(true);
        jLabel6.setEnabled(true);
        jTextAreaMsg.setEnabled(true);
    }
    
    //method to disable Deposit, Withdrawal, and TextArea
    private void disableDWT(){
        jTextFieldWithdrawAmt.setEnabled(false);
        jTextFieldDepositAmt.setEnabled(false);
        jLabel5.setEnabled(false);
        jLabel6.setEnabled(false);
        jTextAreaMsg.setEnabled(false);
    }
    
    //method to clear text fields
    private void clearText(){
        jComboBoxBankAccount.setSelectedIndex(0);
        jTextFieldAcctnum.setText("");
        jTextFieldFirstnm.setText("");
        jTextFieldLastnm.setText("");
        jTextFieldWithdrawAmt.setText("");
        jTextFieldDepositAmt.setText("");
        jTextAreaMsg.setText("");
    }
    
    //method to disable account type radio buttons
    private void disableRadios(){
        jRadioBasic.setEnabled(false);
        jRadioPremier.setEnabled(false);
        jLabelChecking.setEnabled(false);
    }
    
    //method to enable radio buttons
    private void enableRadios(){
        jRadioBasic.setEnabled(true);
        jRadioPremier.setEnabled(true);
        jLabelChecking.setEnabled(true);
    }
    
    //method to enable buttons
    private void enableButtons(){
        jButtonDeposit.setEnabled(true);
        jButtonWithdrawal.setEnabled(true);
        jButtonStatement.setEnabled(true);
        jButtonBalance.setEnabled(true);
    }
    //method to populate jComboBox
    private void populateComboBoxBankAcct(){
        jComboBoxBankAccount.removeAllItems();
        jComboBoxBankAccount.setModel(new DefaultComboBoxModel(AccountType.values()));
        jComboBoxBankAccount.setSelectedIndex(-1);
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mbsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mbsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mbsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mbsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mbsUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonBalance;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDeposit;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonStatement;
    private javax.swing.JButton jButtonWelcome;
    private javax.swing.JButton jButtonWithdrawal;
    private javax.swing.JComboBox jComboBoxBankAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelChecking;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioBasic;
    private javax.swing.JRadioButton jRadioPremier;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaMsg;
    private javax.swing.JTextField jTextFieldAcctnum;
    private javax.swing.JTextField jTextFieldDepositAmt;
    private javax.swing.JTextField jTextFieldFirstnm;
    private javax.swing.JTextField jTextFieldLastnm;
    private javax.swing.JTextField jTextFieldWithdrawAmt;
    // End of variables declaration//GEN-END:variables
}
