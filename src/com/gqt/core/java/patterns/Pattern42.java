package com.gqt.core.java.patterns;
import java.util.Scanner;
public class Pattern42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(char ch='A';ch<'A'+i;ch++) {
				System.out.print(ch);
			}
			for(char ch='A';ch<'A'+i;ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}

	}

}
