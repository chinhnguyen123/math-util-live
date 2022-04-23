/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author Admin
 */
//ta viet class de cung cap tien ich cho noi khac xai, dung static
public class MathUtil {
    
    //n!
    public static long getFactorial(int n){
        if ( n < 0 || n > 20) throw new IllegalArgumentException("invalid argument. n must be between 0 ..20");
        //ham dung luon, ko can return
        
        if(n == 0 || n ==1){
            return  1;
        }
        
        long product = 1;
        for(int i = 2; i <= n; i++){
            product *= i;
        }
        return product;
    }
    
}
