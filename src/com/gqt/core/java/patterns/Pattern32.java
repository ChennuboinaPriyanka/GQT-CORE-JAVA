package com.gqt.core.java.patterns;
import java.util.Scanner;
public class Pattern32{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(j%2==0) {
				    System.out.print(0+"  " );
		
			}
				else {
					System.out.print(1+" ");
				}
				
			
		}
			System.out.println();

	}
	}
}




