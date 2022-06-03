package _1.Q;

public interface X {
	public abstract void funX1();
	public default void funX2() {
		System.out.println("i am default method of x");
	}
	public static void funX3() {
		System.out.println("i am static method of x");

	}
	
}
