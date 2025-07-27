package com.gqt.core.java.patterns;
import java.util.Scanner;
public class Pattern38 {
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the value");
	  int n=sc.nextInt();
	  for(int i=1;i<=n;i++) {
		  for(int s=1;s<n-i;s++) {
			  System.out.print("  ");
		  }
		  for(int k=1;k<=i;k++) {
			  
			  System.out.print(k+"  ");
		  }
		  for(int j=i-1;j>=1;j--) {
			  System.out.print(j +"  ");
		  }
		  System.out.println();
	  }
	}
}

