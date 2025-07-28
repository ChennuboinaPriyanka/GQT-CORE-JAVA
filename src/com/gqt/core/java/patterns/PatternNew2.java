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
public class PatternNew2 {

	/**
	 * @param args
	 * @description Thus contains source code for the pattern
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				if(i==0||j==0||i==1||i==(n-1)||j==i) {
					System.out.print("# ");
				}
				else {
					System.out.print("- ");
				}
			}
			System.out.println();
			
		}
		

	}

}

	


