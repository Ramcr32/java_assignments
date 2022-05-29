package _2.Q;

import java.util.Scanner;

public class Child extends Parent{
	@Override
	void method1() {
		System.out.println("this is child class method 1");
		System.out.println("value of number"+number);
	}
	@Override
	void method3() {
		System.out.println("this is child class method 3");
	}
	void method4() {
		System.out.println("this is child class method 4");
	}
	
	public static void main(String[] args) {
		Parent c = new Child();
		Child r= (Child ) c;
//		Parent p = new Parent();//not possible
//		Child t = (Child) p;
//		System.out.println(r instanceof Parent);
		r.method1(); //child class method call
		r.method2(); //parent class method call
		r.method3();//child class method call
		r.method4(); //child class method call
		//
		c.method1(); //child class method call
		c.method2(); //parent class method call
		c.method3(); //child class method call
		
		
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		if(value>1 && value<10 ) {
			r.method1();
		}else {
			System.out.println("invalid number");
		}
		
	}
}
