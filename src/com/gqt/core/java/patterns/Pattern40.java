package com.gqt.core.java.patterns;
import java.util.Scanner;
public class Pattern40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		char c='A';
		for(int i=0;i<n;i++) {
			for(int j=0;j<=n-i-1;j++) {
				System.out.print(" ");
			}
			for(int k=i;k>=0;k--) {
				System.out.print(k);
			}
			for(int l=1;l<=i;l++) {
				System.out.print(l);
			}
			System.out.println();
			
		}

	}

}

