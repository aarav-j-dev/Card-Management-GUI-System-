//using import statements to import required features in the project
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;



/**
 * This class is used to create a Graphical User Interface of the bank ATM system and use the codes from other classes as well to create a fully functional system.
 *
 * @author (Aarav Jayswal)
 * @version (5th May,2023)
 */
public class BankGUI implements ActionListener
{   
    //screen resolution 1540 by 820
    //home method instance variables
    private JFrame framehome1;
    private JPanel panelhome1;
    private JPanel panelhome2;
    private JLabel homeheading1;
    private JLabel homeheading2;
    private JLabel homeheading3;
    private Font homestyle1;
    private Font homestyle2;
    private Font homestyle3;
    private Font homestyle4;
    private Font homestyle5;
    private JButton homebutton1;
    private JButton homebutton2;
    
    //debit method variables
    private JFrame framedebit1;
    private JPanel paneldebit1;
    private JPanel paneldebit2;
    private JLabel labellingdebit1;
    private JLabel labellingdebit2;
    private JLabel labellingdebit3;
    private JLabel labellingdebit4;
    private JLabel labellingdebit5;
    private JLabel labellingdebit6;
    private JLabel labellingdebit7;
    private JLabel labellingdebit8;
    private JLabel labellingdebit9;
    private JLabel labellingdebit10;
    private JLabel labellingdebit11;
    private JLabel labellingdebit12;
    private Font debitfontstyle1;
    private Font debitfontstyle2;
    private Font debitfontstyle3;
    private Font debitfontstyle4;
    private Font debitfontstyle5;
    private Font debitfontstyle6;
    private Font debitfontstyle7;
    private Font debitfontstyle8;
    private Font debitfontstyle9;
    private Font debitfontstyle10;
    private Font debitfontstyle11;
    private Font debitfontstyle12;
    private Font debitfontstyle13;
    private Font debitfontstyle14;
    private Font debitfontstyle15;
    private Font debitfontstyle16;
    private Font debitfontstyle17;
    private JTextField debitcardidfield1;
    private JTextField debitclientnamefield2;
    private JTextField debitpinnumberfield3;
    private JTextField debitissuerbankfield4;
    private JTextField debitbalanceamountfield5;
    private JTextField debitbankaccountfield6;
    private JTextField debitcardidfield7;
    private JTextField debitpinnumberfield8;
    private JTextField debitwithdrawlamountfield9;
    private JButton debit_adddebitcard_button1;
    private JButton debit_home_button2;
    private JButton debit_clear_button3;
    private JButton debit_withdraw_button4;
    private JButton debit_display_button5;
    private JComboBox daycomboboxoperate1;
    private JComboBox monthcomboboxoperate2;
    private JComboBox yearcomboboxoperate3;
    
    //credit method variables
    private JFrame framecredit1;
    private JPanel panelcredit1;
    private JPanel panelcredit2;
    private JLabel labellingcredit1;
    private JLabel labellingcredit2;
    private JLabel labellingcredit3;
    private JLabel labellingcredit4;
    private JLabel labellingcredit5;
    private JLabel labellingcredit6;
    private JLabel labellingcredit7;
    private JLabel labellingcredit8;
    private JLabel labellingcredit9;
    private JLabel labellingcredit10;
    private JLabel labellingcredit11;
    private JLabel labellingcredit12;
    private JLabel labellingcredit13;
    private JLabel labellingcredit14;
    private Font creditfontstyle1;
    private Font creditfontstyle2;
    private Font creditfontstyle3;
    private Font creditfontstyle4;
    private Font creditfontstyle5;
    private Font creditfontstyle6;
    private Font creditfontstyle7;
    private Font creditfontstyle8;
    private Font creditfontstyle9;
    private Font creditfontstyle10;
    private Font creditfontstyle11;
    private Font creditfontstyle12;
    private Font creditfontstyle13;
    private Font creditfontstyle14;
    private Font creditfontstyle15;
    private Font creditfontstyle16;
    private Font creditfontstyle17;
    private Font creditfontstyle18;
    private Font creditfontstyle19;
    private Font creditfontstyle20;
    private JTextField credit_cardid_field1;
    private JTextField credit_clientname_field2;
    private JTextField credit_cvcnumber_field3;
    private JTextField credit_issuerbank_field4;
    private JTextField credit_balanceamount_field5;
    private JTextField credit_bankaccount_field6;
    private JTextField credit_interestrate_field7;
    private JTextField credit_cardid_field8;
    private JTextField credit_cardid_field9;
    private JTextField credit_creditlimit_field10;
    private JTextField credit_graceperiod_field11;
    private JButton credit_addcreditcard_button1;
    private JButton credit_cancelcreditcard_button2;
    private JButton credit_home_button3;
    private JButton credit_clear_button4;
    private JButton credit_setcreditlimit_button5;
    private JButton credit_display_button6;
    private JComboBox daycombobox1;
    private JComboBox monthcombobox2;
    private JComboBox yearcombobox3;
    
    
    
    //creating array list for BankCard class type
    ArrayList<BankCard> anArray = new ArrayList<BankCard>();
    //declaring a boolean variable

