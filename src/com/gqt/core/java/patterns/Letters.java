package com.gqt.core.java.patterns;

import java.util.Scanner;
/**
 * @author Priyanka
 * @category patterns
 * @description This is an example for pyramid pattern
 */
public class Letters
{
	/**
	 * @param args
	 * @description This contains source code for the pattern
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			//a
			for(int j=0;j<n;j++) {
				if(i==0 && j!=0 && j!=(n-1)||j==0 && i!=0||i==n/2||j==(n-1) && i!=0)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			//b
			for(int j=0;j<n;j++) {
				if(i==0 && j!=(n-1)|| j==0 ||j==(n-1) && i!=0 && i!=(n-1)||i==(n-1) && j!=(n-1)||i==n/2) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			//c
			for(int j=0;j<n;j++) {
				if(j==0 && i!=0 && i!=(n-1)|| i==0 && j!=0||i==(n-1) && j!=0) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			//d
			for(int j=0;j<n;j++) {
				if(j==0||i==(n-1) && j!=(n-1)||i==0 && j!=(n-1)||j==(n-1) && i!=0 && i!=(n-1)) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			//e
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || i==n/2 || i==(n-1) ) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			//f
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || i==n/2) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			//g
			for(int j=0;j<n;j++) {
				if((i==0 && j!=0)|| (j==0 && i!=0 && i!=(n-1))|| (i==(n-1)&& j!=0 && j<(n-1)/2)|| (i==(n-1)/2&& j>(n-1)/2 &&j!=(n-1))||(j==(n-1)/2 && i> (n-1)/2&& i!=(n-1))||(j==(n-1) && i> (n-1)/2)) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			//h
			for(int j=0;j<n;j++) {
				if(j==0 || i==n/2||j==(n-1)) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			//i
			for(int j=0;j<n;j++) {
				if(i==0 || j==n/2||i==(n-1)) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			//j
			for(int j=0;j<n;j++) {
				if(i==0 || i==(n-1)&& j<(n/2) && j!=n/2|| j==n/2 && i!=(n-1)) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			//k
			for(int j=0;j<n;j++) {
				if(j==0||i+j==(n/2)||(i-j)==n/2) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			//l
			for(int j=0;j<n;j++) {
				if(j==0 ||i==(n-1)) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			//m
			for(int j=0;j<n;j++) {
				if(j==0||i==j && i<=n/2 && j<=n/2||j==(n-1) || i+j==(n-1) && j>n/2 && i<n/2) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			//n
			for(int j=0;j<n;j++) {
				if(j==0||i==j||j==(n-1)) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			//o
			for(int j=0;j<n;j++) {
				if(j==0 && i!=0 && i!=(n-1)||i==0 && j!=0 && j!=(n-1) &&j!=0||j==(n-1) && i!=0 && i!=(n-1)||i==(n-1) && j!=0 && j!=(n-1)) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			//p
			for(int j=0;j<n;j++) {
				if(j==0||i==0 && j!=n-1||i==n/2 && j!=n-1||j==(n-1) && j>n/2 && i<n/2 && i!=n/2 && i!=0) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			//q
			for(int j=0;j<n;j++) {
				if((j==0 && i!=0 && i<(3*n)/4)|| (j==(3*n)/4 && i!=0 && i<(3*n)/4 ) || (i==0 && j!=0 && j<(3*n)/4 ) || ( i==(3*n)/4 && j!=0 && j<(3*n)/4 ) || ( i==j && j>=(n/2)))
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			//r
			for(int j=0;j<n;j++) {
				if(j==0||i==0 && j!=n-1||i==n/2 && j!=n-1||j==(n-1) && j>n/2 && i<n/2 && i!=n/2 && i!=0||i==j&&j>n/2&&i>n/2) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			//s
			for(int j=0;j<n;j++) {
				if(i==0 && j!=0||j==0 && i<n/2 && i!=0&& i!=n/2|| i==n/2 && j!=0 && j!=(n-1)||j==(n-1)&&i>n/2 && j>n/2 && i!=n/2 && i!=(n-1) || i==(n-1) && j!=(n-1)) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			//t
			for(int j=0;j<n;j++) {
				if(i==0||j==n/2) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			//u
			for(int j=0;j<n;j++) {
				if(j==0 && i!=(n-1)||i==(n-1) && j!=0 && j!=(n-1)||j==(n-1)&& i!=(n-1)) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			//v
			for(int j=0;j<n;j++) {
				if(j==0 && i<n/2 ||i-j==n/2 || i+j==(n-1)+n/2 && j>n/2 && i>n/2||j==(n-1)&&i<=n/2&&j>=n/2 ) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			//w
			for(int j=0;j<n;j++) {
				if(j==0 && i!=(n-1)||j==(n-1) && i==(n-1)&& j>n/2 && i>n/2 && i!=(n-1)||i==(n-1) && j!=0 &&j!=(n-1) && j<n/2 &&i>n/2||j==n/2&& i>n/2 && i<n-1 || i==n-1 && j>n/2 && i>n/2&& j!=(n-1) ||j==n-1&& i!=n-1 ) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			//x
			for(int j=0;j<n;j++) {
				if(i==j ||i+j==(n-1)) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			//y
			for(int j=0;j<n;j++) {
				if(i==j && j<n/2 && i<n/2|| i+j==(n-1)&& j>=n/2 && i<=n/2 || j==n/2 && i>n/2) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			//z
			for(int j=0;j<n;j++) {
				if(i==0|| i+j==(n-1) ||i==(n-1)) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			
			
			
			
			
			System.out.println();
		}
	}

}


	

		
