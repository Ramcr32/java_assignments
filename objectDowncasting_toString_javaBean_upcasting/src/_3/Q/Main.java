package _3.Q;
//Explain dynamic polymorphism ?
 public class Main {
	/*
	 * It is a process in which a call to an overridden method is resolved at runtime rather than
	Day7 and 8: Inheritance, method Overriding, Object 
	class, super keyword, Object downcasting, toString method. 16
	compile-time.
	In this process, an overridden method is called through the reference variable of a
	superclass. The determination of the method to be called is based on the object being
	referred to by the reference variable.
	 * */
	 public static void main(String args[]){
			Bike b = new Splendor();//upcasting
			b.run(); //
		}
}	
	class Bike{
		void run(){
			System.out.println("running");
		}
	}
	
	class Splendor extends Bike{
		void run(){
			System.out.println("running safely with 60km");
		}
		
	}
	
/*
 * Explanation:
In this example, we are creating two classes Bike and Splendor. Splendor class extends
Bike class and overrides its run() method. We are calling the run method by the
reference variable of Parent class. Since it refers to the subclass object and subclass
method overrides the Parent class method, the subclass method is invoked at runtime.
Since method invocation is determined by the JVM not compiler, it is known as runtime
polymorphism.
*/

