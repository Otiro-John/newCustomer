public class Customer {
    public static void main(String[] args) {
    //types of customers
    //the new key word calls the constructor
    //local customers
      Customer localCustomer = new Customer(0001,"John","0004-Street",0712020066,"Kenya");
    //this one explains the part of localCustomer
      System.out.println("This is local a customer");
      //methods for localCustomer
      localCustomer.myDeposit();
       localCustomer.myWithdrawals(); 
       localCustomer.renew();
        localCustomer.myBalance();
        //international Customers
     Customer internationalCustomer = new Customer(0001,"James","007-43-Streeet",+1988473277,"America");
      System.out.println("This is an international customer");
      //methods for internationalCustomer
      internationalCustomer.myDeposit();
      internationalCustomer.myWithdrawals(); 
      internationalCustomer.renew();
      internationalCustomer.myBalance();
  }
  //attributes for the customers
  int accountNumber;
  String name;
  String address;
  int phoneNumber;
  String country;
  //constructor method
public Customer(int accountNumber,String name,String address, int phoneNumber,String country){
    this.accountNumber = accountNumber;
    this.name = name;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.country = country;
  }
  //methods for both internationalCustomer and localCustomer
  public void myDeposit(){
    //message for the deposit
    System.out.println("This is my deposit");
  }
  public void myWithdrawals(){
    //message for withdrawals 
    System.out.println("This is my withdrawals");
  }
  public void renew(){
    //message for renewing accounts for all customers
    System.out.println("I want to renew my account");
  }
  public void myBalance(){
    //message for checking balances
    System.out.println("This is my balance");
  }
}