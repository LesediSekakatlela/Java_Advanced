/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14;
import java.io.*;
/**
 *
 * @author admin
 */ 
interface MyIOAction { 
  boolean ioAction(Reader rdr) throws IOException; 
} 
 
public class LambdaExceptionDemo { 
  public static void main(String args[]) 
  { 

    // This block lambda could throw an IOException. 
    // Thus, IOException must be specified in a throws 
    // clause of ioAction() in MyIOAction. 
    MyIOAction myIO = (rdr) ->  { 
      int ch = rdr.read(); // could throw IOException 
      // ... 
      return true; 
    }; 
  } 
}
