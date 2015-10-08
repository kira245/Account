/*
 * IT251
 * This is the main class where code from Account, Supplies, Services, and Paper
 * will be tested and displayed
 */

/**
 *
 * @author Kira Schwartz
 */
//call APIs
import javax.swing.JFrame;
import java.util.Scanner;
public class AccountTest {
    
    
    public static void main(String[] args) throws InterruptedException{
        
        //allows input from the keyboard
        Scanner input = new Scanner( System.in );
        
        //initialize variables
        int max = 5;
        int entry = 0;
        int object = 0;
        int userChoice;
        double input1;
        double input2;
        double input3;
        double total3Sales;

        //create Account array called myAccount
        Account [] myAccount = new Account[max];

        
        
        //nested do while loops to create a menu of choices
        do
        {
            do
            {
                System.out.print("Menu selection, 1=Enter Service  2=Enter Paper  3=Enter Supplies 4=quit:");
                userChoice = input.nextInt();
                System.out.println();
            } while ( ( userChoice < 1 ) || ( userChoice > 4 ) );

            switch ( userChoice )
            {
                case 1: System.out.print("Enter number of hours:");
                        input1 = input.nextDouble();
                        System.out.print("Enter rate per hour:");
                        input2 = input.nextDouble();
                        System.out.println();
                        myAccount [entry] = new Services ("11111", "Bill", 
                                "Jones", "333-3333", input1, input2);
                        break;
                case 2: System.out.print("Enter pounds of paper sold:");
                        input1 = input.nextDouble();
                        System.out.print("Enter price of paper per pound:");
                        input2 = input.nextDouble();
                        System.out.println();
                        myAccount [entry] = new Paper ("22222", "Ted",
                        "Miller", "888-8888", input1, input2);
                        break;
                case 3: System.out.print("Enter apparel sales:");
                        input1 = input.nextDouble();
                        System.out.print("Enter book sales:");
                        input2 = input.nextDouble();
                        System.out.print("Enter office supplies sales:");
                        input3 = input.nextDouble();
                        myAccount [entry] = new Supplies ("33333", "Rita",
                        "Forbes", "444-4444", input1, input2, input3);
                        break;
                default:
                        System.out.println("Polymorphic calls of accounts");
                        object = 0;
                        for (Account polyAccount : myAccount){
                            if(polyAccount != null ){
                                System.out.println("Object number is "+
                                        object);
                                System.out.printf("%s\n %s", 
                                        "Account details are:", polyAccount);
                                System.out.println(" ");
                                System.out.printf("%s %.2f\n", "Total is $",
                                        polyAccount.computeSales());
                                System.out.println(" ");
                                object += 1;
                            }//end if statement
                        }//end for statement
                        break;
            }//end switch statement
            entry += 1;
        } while ( userChoice != 4 && entry <= max);
        total3Sales = 0; //initialize variable
        
        //use polymorphic calls to total sales for Supplies, Services, and Paper
        for (Account polyAccount : myAccount){
            if (polyAccount != null){
              total3Sales += polyAccount.computeSales();
            }//end if statement  
        }//end for loop
        System.out.printf("%s%.2f", "Total sales for 2014 for Supplies, "
                + "Services, and Paper are: $", total3Sales);
        System.out.println(" ");
        
        //create graphic box
        JFrame frame = new JFrame( "Simply Office" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        //incorporate graphic
        Graphic graphic = new Graphic(String.valueOf(total3Sales)); 
        frame.add( graphic ); // add fontJPanel to frame
        frame.setSize( 315, 330 ); // set frame size
        
        
        //create sentinel controlled loop to create flashing quality
        int x = 0;
        while (x == 0){
            
            //makes frame visible
            frame.setVisible( true );
        
            //makes application sleep for one second
            Thread.sleep(1000);
        
            //makes frame not visible
            frame.setVisible( false );
            
            //makes application sleep for one-half second
            Thread.sleep(500);
        }//end while loop
        
    }//end main method
}//end class


    
