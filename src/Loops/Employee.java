package Loops;

public class Employee implements ICalculator {
//	static String emp_name;
//	static float emp_salary;
	static int result;
	
//	static void set(String name,float salary) {
//		emp_name = name;
//		emp_salary = salary;
//	}
//
//	static void get() {
//		System.out.println("Name is: "+emp_name);
//		System.out.println("Salary: "+emp_salary);
//	}

	@Override
	public void add(int a, int b) {
		result = a + b;
		
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		result = a-b;
		
	}

	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		result = a*b;
		
	}

	@Override
	public void div(int a, int b) {
		// TODO Auto-generated method stub
		result = a/b;
		
	}
	
	public int get() {
//		System.out.print(result);
		return result;
	}
}
