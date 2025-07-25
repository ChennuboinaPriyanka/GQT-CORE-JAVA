package com.gqt.core.java.patterns;
import java.util.Scanner;
public class Pattern21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int n=sc.nextInt();
		char c='A';
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(c+i-1)+" ");
			}
			System.out.println();
		}

	}

}