    public void actionPerformed(ActionEvent e)
    {   
        //button to go to debit card frame
        if(e.getSource() == homebutton1)
        {
            debit();
            framehome1.dispose();
        }
        //button to go to credit card frame
        else if(e.getSource() == homebutton2)
        {
            credit();
            framehome1.dispose();
        }
        //add debit card details of the text fields
        else if(e.getSource() == debit_adddebitcard_button1)
        {   
            //using exception for any conversion errors
            try
            {   
                //getting the text field details and storing them in variables of respective data type
                int cardid = Integer.valueOf(debitcardidfield1.getText());
                String ClientName = debitclientnamefield2.getText();
                int PinNumber = Integer.valueOf(debitpinnumberfield3.getText());
                String IssuerBank = debitissuerbankfield4.getText();
                int BalanceAmount = Integer.valueOf(debitbalanceamountfield5.getText());
                String BankAccount = debitbankaccountfield6.getText();
                boolean a = true;
                //iterating through the arraylist
                for(BankCard obj2: anArray)
                {   
                    //verifying the object inside of the arraylist
                    if(obj2 instanceof DebitCard)
                    {   
                        //object down casting
                        DebitCard auto_obj = (DebitCard) obj2;
                        if(auto_obj.getcardId() == cardid)
                        {
                            a = false;
                        }
                    }
                }
                //object initialization
                if(a == true)
                {   
                    //checking if the text fields of string data type are empty
                    if(debitclientnamefield2.getText().equals("") )
                    {
                        JOptionPane.showMessageDialog(paneldebit1, "Please enter the client name!!!");
                                
                    }
                    if(debitissuerbankfield4.getText().equals("") )
                    {
                        JOptionPane.showMessageDialog(paneldebit1, "Please enter the issuer bank!!!");
                                
                    }
                    if(debitbankaccountfield6.getText().equals(""))
                    {
                        JOptionPane.showMessageDialog(paneldebit1, "Please enter the bank account!!!");
                                
                    }
                    else
                    {   
                        //object creation/initalization of DebitCard class
                        DebitCard debit_obj = new DebitCard(BalanceAmount,cardid,BankAccount,IssuerBank, ClientName, PinNumber);
                        anArray.add(debit_obj);
                        //Message dialog
                        JOptionPane.showMessageDialog(paneldebit1, "Successfully added debit card! " +"Card ID " + cardid + " added.");
                            
                    }  
                }
                else
                {
                    JOptionPane.showMessageDialog(paneldebit1, "Card ID " +cardid + " already present. Enter a new card ID");
                }
            }
            catch(NumberFormatException numformat)
            {   
                if(debitclientnamefield2.getText().equals("") )
                {
                    JOptionPane.showMessageDialog(paneldebit1, "Please enter the client name!!!");
                                
                }
                if(debitissuerbankfield4.getText().equals("") )
                {
                    JOptionPane.showMessageDialog(paneldebit1, "Please enter the issuer bank!!!");
                                
                }
                if(debitbankaccountfield6.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(paneldebit1, "Please enter the bank account!!!");
                                
                }
                if(debitcardidfield1.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(paneldebit1, "Please enter Card ID");
                }
                if(debitpinnumberfield3.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(paneldebit1, "Please enter pin number.");
                }
                if(debitbalanceamountfield5.getText().isEmpty())
                {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
                    JOptionPane.showMessageDialog(paneldebit1, "Please enter balance amount");
                } 
                else
                {
                    JOptionPane.showMessageDialog(paneldebit1, "Please enter the details in a valid format!!!");
                }
            }
        }
        //return to home method
        else if(e.getSource() == debit_home_button2)
        {
            home();
            framedebit1.dispose();
        }
        //setting debit text fields empty
        else if(e.getSource() == debit_clear_button3)
        {
           debitcardidfield1.setText("");  
           debitclientnamefield2.setText("");  
           debitpinnumberfield3.setText(""); 
           debitissuerbankfield4.setText("");
           debitbalanceamountfield5.setText("");
           debitbankaccountfield6.setText("");
           debitcardidfield7.setText("");
           debitpinnumberfield8.setText("");
           debitwithdrawlamountfield9.setText("");
        }
        //withdraw in the debit card class gui
        else if(e.getSource() == debit_withdraw_button4)
        {   
            try{    
                    //getting the text field details and storing them in variables of respective data type
                    int cardid = Integer.valueOf(debitcardidfield7.getText());
                    int withdrawamount = Integer.valueOf(debitwithdrawlamountfield9.getText());
                    int pinnumber = Integer.valueOf(debitpinnumberfield8.getText());
                    String day = daycomboboxoperate1.getSelectedItem().toString();
                    String month = monthcomboboxoperate2.getSelectedItem().toString();
                    String year = yearcomboboxoperate3.getSelectedItem().toString();
                    String withdrawdate = day + "/" + month + "/" + year;
                    //iterating through the arraylist
                    for(BankCard obj2: anArray)
                    {   
                        //verifying the object inside of the arraylist
                        if(obj2 instanceof DebitCard)
                        {   
                            //object down casting
                            DebitCard auto_obj = (DebitCard) obj2;
                            //verifying cardid with the card id inside the arraylist object
                            if(auto_obj.getcardId() == cardid)
                            {
                                JOptionPane.showMessageDialog(paneldebit1, "Card ID is :"+cardid+"!"+ "\n"+"Withdraw Amount is :"+withdrawamount+"!"+"\n"+"Pin Number is :"+pinnumber+"!"+"\n"+"Date of Withdraw is :"+withdrawdate+"!");
                                if (pinnumber== auto_obj.getPINnumber())
                                {
                                    if(withdrawamount <= auto_obj.getBalanceAmount())
                                    {   
                                        //call withdraw method
                                        auto_obj.Withdraw(withdrawamount,withdrawdate,pinnumber);
                                        JOptionPane.showMessageDialog(paneldebit1, "Successfully withdrawn!!!"+"\n"+"Card ID is :"+cardid+"!"+ "\n"+"Withdraw Amount is :"+withdrawamount+"!"+"\n"+"Date of Withdraw is :"+withdrawdate+"!"+"\n"+"New Balance is: "+ auto_obj.getBalanceAmount());
                                         break;
                                    }
                                    else
                                    {
                                        JOptionPane.showMessageDialog(paneldebit1, "Insufficient Balance");
                                        break;
                                    }
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(paneldebit1, "PIN NUMBER  does not match. Enter a PIN NUMBER");
                                }
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(paneldebit1, "Card ID " +cardid + " not valid. Enter a valid card ID");
                            }
                        }
                    }
                }
                catch(NumberFormatException u)
                {
                    if(debitcardidfield7.getText().isEmpty())
                    {
                        JOptionPane.showMessageDialog(paneldebit1, "Please enter Card ID");
                    }
                    if(debitpinnumberfield8.getText().isEmpty())
                    {
                        JOptionPane.showMessageDialog(paneldebit1, "Please enter Pin Number");
                    }
                    if(debitwithdrawlamountfield9.getText().isEmpty())
                    {
                        JOptionPane.showMessageDialog(paneldebit1, "Please enter withdrawl amount.");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(paneldebit1, "Please enter the details in a valid format!!!");
                    }
                }
        }
        
        //display debit card details
        else if(e.getSource() == debit_display_button5)
        {   
            //iterating inside the arraylist
            for(BankCard obj2: anArray)
            {   
                //verifying object inside the arraylist
                if(obj2 instanceof DebitCard)
                {   
                    //object down casting
                    DebitCard auto_obj = (DebitCard) obj2;
                    //calling the display method of the debit card class 
                    auto_obj.display();
                    if(auto_obj.gethasWithdrawn() == true)
                    {
                        JOptionPane.showMessageDialog(paneldebit1, "Card ID is :"+auto_obj.getcardId()+"!"+"\n"+"STATUS of withdraw: "+auto_obj.gethasWithdrawn()+"\n"+"Client Name is :"+auto_obj.getclientname()+"!"+"\n"+"Issuer Bank is :"+auto_obj.getissuerBank()+"!"+"\n"+"Bank Account is :"+auto_obj.getbankaccount()+"!"+ "\n"+"Balance Amount is :"+auto_obj.getBalanceAmount()+"!"+"\n"+"Pin Number is :"+auto_obj.getPINnumber()+"!"+"\n"+"Date of Withdraw is :"+auto_obj.getdateofWithdrawal()+"!"+"\n"+"Withdraw Amount is :"+auto_obj.getWithdrawalAmount());
                    } 
                    else
                    {   
                        JOptionPane.showMessageDialog(paneldebit1, "Card ID is :"+auto_obj.getcardId()+"!"+"\n"+"STATUS of withdraw: "+auto_obj.gethasWithdrawn()+"\n"+"Client Name is :"+auto_obj.getclientname()+"!"+"\n"+"Issuer Bank is :"+auto_obj.getissuerBank()+"!"+"\n"+"Bank Account is :"+auto_obj.getbankaccount()+"!"+ "\n"+"Balance Amount is :"+auto_obj.getBalanceAmount()+"!"+"\n"+"Pin Number is :"+auto_obj.getPINnumber()+"!");
                    }
               }
            }
        }
        //add credit card details in the arraylist object  

        else if(e.getSource() == credit_addcreditcard_button1)
        {   
            try{    
                    //getting the text field details and storing them in variables of respective data type
                    int cardId = Integer.valueOf(credit_cardid_field1.getText());
                    String bankaccount = credit_bankaccount_field6.getText();
                    String issuerBank = credit_issuerbank_field4.getText();
                    String clientname = credit_clientname_field2.getText();
                    int CVCnumber = Integer.valueOf(credit_cvcnumber_field3.getText());
                    double InterestRate = Double.parseDouble(credit_interestrate_field7.getText());
                    int BalanceAmount = Integer.valueOf(credit_balanceamount_field5.getText());
                    String day = daycombobox1.getSelectedItem().toString();
                    String month = monthcombobox2.getSelectedItem().toString();
                    String year = yearcombobox3.getSelectedItem().toString();
                    String ExpirationDate = day + "/" + month + "/" + year;
                    boolean b = true;
                    //iterating through the arraylist
                    for(BankCard obj3: anArray)
                    {   
                        //verifyying the object inside of the arraylist
                        if(obj3 instanceof CreditCard)
                        {   
                            //object down casting
                            CreditCard auto_credit_obj = (CreditCard) obj3;
                            if(auto_credit_obj.getcardId() == cardId)
                            {
                                b = false;
                            }
                        }
                    }
                    //object creation
                    if (b==true)
                    {   
                        if(credit_clientname_field2.getText().equals(""))
                        {
                            JOptionPane.showMessageDialog(panelcredit1, "Please enter client name");
                        }
                        if(credit_issuerbank_field4.getText().equals(""))
                        {
                            JOptionPane.showMessageDialog(panelcredit1, "Please enter issuer bank");
                        }
                        if(credit_bankaccount_field6.getText().equals(""))
                        {
                            JOptionPane.showMessageDialog(panelcredit1, "Please enter bank account.");
                        }
                        else
                        {
                            
                        
                            //object creation/initialization of CreditCard class
                            CreditCard credit_obj = new CreditCard(cardId,bankaccount,BalanceAmount, issuerBank, clientname,CVCnumber,InterestRate, ExpirationDate);
                            anArray.add(credit_obj);
                
                            //Message dialog
                            JOptionPane.showMessageDialog(panelcredit1, "Successfully added credit card " + cardId +"!");
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(panelcredit1, "Card ID " + cardId+ " already present. Enter a new card ID");  
                    }
            }
            catch(NumberFormatException v)
            {   
                if(credit_cardid_field1.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(panelcredit1, "Please enter Card ID");
                }
                if(credit_clientname_field2.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(panelcredit1, "Please enter client name");
                }
                if(credit_cvcnumber_field3.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(panelcredit1, "Please enter cvc number.");
                }
                if(credit_issuerbank_field4.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(panelcredit1, "Please enter issuer bank");
                }
                if(credit_balanceamount_field5.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(panelcredit1, "Please enter balance amount");
                }
                if(credit_bankaccount_field6.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(panelcredit1, "Please enter bank account.");
                }
                if(credit_interestrate_field7.getText().isEmpty())
                {
                     JOptionPane.showMessageDialog(panelcredit1, "Please enter interest rate.");
                }
                else
                {
                    JOptionPane.showMessageDialog(panelcredit1, "Please enter the details in a valid format!!!");
                }
            }
        }
        //button to cancel the credit card
        else if(e.getSource() == credit_cancelcreditcard_button2)
        {   
            try{    
                    //getting the text field details and storing them in variables of respective data type
                    int cardId = Integer.valueOf(credit_cardid_field8.getText());
                    //iterating through the arraylist
                    for(BankCard obj3: anArray)
                    {   //verifyying the object inside of the arraylist
                        if(obj3 instanceof CreditCard)
                        {   
                            //object down casting
                            CreditCard auto_credit_obj = (CreditCard) obj3;
                            if(auto_credit_obj.getcardId() == cardId)
                            {
                                auto_credit_obj.cancelCreditCard();
                                JOptionPane.showMessageDialog(panelcredit1, "The card has been successfully terminated.");
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(panelcredit1, "Card ID " +cardId + " not valid. Enter a valid card ID");
                            }
                        }
                    }
                }
            catch(NumberFormatException w)
            {   
                if(credit_cardid_field8.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(panelcredit1, "Please enter card id");
                }
                else
                {
                    JOptionPane.showMessageDialog(panelcredit1, "Please enter the details in a valid format!!!");    
                }
            }
        }
        //button to return to home method
        else if(e.getSource() == credit_home_button3)
        {
           home();
           framecredit1.dispose();
        }
        //button to clear the text fields of credit card 
        else if(e.getSource() == credit_clear_button4)
        {
           credit_cardid_field1.setText("");  
           credit_clientname_field2.setText("");  
           credit_cvcnumber_field3.setText("");
           credit_issuerbank_field4.setText("");
           credit_balanceamount_field5.setText("");
           credit_bankaccount_field6.setText("");
           credit_interestrate_field7.setText("");
           credit_cardid_field8.setText("");
           credit_cardid_field9.setText("");
           credit_creditlimit_field10.setText("");
           credit_graceperiod_field11.setText("");
        }
        //button to set the credit limit
        else if(e.getSource() == credit_setcreditlimit_button5)
        {   
            try
            {    
                //getting the text field details and storing them in variables of respective data type
                int cardId = Integer.valueOf(credit_cardid_field9.getText());
                int graceperiod = Integer.valueOf(credit_graceperiod_field11.getText());
                double creditlimit = Double.parseDouble(credit_creditlimit_field10.getText());
                //iterating through arraylist
                for(BankCard obj3: anArray)
                {   
                    //verifying the object inside the arraylist
                    if(obj3 instanceof CreditCard)
                    {   
                        //object downcasting
                        CreditCard auto_credit_obj = (CreditCard) obj3;
                        if(auto_credit_obj.getcardId() == cardId)
                        {   
                            //calling the setCreditLimit method from the respective class
                            auto_credit_obj.setCreditLimit(creditlimit,graceperiod);
                            JOptionPane.showMessageDialog(panelcredit1, "The Card ID is: "+cardId+"!"+"\n"+"The Grace Period is: "+graceperiod+"!"+"\n"+"The Credit Limit is: "+creditlimit+"!");
                            if(creditlimit <= 2.5 * auto_credit_obj.getBalanceAmount())
                            {
                                JOptionPane.showMessageDialog(panelcredit1, "Credit Granted Successully!!!");
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(panelcredit1, "CREDIT CANNOT BE GRANTED!!!");
                            }
                        }
                        
                        else
                        {
                            JOptionPane.showMessageDialog(panelcredit1, "Card ID " +cardId + " not valid. Enter a valid card ID");
                        }
                    }
                }                    
            }
            catch(NumberFormatException x)
            {   
                if(credit_cardid_field9.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(panelcredit1, "Please enter card id");
                }
                if(credit_graceperiod_field11.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(panelcredit1, "Please enter grace period");
                }
                if(credit_creditlimit_field10.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(panelcredit1, "Please enter credit limit");
                }
                else
                {
                    JOptionPane.showMessageDialog(panelcredit1, "Please enter the details in a valid format!!!");
                }
            }
        }
        //button to display the details inside the credit card
        else if(e.getSource() == credit_display_button6)
        {   
            //iterating through arraylist
            for(BankCard obj3: anArray)
            {   
                //verifying the object inside the arraylist
                if(obj3 instanceof CreditCard)
                {   
                    //object down casting
                    CreditCard credit_auto_obj = (CreditCard) obj3;
                    credit_auto_obj.display();
                    if(credit_auto_obj.getisGranted() == true)
                    {   
                        JOptionPane.showMessageDialog(panelcredit1, "The credit has been granted successfully"+"\n"+"Status of Grant:"+credit_auto_obj.getisGranted()+"\n"+"Card ID is :"+credit_auto_obj.getcardId()+"!"+"\n"+"Client Name is: "+credit_auto_obj.getclientname()+"\n"+"CVC number is: "+credit_auto_obj.getCVCnumber()+"!"+"\n"+"Interest Rate: "+credit_auto_obj.getInterestRate()+"!"+"\n"+"Expiration Date: "+credit_auto_obj.getExpirationDate()+"!"+"\n"+"Issuer Bank: "+credit_auto_obj.getissuerBank()+"!"+"\n" + "Balance Amount is: " + credit_auto_obj.getBalanceAmount()+"!"+"\n"+ "Bank Account: "+credit_auto_obj.getbankaccount()+"!"+"\n"+ "Credit Limit is: "+credit_auto_obj.getCreditLimit()+"!"+"\n"+"Grace Period is: "+credit_auto_obj.getGracePeriod()+"!");
                    }
                    else
                    {          
                        JOptionPane.showMessageDialog(panelcredit1, "The credit has not been granted yet"+"\n"+"Card ID is :"+credit_auto_obj.getcardId()+"!"+"\n"+"Status of Grant:"+credit_auto_obj.getisGranted()+"\n"+"Client Name is: "+credit_auto_obj.getclientname()+"\n"+"CVC number is: "+credit_auto_obj.getCVCnumber()+"!"+"\n"+"Interest Rate: "+credit_auto_obj.getInterestRate()+"!"+"\n"+"Expiration Date: "+credit_auto_obj.getExpirationDate()+"!"+"\n"+"Issuer Bank: "+credit_auto_obj.getissuerBank()+"!"+"\n" + "Balance Amount is: " + credit_auto_obj.getBalanceAmount()+"!"+"\n"+ "Bank Account: "+credit_auto_obj.getbankaccount()+"!");     
                    }
               }
            }
        }
    }
    //main method initializing the object of class BankGUI
    public static void main(String[] args)
    {
        BankGUI obj = new BankGUI();
        obj.home();
    }
    //home method which has button to move on to next two methods
    public void home()
    {   
        //creating a JFrame
        framehome1 = new JFrame();
        framehome1.setTitle("ABC BANK");
        framehome1.setBounds(250, 0, 1040, 820);
        //setResizable false to maintain consistency of the set bounds
        framehome1.setResizable(false );
        framehome1.setLayout(null);
        
        //creating a JPanel
        panelhome1 = new JPanel();
        panelhome1.setBounds(25,0,1020,760);
        panelhome1.setBackground(Color.PINK);
        panelhome1.setLayout(null);
        
        //creating another JPanel
        panelhome2 = new JPanel();
        panelhome2.setBounds(0,400,500,400);
        panelhome2.setBackground(Color.PINK);
        panelhome2.setLayout(null); 
        
        
        //creating JLabel to display messages
        homeheading1 = new JLabel();
        homeheading1.setText("ABC BANK, KAMALPOKHARI-32");
        homeheading1.setBounds(250,50, 700, 50);
        homestyle1 = new Font("Times New Roman", Font.BOLD, 28);
        homeheading1.setFont(homestyle1);
        panelhome1.add(homeheading1);
        
        //creating JLabel to display messages
        homeheading2 = new JLabel();
        homeheading2.setText("GREETINGS!!!");
        homeheading2.setBounds(410,160, 700, 50);
        homestyle4 = new Font("Times New Roman", Font.BOLD,20);
        homeheading2.setFont(homestyle4);
        panelhome1.add(homeheading2);
        
        //creating JLabel to display messages
        homeheading3 = new JLabel();
        homeheading3.setText("Please select an option to continue!!!");
        homeheading3.setBounds(325,200, 700, 50);
        homestyle5 = new Font("Times New Roman", Font.BOLD,20);
        homeheading3.setFont(homestyle5);
        panelhome1.add(homeheading3);
        
        //creating buttons to perform respective actions adding action listener 
        homebutton1 = new JButton();
        homebutton1.setText("DEBIT CARD");
        homebutton1.setBounds(350,280, 250, 100);
        homebutton1.setForeground(Color.WHITE);
        homebutton1.setBackground(Color.DARK_GRAY);
        homestyle2 = new Font("Times New Roman", Font.BOLD, 22);
        homebutton1.setFont(homestyle2);
        homebutton1.addActionListener(this);
        panelhome1.add(homebutton1);
        
        //creating buttons to perform respective actions adding action listener 
        homebutton2 = new JButton();
        homebutton2.setText("CREDIT CARD");
        homebutton2.setBounds(350,430, 250, 100);
        homebutton2.setForeground(Color.WHITE);
        homebutton2.setBackground(Color.DARK_GRAY);
        homestyle3 = new Font("Times New Roman", Font.BOLD, 22);
        homebutton2.setFont(homestyle3);
        homebutton2.addActionListener(this);
        panelhome1.add(homebutton2);
        
        framehome1.add(panelhome1);
        framehome1.add(panelhome2);
        framehome1.setVisible(true);
    }
    public void debit()
    {   
        //creating a JFrame
        framedebit1 = new JFrame();
        framedebit1.setTitle("ABC BANK");
        framedebit1.setBounds(250, 0, 1040, 820);
        //setResizable false to maintain consistency of the set bounds
        framedebit1.setResizable(false);
        framedebit1.setLayout(null);
        
        //creating a JPanel
        paneldebit1 = new JPanel();
        paneldebit1.setBounds(25,0,1020,760);
        paneldebit1.setBackground(Color.PINK);
        paneldebit1.setLayout(null);
        
        //creating a JPanel
        paneldebit2 = new JPanel();
        paneldebit2.setBounds(0,400,500,400);
        paneldebit2.setBackground(Color.PINK);
        paneldebit2.setLayout(null); 
        
        //creating JLabel to display messages
        labellingdebit1 = new JLabel();
        labellingdebit1.setText("ABC BANK, KAMALPOKHARI-32");
        labellingdebit1.setBounds(250,50, 700, 50);
        debitfontstyle1 = new Font("Times New Roman", Font.BOLD, 28);
        labellingdebit1.setFont(debitfontstyle1);
        paneldebit1.add(labellingdebit1);
        
        //creating JLabel to display messages
        labellingdebit2 = new JLabel();
        labellingdebit2.setText("DEBIT CARD");
        labellingdebit2.setBounds(400,150, 200, 50);
        debitfontstyle2 = new Font("Times New Roman", Font.BOLD, 24);
        labellingdebit2.setFont(debitfontstyle2);
        paneldebit1.add(labellingdebit2);
        
        //creating JLabel to display messages
        labellingdebit3 = new JLabel();
        labellingdebit3.setText("Card ID:");
        labellingdebit3.setBounds(100,250, 150, 50);
        debitfontstyle3 = new Font("Times New Roman", Font.BOLD, 16);
        labellingdebit3.setFont(debitfontstyle3);
        paneldebit1.add(labellingdebit3);
        
        //creating JTextField to input messages
        debitcardidfield1 = new JTextField();
        debitcardidfield1.setBounds(250,260, 180, 25);
        paneldebit1.add(debitcardidfield1);
        
        //creating JLabel to display messages
        labellingdebit4 = new JLabel();
        labellingdebit4.setText("Client Name:");
        labellingdebit4.setBounds(100,300, 150, 50);
        debitfontstyle4 = new Font("Times New Roman", Font.BOLD, 16);
        labellingdebit4.setFont(debitfontstyle4);
        paneldebit1.add(labellingdebit4);
        
        //creating JTextField to input messages
        debitclientnamefield2 = new JTextField();
        debitclientnamefield2.setBounds(250,310, 180, 25);
        paneldebit1.add(debitclientnamefield2);
        
        //creating JLabel to display messages
        labellingdebit5 = new JLabel();
        labellingdebit5.setText("Pin Number:");
        labellingdebit5.setBounds(100,350, 150, 50);
        debitfontstyle5 = new Font("Times New Roman", Font.BOLD, 16);
        labellingdebit5.setFont(debitfontstyle5);
        paneldebit1.add(labellingdebit5);
        
        //creating JTextField to input messages
        debitpinnumberfield3 = new JTextField();
        debitpinnumberfield3.setBounds(250,360, 180, 25);
        paneldebit1.add(debitpinnumberfield3);
        
        //creating JLabel to display messages
        labellingdebit6 = new JLabel();
        labellingdebit6.setText("Issuer Bank:");
        labellingdebit6.setBounds(500,250, 200, 50);
        debitfontstyle6 = new Font("Times New Roman", Font.BOLD, 16);
        labellingdebit6.setFont(debitfontstyle6);
        paneldebit1.add(labellingdebit6);
        
        //creating JTextField to input messages
        debitissuerbankfield4 = new JTextField();
        debitissuerbankfield4.setBounds(650,260, 180, 25);
        paneldebit1.add(debitissuerbankfield4);
        
        //creating JLabel to display messages
        labellingdebit7 = new JLabel();
        labellingdebit7.setText("Balance Amount:");
        labellingdebit7.setBounds(500,300, 200, 50);
        debitfontstyle7 = new Font("Times New Roman", Font.BOLD, 16);
        labellingdebit7.setFont(debitfontstyle7);
        paneldebit1.add(labellingdebit7);
        
        //creating JTextField to input messages
        debitbalanceamountfield5 = new JTextField();
        debitbalanceamountfield5.setBounds(650,310, 180, 25);
        paneldebit1.add(debitbalanceamountfield5);
        
        //creating JLabel to display messages
        labellingdebit8 = new JLabel();
        labellingdebit8.setText("Bank Account:");
        labellingdebit8.setBounds(500,350, 200, 50);;
        debitfontstyle8 = new Font("Times New Roman", Font.BOLD, 16);
        labellingdebit8.setFont(debitfontstyle8);
        paneldebit1.add(labellingdebit8);
        
        //creating JTextField to input messages
        debitbankaccountfield6 = new JTextField();
        debitbankaccountfield6.setBounds(650,360, 180, 25);
        paneldebit1.add(debitbankaccountfield6);
        
        //creating JButton to carry out respective tasks using action listener
        debit_adddebitcard_button1  = new JButton();
        debit_adddebitcard_button1.setText("ADD DEBIT CARD");
        debit_adddebitcard_button1.setBounds(370,420, 220, 50);
        debitfontstyle9 = new Font("Times New Roman", Font.BOLD, 18);
        debit_adddebitcard_button1.setFont(debitfontstyle9);
        debit_adddebitcard_button1.setBackground(Color.YELLOW);
        debit_adddebitcard_button1.addActionListener(this);
        paneldebit1.add(debit_adddebitcard_button1);
        
        //creating JButton to carry out respective tasks using action listener
        debit_home_button2 = new JButton();
        debit_home_button2.setText("HOME");
        debit_home_button2.setBounds(100,160, 100, 30);
        debitfontstyle10 = new Font("Times New Roman", Font.BOLD, 18);
        debit_home_button2.setFont(debitfontstyle10);
        debit_home_button2.setBackground(Color.RED);
        debit_home_button2.setForeground(Color.WHITE);
        debit_home_button2.addActionListener(this);
        paneldebit1.add(debit_home_button2);
        
        //creating JButton to carry out respective tasks using action listener
        debit_clear_button3 = new JButton();
        debit_clear_button3.setText("CLEAR");
        debit_clear_button3.setBounds(730,160, 100, 30);
        debitfontstyle11 = new Font("Times New Roman", Font.BOLD, 18);
        debit_clear_button3.setFont(debitfontstyle11);
        debit_clear_button3.setBackground(Color.RED);
        debit_clear_button3.setForeground(Color.WHITE);
        debit_clear_button3.addActionListener(this);
        paneldebit1.add(debit_clear_button3);
        
        //creating JButton to carry out respective tasks using action listener
        debit_withdraw_button4 = new JButton();
        debit_withdraw_button4.setText("WITHDRAW");
        debit_withdraw_button4.setBounds(650,540, 180, 50);
        debitfontstyle12 = new Font("Times New Roman", Font.BOLD, 18);
        debit_withdraw_button4.setFont(debitfontstyle12);
        debit_withdraw_button4.setBackground(Color.GREEN);
        debit_withdraw_button4.addActionListener(this);
        paneldebit1.add(debit_withdraw_button4);
        
        //creating JButton to carry out respective tasks using action listener
        debit_display_button5 = new JButton();
        debit_display_button5.setText("DISPLAY");
        debit_display_button5.setBounds(370,700, 220, 25);
        debitfontstyle13 = new Font("Times New Roman", Font.BOLD, 18);
        debit_display_button5.setFont(debitfontstyle13);
        debit_display_button5.setBackground(Color.MAGENTA);
        debit_display_button5.addActionListener(this);
        paneldebit1.add(debit_display_button5);
        
        //creating JLabel to display messages
        labellingdebit11 = new JLabel();
        labellingdebit11.setText("Card ID:");
        labellingdebit11.setBounds(100,500, 150, 50);
        debitfontstyle16 = new Font("Times New Roman", Font.BOLD, 16);
        labellingdebit11.setFont(debitfontstyle16);
        paneldebit1.add(labellingdebit11);
        
        //creating JTextField to input messages
        debitcardidfield7 = new JTextField();
        debitcardidfield7.setBounds(250,510, 180, 25);
        paneldebit1.add(debitcardidfield7);
        
        //creating JLabel to display messages
        labellingdebit12 = new JLabel();
        labellingdebit12.setText("Pin Number:");
        labellingdebit12.setBounds(100,550, 150, 50);
        debitfontstyle17 = new Font("Times New Roman", Font.BOLD, 16);
        labellingdebit12.setFont(debitfontstyle17);
        paneldebit1.add(labellingdebit12);
        
        //creating JTextField to input messages
        debitpinnumberfield8 = new JTextField();
        debitpinnumberfield8.setBounds(250,560, 180, 25);
        paneldebit1.add(debitpinnumberfield8);
        
        //creating JLabel to display messages
        labellingdebit9 = new JLabel();
        labellingdebit9.setText("Withdrawl Amount:");
        labellingdebit9.setBounds(100,600, 150, 50);
        debitfontstyle14 = new Font("Times New Roman", Font.BOLD, 16);
        labellingdebit9.setFont(debitfontstyle14);
        paneldebit1.add(labellingdebit9);
        
        //creating JTextField to input messages
        debitwithdrawlamountfield9 = new JTextField();
        debitwithdrawlamountfield9.setBounds(250,610, 180, 25);
        paneldebit1.add(debitwithdrawlamountfield9);
        
        //creating JLabel to display messages
        labellingdebit10 = new JLabel();
        labellingdebit10.setText("Date of Withdrawl:");
        labellingdebit10.setBounds(100,650, 150, 50);
        debitfontstyle15 = new Font("Times New Roman", Font.BOLD, 16);
        labellingdebit10.setFont(debitfontstyle15);
        paneldebit1.add(labellingdebit10);
        
        //using DefaultComboBoxModel to store values in it
        DefaultComboBoxModel<String> day = new DefaultComboBoxModel<>();
        for(int i = 1; i<33; i++)
        {   
            day.addElement(String.valueOf(i)); 
        }
        
        //creating a combobox to ask the input values
        daycomboboxoperate1 = new JComboBox(day);
        daycomboboxoperate1.setBounds(250,660, 50, 25);
        daycomboboxoperate1.setBackground(Color.LIGHT_GRAY);
        paneldebit1.add(daycomboboxoperate1);
        
        //creating an array to store values
        String month []= {"January","February","March","April","May","June","July","August","September","October","November","December"};
        //creating a combobox to ask the input values
        monthcomboboxoperate2= new JComboBox(month);
        monthcomboboxoperate2.setBounds(320,660, 100, 25);
        monthcomboboxoperate2.setBackground(Color.LIGHT_GRAY);
        paneldebit1.add(monthcomboboxoperate2);
        
        //using DefaultComboBoxModel to store values in it
        DefaultComboBoxModel<String> year = new DefaultComboBoxModel<>();
        for(int i = 2023; i>=1990; i--)
        {   
            year.addElement(String.valueOf(i)); 
        }
        //creating a combobox to ask the input values
        yearcomboboxoperate3 = new JComboBox(year);
        yearcomboboxoperate3.setBounds(440,660, 100, 25);
        yearcomboboxoperate3.setBackground(Color.LIGHT_GRAY);
        paneldebit1.add(yearcomboboxoperate3);
        
        framedebit1.add(paneldebit1);
        framedebit1.add(paneldebit2);
        framedebit1.setVisible(true);
    }
    public void credit()
    {   
        //creating a frame
        framecredit1 = new JFrame();
        framecredit1.setTitle("ABC BANK");
        framecredit1.setBounds(250, 0, 1040, 820);
        //setResizable false to maintain consistency of the set bounds
        framecredit1.setResizable(false);
        framecredit1.setLayout(null);
        
        //creating a panel
        panelcredit1 = new JPanel();
        panelcredit1.setBounds(25,0,1020,760);
        panelcredit1.setBackground(Color.PINK);
        panelcredit1.setLayout(null);
        
        //creating a panel
        panelcredit2 = new JPanel();
        panelcredit2.setBounds(0,400,500,400);
        panelcredit2.setBackground(Color.PINK);
        panelcredit2.setLayout(null); 
        
        //creating a JLabel to display data
        labellingcredit1 = new JLabel();
        labellingcredit1.setText("ABC BANK, KAMALPOKHARI-32");
        labellingcredit1.setBounds(250,50, 700, 50);
        creditfontstyle1 = new Font("Times New Roman", Font.BOLD, 28);
        labellingcredit1.setFont(creditfontstyle1);
        panelcredit1.add(labellingcredit1);
        
        //creating a JLabel to display data
        labellingcredit2 = new JLabel();
        labellingcredit2.setText("CREDIT CARD");
        labellingcredit2.setBounds(400,150, 200, 50);
        creditfontstyle2 = new Font("Times New Roman", Font.BOLD, 24);
        labellingcredit2.setFont(creditfontstyle2);
        panelcredit1.add(labellingcredit2);
        
        //creating a JLabel to display data
        labellingcredit3 = new JLabel();
        labellingcredit3.setText("Card ID:");
        labellingcredit3.setBounds(100,250, 150, 50);
        creditfontstyle3 = new Font("Times New Roman", Font.BOLD, 16);
        labellingcredit3.setFont(creditfontstyle3);
        panelcredit1.add(labellingcredit3);
        
        //creating a JTextField to input user values
        credit_cardid_field1 = new JTextField();
        credit_cardid_field1.setBounds(250,260, 180, 25);
        panelcredit1.add(credit_cardid_field1);
        
        //creating a JLabel to display data
        labellingcredit4 = new JLabel();
        labellingcredit4.setText("Client Name:");
        labellingcredit4.setBounds(100,300, 150, 50);
        creditfontstyle4 = new Font("Times New Roman", Font.BOLD, 16);
        labellingcredit4.setFont(creditfontstyle4);
        panelcredit1.add(labellingcredit4);
        
        //creating a JTextField to input user values
        credit_clientname_field2 = new JTextField();
        credit_clientname_field2.setBounds(250,310, 180, 25);
        panelcredit1.add(credit_clientname_field2);
        
        //creating a JLabel to display data
        labellingcredit5 = new JLabel();
        labellingcredit5.setText("CVC Number:");
        labellingcredit5.setBounds(100,350, 150, 50);
        creditfontstyle5 = new Font("Times New Roman", Font.BOLD, 16);
        labellingcredit5.setFont(creditfontstyle5);
        panelcredit1.add(labellingcredit5);
        
        //creating a JTextField to input user values
        credit_cvcnumber_field3 = new JTextField();
        credit_cvcnumber_field3.setBounds(250,360, 180, 25);
        panelcredit1.add(credit_cvcnumber_field3);
        
        //creating a JLabel to display data
        labellingcredit6 = new JLabel();
        labellingcredit6.setText("Issuer Bank:");
        labellingcredit6.setBounds(500,250, 200, 50);
        creditfontstyle6 = new Font("Times New Roman", Font.BOLD, 16);
        labellingcredit6.setFont(creditfontstyle6);
        panelcredit1.add(labellingcredit6);
        
        //creating a JTextField to input user values
        credit_issuerbank_field4 = new JTextField();
        credit_issuerbank_field4.setBounds(650,260, 180, 25);
        panelcredit1.add(credit_issuerbank_field4);
        
        //creating a JLabel to display data
        labellingcredit7 = new JLabel();
        labellingcredit7.setText("Balance Amount:");
        labellingcredit7.setBounds(500,300, 200, 50);
        creditfontstyle7 = new Font("Times New Roman", Font.BOLD, 16);
        labellingcredit7.setFont(creditfontstyle7);
        panelcredit1.add(labellingcredit7);
        
        //creating a JTextField to input user values
        credit_balanceamount_field5 = new JTextField();
        credit_balanceamount_field5.setBounds(650,310, 180, 25);
        panelcredit1.add(credit_balanceamount_field5);
        
        //creating a JLabel to display data
        labellingcredit8 = new JLabel();
        labellingcredit8.setText("Bank Account:");
        labellingcredit8.setBounds(500,350, 200, 50);;
        creditfontstyle8 = new Font("Times New Roman", Font.BOLD, 16);
        labellingcredit8.setFont(creditfontstyle8);
        panelcredit1.add(labellingcredit8);
        
        //creating a JTextField to input user values
        credit_bankaccount_field6 = new JTextField();
        credit_bankaccount_field6.setBounds(650,360, 180, 25);
        panelcredit1.add(credit_bankaccount_field6);
        
        //creating a JLabel to display data
        labellingcredit9 = new JLabel();
        labellingcredit9.setText("Interest Rate:");
        labellingcredit9.setBounds(100,400, 200, 50);
        creditfontstyle15 = new Font("Times New Roman", Font.BOLD, 16);
        labellingcredit9.setFont(creditfontstyle15);
        panelcredit1.add(labellingcredit9);
        
        //creating a JTextField to input user values
        credit_interestrate_field7 = new JTextField();
        credit_interestrate_field7.setBounds(250,410, 180, 25);
        panelcredit1.add(credit_interestrate_field7);
        
        //creating a JLabel to display data
        labellingcredit10 = new JLabel();
        labellingcredit10.setText("Expiration Date:");
        labellingcredit10.setBounds(100,450, 150, 50);
        creditfontstyle16 = new Font("Times New Roman", Font.BOLD, 16);
        labellingcredit10.setFont(creditfontstyle16);
        panelcredit1.add(labellingcredit10);
        
        //using DefaultComboBoxModel to store values in it
        DefaultComboBoxModel<String> day = new DefaultComboBoxModel<>();
        for(int i = 1; i<33; i++)
        {   
            day.addElement(String.valueOf(i)); 
        }
        //creating a combobox to ask the input values
        daycombobox1 = new JComboBox(day);
        daycombobox1.setBounds(250,460, 50, 25);
        daycombobox1.setBackground(Color.LIGHT_GRAY);
        panelcredit1.add(daycombobox1);
            
        //creating an array to store values
        String month []= {"January","February","March","April","May","June","July","August","September","October","November","December"};
        //creating a combobox to ask the input values
        monthcombobox2= new JComboBox(month);
        monthcombobox2.setBounds(320,460, 100, 25);
        monthcombobox2.setBackground(Color.LIGHT_GRAY);
        panelcredit1.add(monthcombobox2);
        
        //using DefaultComboBoxModel to store values in it
        DefaultComboBoxModel<String> year = new DefaultComboBoxModel<>();
        for(int i = 2023; i>=1990; i--)
        {   
            year.addElement(String.valueOf(i)); 
        }
        //creating a combobox to ask the input values
        yearcombobox3 = new JComboBox(year);
        yearcombobox3.setBounds(440,460, 100, 25);
        yearcombobox3.setBackground(Color.LIGHT_GRAY);
        panelcredit1.add(yearcombobox3);
        
        //creating JButton to carry out respective tasks using action listener
        credit_addcreditcard_button1 = new JButton();
        credit_addcreditcard_button1.setText("ADD CREDIT CARD");
        credit_addcreditcard_button1.setBounds(610,420, 220, 50);
        creditfontstyle9 = new Font("Times New Roman", Font.BOLD, 18);
        credit_addcreditcard_button1.setFont(creditfontstyle9);
        credit_addcreditcard_button1.setBackground(Color.YELLOW);
        credit_addcreditcard_button1.addActionListener(this);
        panelcredit1.add(credit_addcreditcard_button1);
        
        //creating a JLabel to display data
        labellingcredit14 = new JLabel();
        labellingcredit14.setText("Card Id:");
        labellingcredit14.setBounds(500,520, 150, 50);
        creditfontstyle20 = new Font("Times New Roman", Font.BOLD, 16);
        labellingcredit14.setFont(creditfontstyle20);
        panelcredit1.add(labellingcredit14);
        
        //creating a JTextField to input user values
        credit_cardid_field8 = new JTextField();
        credit_cardid_field8.setBounds(650,530, 180, 25);
        panelcredit1.add(credit_cardid_field8);
        
        //creating JButton to carry out respective tasks using action listener
        credit_cancelcreditcard_button2 = new JButton();
        credit_cancelcreditcard_button2.setText("CANCEL CREDIT CARD");
        credit_cancelcreditcard_button2.setBounds(580,600, 250, 50);
        creditfontstyle10 = new Font("Times New Roman", Font.BOLD, 18);
        credit_cancelcreditcard_button2.setFont(creditfontstyle10);
        credit_cancelcreditcard_button2.setBackground(Color.RED);
        credit_cancelcreditcard_button2.setForeground(Color.WHITE);
        credit_cancelcreditcard_button2.addActionListener(this);
        panelcredit1.add(credit_cancelcreditcard_button2);
        
        //creating JButton to carry out respective tasks using action listener
        credit_home_button3 = new JButton();
        credit_home_button3.setText("HOME");
        credit_home_button3.setBounds(100,160, 100, 30);
        creditfontstyle11 = new Font("Times New Roman", Font.BOLD, 18);
        credit_home_button3.setFont(creditfontstyle11);
        credit_home_button3.setBackground(Color.RED);
        credit_home_button3.setForeground(Color.WHITE);
        credit_home_button3.addActionListener(this);
        panelcredit1.add(credit_home_button3);
        
        //creating JButton to carry out respective tasks using action listener
        credit_clear_button4 = new JButton();
        credit_clear_button4.setText("CLEAR");
        credit_clear_button4.setBounds(730,160, 100, 30);
        creditfontstyle12 = new Font("Times New Roman", Font.BOLD, 18);
        credit_clear_button4.setFont(creditfontstyle12);
        credit_clear_button4.setBackground(Color.RED);
        credit_clear_button4.setForeground(Color.WHITE);
        credit_clear_button4.addActionListener(this);
        panelcredit1.add(credit_clear_button4);
        
        //creating JButton to carry out respective tasks using action listener
        credit_setcreditlimit_button5 = new JButton();
        credit_setcreditlimit_button5.setText("SET CREDIT LIMIT");
        credit_setcreditlimit_button5.setBounds(210,670, 220, 50);
        creditfontstyle13 = new Font("Times New Roman", Font.BOLD, 18);
        credit_setcreditlimit_button5.setFont(creditfontstyle13);
        credit_setcreditlimit_button5.setBackground(Color.GREEN);
        credit_setcreditlimit_button5.addActionListener(this);
        panelcredit1.add(credit_setcreditlimit_button5);
        
        //creating JButton to carry out respective tasks using action listener
        credit_display_button6 = new JButton();
        credit_display_button6.setText("DISPLAY");
        credit_display_button6.setBounds(645,680, 120, 30);
        creditfontstyle14 = new Font("Times New Roman", Font.BOLD, 16);
        credit_display_button6.setFont(creditfontstyle14);
        credit_display_button6.setBackground(Color.MAGENTA);
        credit_display_button6.addActionListener(this);
        panelcredit1.add(credit_display_button6);
        
        //creating a JLabel to display data
        labellingcredit13 = new JLabel();
        labellingcredit13.setText("Card Id:");
        labellingcredit13.setBounds(100,520, 150, 50);
        creditfontstyle19 = new Font("Times New Roman", Font.BOLD, 16);
        labellingcredit13.setFont(creditfontstyle19);
        panelcredit1.add(labellingcredit13);
        
        //creating a JTextField to input user values
        credit_cardid_field9 = new JTextField();
        credit_cardid_field9.setBounds(250,530, 180, 25);
        panelcredit1.add(credit_cardid_field9);
        
        //creating a JLabel to display data
        labellingcredit11 = new JLabel();
        labellingcredit11.setText("Credit Limit:");
        labellingcredit11.setBounds(100,570, 150, 50);
        creditfontstyle17 = new Font("Times New Roman", Font.BOLD, 16);
        labellingcredit11.setFont(creditfontstyle17);
        panelcredit1.add(labellingcredit11);
        
        //creating a JTextField to input user values
        credit_creditlimit_field10 = new JTextField();
        credit_creditlimit_field10.setBounds(250,580, 180, 25);
        panelcredit1.add(credit_creditlimit_field10);
        
        //creating a JLabel to display data
        labellingcredit12 = new JLabel();
        labellingcredit12.setText("Grace Period:");
        labellingcredit12.setBounds(100,620, 150, 50);
        creditfontstyle18 = new Font("Times New Roman", Font.BOLD, 16);
        labellingcredit12.setFont(creditfontstyle18);
        panelcredit1.add(labellingcredit12);
        
        //creating a JTextField to input user values
        credit_graceperiod_field11 = new JTextField();
        credit_graceperiod_field11.setBounds(250,630, 180, 25);
        panelcredit1.add(credit_graceperiod_field11);
        
        
        
        framecredit1.add(panelcredit1);
        framecredit1.add(panelcredit2);
        framecredit1.setVisible(true);
    }

}

