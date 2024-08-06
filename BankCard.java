
/**
 *This class is the parent class and is used to pass values of the variables in the child classes from the parameters.
 *
 * @author (Aarav Jayswal)
 * @version (4 May,2023)
 */
//A class of BankCard is created
public class BankCard
{   
    //The attributes are being encapsulated by using the keyword private 
    private String clientname;
    private String issuerBank;
    private int cardId;
    private String bankaccount;
    private int BalanceAmount;
    //A constructor BankCard is created that accepts four parameters
    public BankCard(int cardId, String bankaccount, int BalanceAmount,String issuerBank)
      {   
          //The values of parameters are being assigned to the attributes
          this.clientname = "";
          this.cardId = cardId;
          this.bankaccount = bankaccount;
          this.BalanceAmount = BalanceAmount;
          this.issuerBank = issuerBank;
      }
    //getters method used to return the values of the attributes
    public int getcardId()
      { 
          return this.cardId;
      }
    public String getbankaccount()
      {
          return this.bankaccount;
      }
    public int getBalanceAmount()
      {
          return this.BalanceAmount;
      }
    public String getclientname()
      {
          return this.clientname;
      }
    public String getissuerBank()
      {
          return this.issuerBank;
      }
    //setters method used to accept the parameter values from the client and assign it to the attributes
    public void setclientname(String clientname)
      {
          this.clientname = clientname;
      }
    public void setBalanceAmount(int BalanceAmount)
      {   
          this.BalanceAmount = BalanceAmount;
      }
    //A method is created to display the details of class BankCard
    public void display()
      {   
          //A condition to be print accordingly if the client name is set or not 
          if(this.clientname == "")
              {
                  System.out.println("Please set the client name and try again.");
              }
          else
              {
                  System.out.println("The client name is: " + this.clientname);
              }
          System.out.println("The Issuer Bank is: " + this.issuerBank);
          System.out.println("The Card ID is: " + this.cardId);
          System.out.println("The Bank Account is: " + this.bankaccount);
          System.out.println("The Balance Amount is: " + this.BalanceAmount);
      }
}


//type casting refers to change of one data type into another
//int i = 10;
//byte b = i;
//for type casting the data types must be compatible(level milnu paryo)
//types
//widening typecasting(implicit typecasting/cast down)
//Narrowing typecasting (explicit typecasting/ cast up)
//int s = 23;
//short i = 23;