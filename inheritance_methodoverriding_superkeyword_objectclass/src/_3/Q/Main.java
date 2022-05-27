package _3.Q;
//What is the use of ‘this’ and ‘super’ keyword in java explain with example.
public class Main {
	public static void main(String[] args){
		Dog d=new Dog();
	}

}
class Animal{
	int a=10;
	public Animal(){
		System.out.println("animal is created");
	}
}
class Dog extends Animal{
	int a=50;
	public Dog(){
		super(); //super denote parent class constructor
		System.out.println("dog is created");
		System.out.println(this.a);//this denote the local variable or method
	}
}
