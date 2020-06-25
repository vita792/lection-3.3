package com.company.lesson3;

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   
	   Scanner arrSize = new Scanner (System.in);
	   System.out.print("Enter size for array: ");
	   int size = arrSize.nextInt();
	   int[] arrOfNumb = new int[size];
	   System.out.println("Enter array`s numbers: ");
	   int max = arrOfNumb[0];
	   int min = arrOfNumb[0];
	   for (int i = 0; i < arrOfNumb.length; i++){
	       arrOfNumb[i] = arrSize.nextInt();
	       if (max<arrOfNumb[i]) {
	           max = arrOfNumb[i];
	           
	       }
	       if (min>arrOfNumb[i]) {
        	   min = arrOfNumb[i];
	            }
	   	   }
	  System.out.println("The max number is: " + max);
	  System.out.println("The min number is: " + min);
	}    
}
