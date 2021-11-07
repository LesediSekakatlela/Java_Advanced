/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11;

/**
 *
 * @author admin
 */
// No calls to wait() or notify(). 
class TickTock { 

  String state; // contains the state of the clock
 
  synchronized void tick(boolean running) { 
    if(!running) { // stop the clock 
      state = "ticked";
      return; 
    } 
 
    System.out.print("Tick "); 

    state = "ticked"; // set the current state to ticked
  } 
 
  synchronized void tock(boolean running) { 
    if(!running) { // stop the clock 
      state = "tocked";
      return; 
    } 
 
    System.out.println("Tock"); 

    state = "tocked"; // set the current state to tocked
  } 
} 
 
class MyThread5 implements Runnable { 
  Thread thrd; 
  TickTock ttOb; 
 
  // Construct a new thread. 
  MyThread5(String name, TickTock tt) { 
    thrd = new Thread(this, name); 
    ttOb = tt; 
  }
 
  // A factory method that creates and starts a thread.
  public static MyThread5 createAndStart(String name, TickTock tt) {
    MyThread5 myThrd = new MyThread5(name, tt);
    
    myThrd.thrd.start(); // start the thread
    return myThrd;
  } 

  // Entry point of thread. 
  public void run() { 
 
    if(thrd.getName().compareTo("Tick") == 0) { 
      for(int i=0; i<5; i++) ttOb.tick(true); 
      ttOb.tick(false); 
    } 
    else { 
      for(int i=0; i<5; i++) ttOb.tock(true); 
      ttOb.tock(false); 
    } 
  } 
} 
 
class ThreadCom { 
  public static void main(String args[]) { 
    TickTock tt = new TickTock(); 
    MyThread5 mt1 = MyThread5.createAndStart("Tick", tt); 
    MyThread5 mt2 = MyThread5.createAndStart("Tock", tt); 
 
    try { 
      mt1.thrd.join(); 
      mt2.thrd.join(); 
    } catch(InterruptedException exc) { 
      System.out.println("Main thread interrupted."); 
    } 
  } 
}
