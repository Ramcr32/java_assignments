package _4.Q;
//Q4)Take the Command Line Argument and print the factorial of that number.
public class Main {
	public static void main(String[] args) {
		Main m=new Main();
		int strLength= args.length;
		if(strLength==1) {
			int i0=Integer.parseInt(args[0]);
			System.out.println(m.fact(i0)); 
			
		}else if(strLength==2) {
			int i0=Integer.parseInt(args[0]);
			int i1=Integer.parseInt(args[1]);
			
			System.out.println(m.fact(m.absolute(i0-i1))); 
			
		}else {
			System.out.println("Error");
		}
		
	}
	public int absolute(int a) {
		if(a>=0) {
			return a;
		}
		else {
			return -1*a;
		}
	}
	public int fact(int n) {
		int f=1;
		for(int i=1; i<=n; i++) {
			f*=i;
		}
		return f;
	}
}
