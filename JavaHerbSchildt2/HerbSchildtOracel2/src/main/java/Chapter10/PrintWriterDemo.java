/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10;
import java.io.*;
/**
 *
 * @author admin
 */
// Demonstrate PrintWriter. 
public class PrintWriterDemo { 
  public static void main(String args[]) { 
    PrintWriter pw = new PrintWriter(System.out, true); 
    int i = 10; 
    double d = 123.65; 
 
    pw.println("Using a PrintWriter."); 
    pw.println(i); 
    pw.println(d); 
 
    pw.println(i + " + " + d + " is " + (i+d)); 
  } 
}
