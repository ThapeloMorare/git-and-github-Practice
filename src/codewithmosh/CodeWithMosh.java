/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codewithmosh;

import java.awt.Point;
import java.util.Date;

/**
 *
 * @author HP
 */
public class CodeWithMosh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Point pointOne = new Point(1, 1);
        Point point2 = pointOne;
        pointOne.x = 5; 
        System.out.println(pointOne);
    }
    
}
