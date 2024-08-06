
/**
 * This class is the child class and is used to withdraw the amount and display the speciific details.
 *
 * @author (Aarav Jayswal)
 * @version (4 May, 2023)
 */
//A class DebitCard is created which also inherits the properties of BankCard class
public class DebitCard extends BankCard
{
    //The attributes are being encapsulated by using the keyword private
    private int PINnumber;
    private int WithdrawalAmount;
    private String dateofWithdrawal;
    private boolean hasWithdrawn;
    //A constructor BankCard is created that accepts six parameters
    public DebitCard(int BalanceAmount, int cardId, String bankaccount, String issuerBank, String clientname,int PINnumber)
    {
        //calling the constructor of BankCard class
        super(cardId, bankaccount, BalanceAmount, issuerBank);
        super.setclientname(clientname);
        //The values of parameters are being assigned to the attributes
        this.PINnumber= PINnumber;
        this.hasWithdrawn= false;
    }
    //getters method used to return the values of the attributes
    public int getPINnumber()
    {
       return this.PINnumber; 
    }
     public int getWithdrawalAmount()
    {
       return this.WithdrawalAmount; 
    }
     public String getdateofWithdrawal()
    {
       return this.dateofWithdrawal; 
    }
     public boolean gethasWithdrawn()
    {
       return this.hasWithdrawn; 
    }
    //setters method used to accept the parameter values from the client and assign it to the attributes
    public void setWithdrawalAmount(int WithdrawalAmount)
    {
    this.WithdrawalAmount = WithdrawalAmount;
    }
    //A method is created that accepts three parameters
    public void Withdraw(int WithdrawalAmount, String dateofWithdrawal,int PINnumber)
    {   
        /*A condition to verify entered PINnumber is corrrect to the attributes PINnumber
         * value and WithdrawalAmount is less or equals to BalanceAmount of cass BankCard*/ 
        if(PINnumber == this.PINnumber && WithdrawalAmount <= super.getBalanceAmount())
        {
            this.hasWithdrawn = true;
            //Deducting the withdrawl amount from the balance amount
            int newBalanceAmount = super.getBalanceAmount() - WithdrawalAmount;
            super.setBalanceAmount(newBalanceAmount);
            this.dateofWithdrawal = dateofWithdrawal;
            this.WithdrawalAmount = WithdrawalAmount;
        }
        else
        {
            System.out.println("INVALID TRANSACTION!!!!!");
        }
    }
    //A method is created to display the details of class DebitCard
    public void display()
    {  
       super.display();
       System.out.println("The PIN number is " + this.PINnumber);
       System.out.println("The Withdrawal Amount is: " + this.WithdrawalAmount);
       System.out.println("The Date of Withdrawal is: " + this.dateofWithdrawal);
       if(this.hasWithdrawn == false)
       {
           System.out.println("The balance amount is:" + super.getBalanceAmount());    
       }
       
    }
}
