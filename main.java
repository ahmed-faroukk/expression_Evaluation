/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.expression_evaluation;

import static com.mycompany.expression_evaluation.stack.Test.evaluatePostfix;

/**
 *
 * @author farouk
 */
public class main {
     // Driver program to test above functions
    public static void main (String [] args)
    {
         String exp="231*+9-";
        System.out.println("postfix evaluation: "+evaluatePostfix(exp));
    
    }
    // Contributed by Sumit Ghosh
}
