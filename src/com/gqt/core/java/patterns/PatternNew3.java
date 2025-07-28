/**
 * 
 */
package com.gqt.core.java.patterns;
import java.util.Scanner;

/**
 * @author Priyanka
 * @category patterns
 * @description This is an example for conditional pattern
 */
public class PatternNew3 {

	/**
	 * @param args
	 * @description Thus contains source code for the pattern
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
					System.out.print("- ");
				}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("$ ");
			}
			System.out.println();
			
		}
		

	}

}

	
