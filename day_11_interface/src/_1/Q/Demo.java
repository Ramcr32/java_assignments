package _1.Q;

public class Demo {

	public static void main(String[] args) {

		ZImpl zimpl =new ZImpl();
		//all method except static method 
		zimpl.funX1();
		zimpl.funX2();
		zimpl.funY1();
		zimpl.funY2();
		zimpl.funZ();
		//static method should be call by own interface
		X.funX3();
		Y.funY3();

	}

}
