package _4.Q;

public class Main {
	public static void main(String[] args){
		//create an array of Animal class with size 3
		//initialize all 3 elements of this Animal class
		//with //Dog, Cat and Tiger class object.
		//call the all methods (eat,walk,makeNoise) from all
		//the 3 objects.
		
		Animal[] array = new Animal[3];
		array[0]= new Dog();
		array[1]= new Cat();
		array[2]= new Tiger();
		
		//dog
		System.out.println("dog..........");
		array[0].eat();
		array[0].walk();
		array[0].makeNoise();
		//cat
		System.out.println("cat..........");
		array[1].eat();
		array[1].walk();
		array[1].makeNoise();
		//tiger
		System.out.println("tiger..........");
		array[2].eat();
		array[2].walk();
		array[2].makeNoise();
	}
}
