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
// Use a BufferedReader to read characters from the console. 
public class ReadChars { 
  public static void main(String args[])  
    throws IOException 
  { 
    char c; 
    BufferedReader br = new 
            BufferedReader(new InputStreamReader(System.in)); 
 
    System.out.println("Enter characters, period to quit."); 
 
    // read characters 
    do { 
      c = (char) br.read(); 
      System.out.println(c); 
    } while(c != '.'); 
  } 
}
