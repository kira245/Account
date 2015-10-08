/*
 * IT251
 * This class is a subclass to Account
 * This class represents office supplies sold
 */

/**
 *
 * @author Kira Schwartz
 */
public class Supplies extends Account {
//initialize instance variables

    private double totalSold;
    private double officeSales;
    private double bookSales;
    private double apparelSales;

//seven argument constructor
    public Supplies(String id, String first, String last, String phone,
            double apparel,double book, double office) {
        super(id, first, last, phone);//keyword super inherits variables
        apparelSales = apparel;
        bookSales = book;
        officeSales = office;

    }//end seven argument constructor

//set total amount sold
    public void setTotalSold(double total) {
        if (total >= 0) {
            totalSold = total;
        } else {
            throw new IllegalArgumentException(
                    "Total sold must be greater than or equal to zero");
        }
    }//end method setTotalSold

//return total sold
    public double getTotalSold() {
        return totalSold;
    }//end method getTotalSold()
    
     // Set Methods
    public void setOfficeSales(double office) 
    {
        officeSales = office;
    }
    
    public void setBookSales(double book)
    {
        bookSales = book;
    }
    
    public void setApparelSales(double apparel)
    {
        apparelSales = apparel;
    }
            
    // Get Methods
    public double getOfficeSales()
    {
        return officeSales;
    }
    
    public double getBookSales()
    {
        return bookSales;
    }
    
    public double getApparelSales()
    {
        return apparelSales;
    }

    //override class Account's toString method
    @Override
//return account information
    public String toString() {
        return String.format("%s\n %s%.2f\n %s%.2f\n %s%.2f\n", super.toString(), 
                "Total apparel sales is $", apparelSales, 
                "Total book sales are $", bookSales,
                "Total office supplies sold are $", officeSales);
    }//end method toString()

    //computeSales() method is overriden to compute office supplies, books, 
    //and apparel
    @Override
    public double computeSales()
    {
        return (officeSales + bookSales + apparelSales);
    }
}//end class
