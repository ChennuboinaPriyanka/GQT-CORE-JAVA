package com.gqt.core.java.patterns;
import java.util.Scanner;
class ArrayOperations{
	int arr[];
	Scanner sc=new Scanner(System.in);
	void createArray() {
		System.out.println("enter the student count:");
		int n=sc.nextInt();
		arr=new int[n];
		System.out.println("Array created");
		System.out.println("---------------------");
	}
	void collectData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the marks of student number: " + (i+1));
			arr[i]=sc.nextInt();
		}
		System.out.println("-------------------");
	}
	void displayData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("The marks of student " +(i+1) + " is " +arr[i]);
		}
	}
}
public class Sturucturedarray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOperations a=new ArrayOperations();
		a.createArray();
		a.collectData();
		a.displayData();
	}
}
