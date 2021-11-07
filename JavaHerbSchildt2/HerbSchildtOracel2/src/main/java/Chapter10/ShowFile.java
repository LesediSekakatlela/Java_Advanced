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
public class ShowFile { 
  public static void main(String args[])  
  { 
    int i; 
    FileInputStream fin;
 
    // First make sure that a file has been specified.
    if(args.length != 1) {
      System.out.println("Usage: ShowFile File"); 
      return;
    }

    try { 
      fin = new FileInputStream(args[0]); 
    } catch(FileNotFoundException exc) { 
      System.out.println("File Not Found"); 
      return; 
    }

    try { 
      // read bytes until EOF is encountered 
      do { 
        i = fin.read(); 
        if(i != -1) System.out.print((char) i); 
      } while(i != -1); 
    } catch(IOException exc) {
      System.out.println("Error reading file.");
    }

    try {
      fin.close(); 
    } catch(IOException exc) {
      System.out.println("Error closing file.");
    }

  } 
}

