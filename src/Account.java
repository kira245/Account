/*
 * IT251 
 * This is parent class to classes Supplies, Services, and Paper
 * The purpose of this class is to store account information for Account 
 * subclasses.
 */

/**
 *
 * @author Kira Schwartz
 */

//create interface
interface IAccount{
    double computeSales();
}

public abstract class Account implements IAccount{
//initialize instance variables    

    private String accountId;
    private String firstName;
    private String lastName;
    private String phoneNumber;

//four argument constructor
    public Account(String id, String first, String last, String phone) {
        accountId = id;
        firstName = first;
        lastName = last;
        phoneNumber = phone;

    }//end four argument constructor

//set account id
    public void setAccountId(String id) {
        accountId = id;
    }//end method setAccountId

//return account id
    public String getAccountId() {
        return accountId;
    }//end method getAccountId()

//set first name
    public void setFirstName(String first) {
        firstName = first;
    }//end method setFirstName

//return first name
    public String getFirstName() {
        return firstName;
    }//end method getFirstName()

//set last name
    public void setLastName(String last) {
        lastName = last;
    }//end method setLastName

//return last name
    public String getLastName() {
        return lastName;
    }//end method getLastName()

//set phone number
    public void setPhoneNumber(String phone) {
        phoneNumber = phone;
    }//end method setPhoneNumber

//return phone number
    public String getPhoneNumber() {
        return phoneNumber;
    }//end method getPhoneNumber()

//override class object's toString method
    @Override
//return account information
    public String toString() {
        return String.format("%s: %s\n %s: %s %s\n %s: %s", "Account ID ", 
                accountId, "Customer's name ", firstName, lastName, 
                "Customer's phone number ", phoneNumber);
    }//end method toString() 

    //method returns -1
    @Override
    public double computeSales()
    {
        return -1;
    }
}//end class
