package _1.Q;

public class ZImpl implements Z{

	@Override
	public void funX1() {
		System.out.println("i am abstract method of X");
		
	}

	@Override
	public void funY1() {
		System.out.println("i am abstract method of Y");
		
	}

	@Override
	public void funZ() {
		System.out.println("i am abstract method of Z");
		
	}
	@Override
	public void funX2() {
		System.out.println("i am overriden default method of Z ");
	}

}
