package com.gqt.core.java.patterns;
import java.util.Scanner;
public class Pattern27 {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the value of n");
	   int n=sc.nextInt();
	   for(int i=1;i<=n;i++) {
		   for(int j=1;j<=n-i;j++) {
			   System.out.print("_  ");
		   }
		   for(int k=1;k<=i;k++) {
			   System.out.print("#  ");
		   }
		   System.out.println();
	   }

	}

}
