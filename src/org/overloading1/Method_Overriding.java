package org.overloading1;

public class Method_Overriding extends Method_Overloading {

	@Override // annotation
	public void emp_detail() {

		System.out.println("Last Name : Ramesh");
		super.emp_detail();
	}

	@Override
	public void emp_detail(int a) {
		int b = 10; 
		int c = a + b;
		System.out.println("Value of c =" + c);
		System.out.println("Employee Name : Monisha Ramesh");
		super.emp_detail(a);
	}

	@Override
	public void emp_detail(int a, int b, int c) {
		// TODO Auto-generated method stub
		super.emp_detail(a, b, c);
	}

	public static void main(String[] args) {
		Method_Overriding obj1 = new Method_Overriding();

		obj1.emp_detail(5);
		obj1.emp_detail(0.2f, 5.5f);
		obj1.emp_detail(5, 5.5f);
		obj1.emp_detail(5, 2, 2.2f);

	}

}
