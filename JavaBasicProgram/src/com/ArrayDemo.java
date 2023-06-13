package com;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);5
		System.out.println("How many number do you want to store?");
		int size = sc.nextInt();
		int data[]=new int[size];
		System.out.println("Plz enter the "+size+" number one by one");
		for(int i=0;i<data.length;i++) {
				data[i]=sc.nextInt();
		}
		// business logic. 
		int sumOfNaturalNumber=0;
		int sumOfEven =0;
		int sumoOfOdd = 0;
		for(int i=0;i<data.length;i++) {
			sumOfNaturalNumber = sumOfNaturalNumber+data[i];
			if(data[i]%2==0) {
				sumOfEven = sumOfEven+data[i];
			}else {
				sumoOfOdd = sumoOfOdd+data[i];
			}
		}
		System.out.println("Sum of natural number is "+sumOfNaturalNumber);
		System.out.println("Sum of even "+sumOfEven);
		System.out.println("Sum of odd "+sumoOfOdd);
		System.out.println("All elements are");
		for(int i=0;i<data.length;i++) {
			System.out.println("Value is "+data[i]);
		}

	}

}
