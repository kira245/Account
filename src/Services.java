/*
 * IT251
 * This class is a subclass to Account
 * This class represents services sold
 */

/**
 *
 * @author Kira Schwartz
 */
public class Services extends Account {

    
    //initialize instance variables
    private double numHours;
    private double ratePerHour;
    
    //six argument constructor
    public Services(String id, String first, String last, String phone,
            double hours, double rate) {
        super(id, first, last, phone);//keyword super inherits variables
        numHours = hours;
        ratePerHour = rate;

    }//end six argument constructor
    
    //set number of hours
    public void setNumHours (double hours){
        if(hours >= 0){
            numHours = hours;
        }else{
            throw new IllegalArgumentException(
                    "Number of hours must be greater than or equal to zero");
        }//end else statement
            
    }//end method setNumHours
    
    //return number of hours
    public double getNumHours(){
        return numHours;
    }//end method getNumHours()
    
   //set rate per hour for services
    public void setRatePerHour (double rate){
        if(rate >= 0){
            ratePerHour = rate;
        }else{
            throw new IllegalArgumentException(
                    "Rate per hour must be greater than or equal to zero");
        }//end else statement
            
    }//end method setRatePerHour
    
    //return rate per hour of services provided
    public double getRatePerHour(){
        return ratePerHour;
    }//end method getRatePerHour()
    
    //override class Account's toString method
    @Override
//return account information
    public String toString() {
        return String.format("%s\n %s: %.1f\n %s: $%.2f", 
                super.toString(), "Total number of hours ", getNumHours(),
                "Rate per hour ", getRatePerHour());
    }//end method toString()
   
    //overrides method computeSales() to calculate number of hours and rate per 
    //hour of services
    @Override
    public double computeSales()
    {
        return (numHours * ratePerHour);
    }
}//end class
