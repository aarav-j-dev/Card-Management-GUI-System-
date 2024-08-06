
/**
 * This class is used to represent a credit card functionality at a bank of set credit limit and cancel credit limit.
 *
 * @author (Aarav Jayswal)
 * @version (2023/05/4)
 */
//A class CreditCard is created which also inherits the properties of BankCard class
public class CreditCard extends BankCard
{
    //The attributes are being encapsulated by using the keyword private
    private int CVCnumber;
    private double CreditLimit;
    private double InterestRate;
    private String ExpirationDate;
    private int GracePeriod;
    private boolean isGranted;
     //A constructor BankCard is created that accepts six parameters
    public CreditCard(int cardId, String bankaccount, int BalanceAmount, String issuerBank, String clientname, int CVCnumber, double InterestRate, String ExpirationDate)
    {
        //calling the constructor of BankCard class
        super(cardId , bankaccount , BalanceAmount , issuerBank);
        super.setclientname(clientname);
        //The values of parameters are being assigned to the attributes
        this.CVCnumber = CVCnumber;
        this.CreditLimit = CreditLimit;
        this.InterestRate = InterestRate;
        this.ExpirationDate = ExpirationDate;
        this.isGranted = false;
    }
    //getters method used to return the values of the attributes
    public int getCVCnumber()
    {
       return this.CVCnumber; 
    }
    public double getCreditLimit()
    {
       return this.CreditLimit; 
    }
    public double getInterestRate()
    {
       return this.InterestRate; 
    }
    public String getExpirationDate()
    {
       return this.ExpirationDate; 
    }
    public int getGracePeriod()
    {
       return this.GracePeriod; 
    }
    public boolean getisGranted()
    {
       return this.isGranted; 
    }
    /*setters method used to accept two parameter values from the client and assign
     * it to the attributes if condition istrue and display a message  if not*/
    public void setCreditLimit(double CreditLimit, int GracePeriod)
    {
        if(CreditLimit <= 2.5 * super.getBalanceAmount())
        {    
            this.CreditLimit = CreditLimit;
            this.isGranted = true;
            this.GracePeriod = GracePeriod;
        }
        else
        {
            System.out.println("CREDIT CANNOT BE GRANTED!!!");
        }
    }
     //A method is created to cancel the Credit Card
    public void cancelCreditCard()
    {
        this.CVCnumber = 0;
        this.CreditLimit = 0;
        this.GracePeriod = 0;
        this.isGranted = false;
    }
     //A method is created to display the details of class CreditCard
    public void display()
    {   
       if(isGranted == true)
       {
          super.display();
          System.out.println("The credit limit is: " + this.CreditLimit);
          System.out.println("The grace period is: " + this.GracePeriod);
       }
       else
       {
           System.out.println("The CVC number is: " + this.CVCnumber);
           System.out.println("The Interest Rate is: " + this.InterestRate);
           System.out.println("The Expiration Date is: " + this.ExpirationDate);
           System.out.println("The status of isGranted is: " + this.isGranted);
       }
           
    }
}
