/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson16;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author developer
 */
public class ForkJoin {
    public static void main(String[] args) {
        int[] data = new int[1024 * 1024 ];
        
        for(int i = 0; i < data.length; i++){
            data[i] = ThreadLocalRandom.current().nextInt();
        }
        
        int max = Integer.MIN_VALUE;
        for(int value : data){
            max = value;
        }
        
        System.out.println("Max found: " + max);
    }    
}
