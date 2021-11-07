/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12;
import static java.lang.Math.sqrt; 
import static java.lang.Math.pow; 
/**
 *
 * @author admin
 */
// Use static import to bring sqrt() and pow() into view. 
class Quadratic2 {  
  public static void main(String args[]) {  
 
    // a, b, and c represent the coefficients in the 
    // quadratic equation: ax2 + bx + c = 0 
    double a, b, c, x; 
 
    // Solve 4x2 + x -3 = 0 for x. 
    a = 4; 
    b = 1; 
    c = -3; 
 
    // Find first solution. 
    x = (-b + sqrt(pow(b, 2) - 4 * a * c)) / (2 * a); 
    System.out.println("First solution: " + x); 
 
    // Find second solution. 
    x = (-b - sqrt(pow(b, 2) - 4 * a * c)) / (2 * a); 
    System.out.println("Second solution: " + x); 
  }  
}
