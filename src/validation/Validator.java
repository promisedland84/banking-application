/*
 * Validator.java class
 * Supplied by instructor
 * Modified by Matt Koenen
 * IS 286 695
 * Project 2 - Meramec Banking System
 * 07/01/18
 */


package validation;

import business.AccountType;
import java.awt.Component;
import java.awt.Frame;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Validator {
    // Validate for first and last name textfield
    
    public static boolean isValidName(JTextField jtxtField) {
        /* Validate for entries that contain spaces, dots, 
           and special characters */
        boolean validName = false;
        
        if (Pattern.matches("^\\p{L}+[\\p{L}\\p{Z}\\p{P}]{0,}", 
                jtxtField.getText())) {
            validName = true;
        } else {
            JOptionPane.showMessageDialog(getParentFrame(jtxtField), 
                    "Customer Name" 
                + " is blank or invalid.\n It must not contain spaces, dots "
                + "and numbers.","Invalid Input", JOptionPane.ERROR_MESSAGE);
            jtxtField.setText("");
            jtxtField.requestFocusInWindow();
        }
        
        return validName;
    }
    

    public static boolean isValidAccountNumber(JTextField txtField) {
        /* Validate for entries that contain spaces, dots, 
           and special characters */
        
        boolean validAccountNo = false;
        
        if (Pattern.matches("^[a-zA-Z0-9]+$", txtField.getText())) {
            validAccountNo = true;
        } else {
            JOptionPane.showMessageDialog(getParentFrame(txtField), 
                    "Account Number" 
                    + " is invalid. Only numbers and letters are allowed, "
                    + "e.g., BA1210");
            //txtField.setText("");
            //txtField.requestFocusInWindow();
        }
        
        return validAccountNo;
    }
    
    public static boolean isTextFieldDouble(JTextField txtField) {
        if (isTextFieldNotEmpty(txtField)) {
            if(!TryParseDouble(txtField.getText())) {
               errorMessage("Data entered for Deposit or Withdrawal"  
                    + " is not a valid number!\nPlease try again!", txtField);
               txtField.setText("");
               txtField.requestFocusInWindow();
               return false;
            }
        }
        return true;
    }
    
    public static boolean isTextFieldNotEmpty(JTextField txtField) {
        if (txtField.getText().isEmpty()) {
            errorMessage("The text field for your desired action is empty. "
                    + "Please make a valid entry." , txtField);
            txtField.requestFocusInWindow();
            return false;
        }
        return true;
    }
     
    public static boolean TryParseDouble(String number) {
        try {
            Double.parseDouble(number);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }

    }
    
    public static boolean isValidAccount(JComboBox comboBox){
        if(comboBox.getSelectedItem() != AccountType.Checking ||
                comboBox.getSelectedItem() != AccountType.Savings ||
                comboBox.getSelectedItem() != AccountType.CD ||
                comboBox.getSelectedItem() != AccountType.Money_Market){
            JOptionPane.showMessageDialog(getParentFrame(comboBox), 
                    "Please select an Account Type from the Dropdown box!", 
                    "Invalid Account Type" , 
                    JOptionPane.ERROR_MESSAGE);
            
            comboBox.requestFocusInWindow();
            return false;
        }else return true;
    }
    
    public static void errorMessage(String message, JTextField txtField) {
        JOptionPane.showMessageDialog(getParentFrame(txtField), message, 
            "Invalid input",JOptionPane.ERROR_MESSAGE);
        txtField.setText("");
        txtField.requestFocusInWindow();
    }
    
    public static Component getParentFrame(Component c) {
        while (!(c instanceof Frame)) {
            c = c.getParent();
            
            if (c==null) {
                break;
            }
        }
        return c;
    }
}

