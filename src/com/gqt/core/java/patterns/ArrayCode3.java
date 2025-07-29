
package com.gqt.core.java.patterns;
import java.util.Scanner;
class Operations{
	String arr[][];
	Scanner sc=new Scanner(System.in);
	void createArray() {
		System.out.println("enter the class count:");
		int c=sc.nextInt();
		System.out.println("enter student count count in each class");
		int stu=sc.nextInt();
		
		arr=new String[c][stu];
		System.out.println("Array created");
		System.out.println("---------------------");
	}
	void collectData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside class no " + (i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter the name of student no:" +(j+1));
				arr[i][j]=sc.next();
			}
			
		}
		System.out.println("-------------------");
	}
	void displayData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside the class no :" +(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("The marks of student " +(j+1) + " is " +arr[i][j]);
			}
		}
		System.out.println("------------------");
	}
}


public class ArrayCode3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operations a=new Operations();
		a.createArray();
		a.collectData();
		a.displayData();

	}

}
