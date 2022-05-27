package _1.Q;

public class Main {
	public static void main(String[] args) {
		Employee e= new Employee();
		e.name="syam";
		e.age=28;
		e.phoneNumber="54894564";
		e.address="rajnagar rajpur";
		e.salary=5165.464546;
		
		Manager m= new Manager();
		m.name="rahim";
		m.age=22;
		m.phoneNumber="979854454";
		m.address="rajnagar raigarh";
		m.salary=645535.464546;
		
		m.printSalary();
		e.printSalary();
		
		System.out.println(e.name);
		System.out.println(m.name);
		
	}
}
