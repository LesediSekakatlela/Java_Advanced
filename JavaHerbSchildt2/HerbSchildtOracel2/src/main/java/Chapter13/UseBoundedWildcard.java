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
//listing6
class A { 
  // ... 
} 
 
class B extends A { 
  // ... 
} 
 
class C extends A { 
  // ... 
} 
 
// Note that D does NOT extend A. 
class D {  
  // ... 
}

//listing7
// A simple generic class. 
class Gen1<T> { 
  T ob; 
 
  Gen1(T o) { 
    ob = o; 
  } 
}
//listing8
class UseBoundedWildcard { 
  // Here, the ? will match A or any class type that 
  // that extends A 
  static void test(Gen1<? extends A> o) { 
    // ... 
  }
  public static void main(String args[]) { 
    A a = new A(); 
    B b = new B(); 
    C c = new C(); 
    D d = new D(); 
 
    Gen1<A> w = new Gen1<A>(a); 
    Gen1<B> w2 = new Gen1<B>(b); 
    Gen1<C> w3 = new Gen1<C>(c); 
    Gen1<D> w4 = new Gen1<D>(d); 
 
    // These calls to test() are OK. 
    test(w); 
    test(w2); 
    test(w3); 
 
    // Can't call test() with w4 because 
    // it is not an object of a class that 
    // inherits A. 
//    test(w4); // Error! 
  } 
}
