/*
 * This class creates a graphic to display Simply Office's logo
 * 
 * 
 */

/**
 *
 * @author Kira Schwartz
 */
//import APIs
import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import javax.swing.JPanel;
import java.awt.GradientPaint;

public class Graphic extends JPanel{
    //initialize instance variable
    String myText;
    
    //one argument constructor
    public Graphic(String text){
        myText = text;
    }//end constructor
    
    public void paintComponent(Graphics g){
        //inherit paintComponent qualities
        super.paintComponent(g);
        //create new object
        Graphics2D g2d = (Graphics2D) g;
        
        
        
        //create points for star
        int[] xPoints = {55, 67, 109, 73, 83, 55, 27, 37, 1, 43};
        int[] yPoints = {0, 36, 36, 54, 96, 72, 96, 54, 36, 36};
        
        //create background
        GradientPaint blueToYellow = new GradientPaint(0, 0, Color.blue, 315, 330,
                Color.yellow);
        g2d.setPaint(blueToYellow);
        g2d.fillRect(0, 0, 315, 330);
        
        //create circle around star
        GradientPaint purpleToBlue = new GradientPaint(0, 0, Color.cyan, 109, 100,
                Color.blue);
        g2d.setPaint(purpleToBlue);
        g2d.fillArc(0, 0, 109, 100, 0, 360);
        
        //create star
        GeneralPath star = new GeneralPath();
        star.moveTo(xPoints[0], yPoints[0]);
        for (int count = 1; count < xPoints.length; count++) {
            star.lineTo(xPoints[count], yPoints[count]);
        }//end for statement
        star.closePath();
        g2d.setColor(Color.yellow);
        g2d.fill(star);
        
        //create text
        g.setColor(Color.WHITE);
        g.setFont( new Font( "Serif", Font.BOLD, 20 ) );
        g.drawString("2014 Sales total", 150, 75);
        g.drawString( myText, 200, 100 );
        g.setFont(new Font("Serif", Font.ITALIC, 26));
        g.drawString("Simply Office", 50, 275);
        
        
    }//end method paintComponent
}//end class Graphic
