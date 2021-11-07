/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13;

/**
 *
 * @author admin
 */
//listing 18
// Ambiguity caused by erasure on  
// overloaded methods. 
//class MyGenClass<T, V> {  
//  T ob1;  
//  V ob2;  
// 
//   ... 
// 
//   These two overloaded methods are ambiguous 
//   and will not compile. 
//  void set(T o) { 
//    ob1 = o; 
//  } 
//
//  void set(V o) { (* they have the same results)
//    ob2 = o; 
//  } 
//}

//listing 19
// Can't create an instance of T. 
//class Gen4<T> {  
//  T ob;  
//  Gen4() {  
//    ob = new T(); // Illegal!!! 
//  }  
//} 

//listing 20
//class Wrong<T> {  
//   Wrong, no static variables of type T. 
//  static T ob; 
//    
//   Wrong, no static method can use T. 
//  static T getob() { 
//    return ob; 
//  } 
// 
//   Wrong, no static method can access object 
//   of type T. 
//  static void showob() { 
//    System.out.println(ob); 
// } 
//}

//listing 21
// Generics and arrays. 
class Gen3<T extends Number> {  
  T ob;  
 
  T vals[]; // OK 
 
  Gen3(T o, T[] nums) {  
    ob = o; 
 
    // This statement is illegal. 
//  vals = new T[10]; // can't create an array of T 
 
    // But, this statement is OK. 
    vals = nums; // OK to assign reference to existent array 
  }  
}  
  
class GenArrays {  
  public static void main(String args[]) {  
    Integer n[] = { 1, 2, 3, 4, 5 };   
 
    Gen3<Integer> iOb = new Gen3<Integer>(50, n); 
 
    // Can't create an array of type-specific generic references. 
    // Gen<Integer> gens[] = new Gen<Integer>[10]; // Wrong! 
 
    // This is OK. 
    Gen3<?> gens[] = new Gen3<?>[10]; // OK
  } 
}