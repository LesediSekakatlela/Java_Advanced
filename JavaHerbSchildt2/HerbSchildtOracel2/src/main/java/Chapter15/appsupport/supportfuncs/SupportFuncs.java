/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15.appsupport.supportfuncs;

/**
 *
 * @author admin
 */
//listing3
// Module definition for the functions module. 
//module appfuncs { 
//   Exports the package appfuncs.simplefuncs. 
//  exports appfuncs.simplefuncs; 
//}

//listing 4
// Module definition for the main application module. 
//module appstart { 
//   Requires the module appfuncs. 
//  requires appfuncs; 
//}

//listing 5
// Module definition that uses a to clause. 
//module appfuncs { 
//   Exports the package appfuncs.simplefuncs to appstart. 
//  exports appfuncs.simplefuncs to appstart; 
//}

//listing 6
// Module definition for appsupport. 
//module appsupport { 
//  exports appsupport.supportfuncs; 
//}

//listing 7
// Support functions. 
public class SupportFuncs { 
 
  // Determine if a is a factor of b. 
  public static boolean isFactor(int a, int b) { 
    if((b%a) == 0) return true; 
    return false; 
  } 
}
