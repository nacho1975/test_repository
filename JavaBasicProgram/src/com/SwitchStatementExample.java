package com;
import java.util.Scanner;

public class SwitchStatementExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;		// we can take the value through keyboard. 
		System.out.println("1:Add 2: Sub 3:Mul, 4:Div");
		System.out.println("Enter your choice");
		choice = sc.nextInt();
		int a,b;
		System.out.println("Enter the value of a ");
		a = sc.nextInt();
		System.out.println("Enter the value of b ");
		b = sc.nextInt();
		int add, sub,mul,div;
		switch(choice) {
		case 1 :add = a+b;
			    System.out.println("Addition of two number is "+add);
			    break;
		case 2 :sub = a-b;
			    System.out.println("Sub of two number is "+sub);
			    break;
		case 3 :mul = a*b;
			    System.out.println("Mul of two number is "+mul);
			    break;
		case 4 :div = a/b;
			    System.out.println("div of two number is "+div);
			    break;
		default:System.out.println("Wrong choice");
			    break;
		}
		sc.close();
		System.out.println("Finish");
	}

}
