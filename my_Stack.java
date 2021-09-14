/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.expression_evaluation;
import java.util.Stack;
/**
 *
 * @author farouk
 */
public class my_Stack {
   public int evaluatepostfix(String expr)
   {
   Stack <Integer> newon = new Stack<>();
   for (int i=0 ; i<expr.length() ; i++) 
   {
   
   char c =expr.charAt(i);
   
   
  if(Character.isDigit(c))
  {
  
 newon.push(i);
  
  }
  else
  {
    
      int num1  = newon.pop();
      int num2  = newon.pop();
              
              switch(c)
              {
                      
                      case'+': newon.push(num1+num2);
                      break;
                      
 
                      case'-': newon.push(num1-num2);
                      break;
                      
                      case '*': newon.push(num1*num2);
                      break;
                      
                      case'/': newon.push(num1/num2);
                      break;
                      
                      default: System.out.println("this expression is not correct please try againe");
                      
                      
              }
              
              
  }      
              
              
              
   
         
   
   }
     
                            return newon.pop();

   }
   
    public static void main(String[] args) {
        
        String expr= "45*102/+";
        System.out.println("postfix is" + stack.Test.evaluatePostfix(expr));
    }
   
}
