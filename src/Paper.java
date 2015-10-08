/*
 * IT251
 * This class is a subclass to Account
 * This class represents paper sold
 */

/**
 *
 * @author Kira Schwartz
 */
public class Paper extends Account {

    //initialize instance variables
    private double poundsSold;
    private double pricePerPound;

    //six argument constructor
    public Paper(String id, String first, String last, String phone,
            double pounds, double price) {
        super(id, first, last, phone);//keyword super inherits variables
        poundsSold = pounds;
        pricePerPound = price;

    }//end six argument constructor

    //set pounds of paper sold
    public void setPoundsSold(double pounds) {
        if (pounds >= 0) {
            poundsSold = pounds;
        } else {
            throw new IllegalArgumentException(
                    "Pounds sold must be greater than or equal to zero");
        }//end else statement

    }//end method setPoundsSold

    //return pounds of paper sold
    public double getPoundsSold() {
        return poundsSold;
    }//end method getPoundsSold()

    //set price per pound of paper sold
    public void setPricePerPound(double price) {
        if (price >= 0) {
            pricePerPound = price;
        } else {
            throw new IllegalArgumentException(
                    "Price per pound must be greater than or equal to zero");
        }//end else statement
    }//end method setPricePerPound

    //return price per pound of paper
    public double getPricePerPound() {
        return pricePerPound;
    }//end method getPricePerPound()

    //override class Account's toString method
    @Override
//return account information
    public String toString() {
        return String.format("%s\n %s: %.1f\n %s: $%.2f", super.toString(), 
                "Pounds sold ", getPoundsSold(), "Price per pound ", 
                getPricePerPound());
    }//end method toString()

    //method computeSales() is overriden to calculate pounds of paper sold by 
    //price per pound
    @Override
    public double computeSales()
    {
        return (poundsSold * pricePerPound);
    }
}//end class
