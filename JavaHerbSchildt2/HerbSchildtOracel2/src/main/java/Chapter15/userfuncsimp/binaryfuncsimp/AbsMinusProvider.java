/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15.userfuncsimp.binaryfuncsimp;

import Chapter15.userfuncs.binaryfuncs.*;
/**
 *
 * @author admin
 */
// This is a provider for the AbsMinus function. 
public class AbsMinusProvider implements BinFuncProvider { 
 
  // Provide an AbsMinus object. 
  @Override
  public BinaryFunc get() { return new AbsMinus(); } 
}
