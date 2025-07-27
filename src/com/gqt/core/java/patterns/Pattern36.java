package com.gqt.core.java.patterns;
import java.util.Scanner;
public class Pattern36 {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the value");
	  int n=sc.nextInt();
	  char c='A';
	  for(int i=1;i<=n;i++) {
		  for(int j=i;j<n;j++) {
			  System.out.print("  ");
		  }
		  for(int k=1;k<=(2*i-1);k++) {
			  System.out.print((char)(c+i-1)+"  ");
		  }
		  System.out.println();
	  }

	}

}