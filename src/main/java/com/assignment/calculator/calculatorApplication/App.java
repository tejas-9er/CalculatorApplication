package com.assignment.calculator.calculatorApplication;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 System.out.println("Enter first and second number:");
         @SuppressWarnings("resource")
		Scanner inp= new Scanner(System.in);
         int num1,num2;
         num1 = inp.nextInt();
         num2 = inp.nextInt();
         System.out.println("Enter your selection: 1 for Addition, 2 for substraction 3 for Multiplication, 4 for division and 5 for Modulus:");
         int choose;
         choose = inp.nextInt();
         switch (choose){
         case 1:
             System.out.println(add( num1,num2));
             break;
         case 2:
             System.out.println(sub( num1,num2));
             break;      
         case 3:
             System.out.println(mult( num1,num2));
             break;
         case 4:
             System.out.println(div( num1,num2));
             break;
         case 5:
             System.out.println(mod( num1,num2));
             break;
         default:
             System.out.println("Illegal Operation");
             break;
         }
         System.out.println();
     }
     public static int add(int x, int y)
     {
         int result = x + y;
         return result;
     }
     public static int sub(int x, int y)
     {
         int result = x-y;
         return result;
     }
     public static int mult(int x, int y)
     {
         int result = x*y;
         return result;
     }
     public static double div(int x, int y)
     {
         if(y==0) {
         	throw new IllegalArgumentException("Cannot Divide by 0");
         }
         double n = x;
         double d = y;
     	double result = n/d;
         return result;
     }
     
     public static int mod(int x, int y)
     {
         if(y==0) {
         	throw new IllegalArgumentException("Modulus 0 is invalid");
         }
         int result = x/y;
         return result;
     }
    
}
