package com.gqt.core.java.patterns;
import java.util.Scanner;
public class Pattern39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		char c='A';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			char ch=(char)('A'+(2*i-2));
			for(char k=ch;k>='A';k--) {
				System.out.print(k);
			}
			System.out.println();
			
		}

	}

}
