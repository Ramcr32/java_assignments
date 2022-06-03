package _1.Q;

public interface Y {
	public abstract void funY1();
	public default void funY2() {
		System.out.println("i am default method of Y");
	}
	public static void funY3() {
		System.out.println("i am static method of Y");

	}
}
