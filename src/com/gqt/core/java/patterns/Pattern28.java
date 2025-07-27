package com.gqt.core.java.patterns;
import java.util.Scanner;
public class Pattern28 {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		   System.out.println("enter the value of n");
		   int n=sc.nextInt();
		   for(int i=1;i<=n;i++) {
			   for(int j=1;j<=i;j++) {
				   System.out.print("_  ");
			   }
			   for(int k=i;k<=n;k++) {
				   System.out.print("#  ");
			   }
			   System.out.println();
		   }
	}
}
