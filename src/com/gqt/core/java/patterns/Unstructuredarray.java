package com.gqt.core.java.patterns;
import java.util.Scanner;
public class Unstructuredarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the student count");
		int n=sc.nextInt();
		//creating the array to store n student marks
		int arr[]=new int [n];
		//collecting and storing marks of n students
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the marks of student number:" + (i+1));
			arr[i]=sc.nextInt();
		}
		System.out.println("-----------------");
		//display marks stored inside the array
		for(int i=0;i<arr.length;i++) {
			System.out.println("The marks of student number :" +(i+1) + "is=" +arr[i]);
		}
       
	}

}
