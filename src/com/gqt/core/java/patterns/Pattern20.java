package com.gqt.core.java.patterns;
import java.util.Scanner;
public class Pattern20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int n=sc.nextInt();
		char ch='A';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(ch+i-1)+" ");
			}
			System.out.println();
		}
		

	}

}
