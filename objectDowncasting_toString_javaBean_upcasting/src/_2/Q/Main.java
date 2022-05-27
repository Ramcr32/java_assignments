package _2.Q;
//Explain ClassCastException with the help of the example.
public class Main {
/*	We can downcast the parent class variable to the child class object only if
	the Parent class variable points to the Child class object , otherwise it will throw a
	runtime exception called ClassCastException. */
	void doSomething(Animal a){
		Dog d = (Dog)a;
		d.bark();
		//handling class cast exception
//		if(a instanceof Dog){
//			Dog d = (Dog)a;
//			d.bark();
//			
//		}
	}
	public static void main(String args[]){
		Main main = new Main();
		main.doSomething(new Animal());
		main.doSomething(new Dog());
	}

}
class Animal{
	void eat(){
		System.out.println("eating...");
	}
}
class Dog extends Animal{
	@Override
	void eat(){
		System.out.println("eating bread...");
	}
	//specific method of child class
	void bark(){
		System.out.println("barking...");
	}
}
