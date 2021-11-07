/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12;

/**
 *
 * @author admin
 */
// An example that uses @Deprecated. 
// Deprecate a class. 
@Deprecated 
class MyClass { 
  private String msg; 
 
  MyClass(String m) { 
    msg = m; 
  } 
   
  // Deprecate a method within a class. 
  @Deprecated 
  String getMsg() { 
    return msg; 
  } 
 
  // ... 
} 
 
public class AnnoDemo { 
  public static void main(String args[]) { 
    MyClass myObj = new MyClass("test"); 
 
    System.out.println(myObj.getMsg()); 
  } 
}
