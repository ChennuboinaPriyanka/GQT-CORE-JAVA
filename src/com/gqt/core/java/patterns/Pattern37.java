package com.gqt.core.java.patterns;
import java.util.Scanner;
public class Pattern37 {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the value");
	  int n=sc.nextInt();
	  for(int i=n;i>=1;i--) {
		  for(int j=i;j<n;j++) {
			  System.out.print("  ");
		  }
		  for(int k=1;k<=(2*i-1);k++) {
			  System.out.print(i+"  ");
		  }
		  System.out.println();
	  }
	  for(int i=2;i<=n;i++) {
		  for(int j=i;j<n;j++) {
			  System.out.print("  ");
		  }
		  for(int k=1;k<=(2*i-1);k++) {
			  System.out.print(i+"  ");
		  }
		  System.out.println();
	  }
	 

}
}