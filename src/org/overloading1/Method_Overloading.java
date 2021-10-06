package org.overloading1;

public class Method_Overloading {

	public void emp_detail() {
		System.out.println("Employee Name : Monisha");
	}

	public void emp_detail(int a) {
		int b = 20;
		int c = a + b;
		System.out.println("Value Of C :" + c);
		System.out.println("Employee Id : 0258963");
	}

	public void emp_detail(float a) {
		System.out.println("Employee Salary : 1000000");
	}

	public void emp_detail(long c) {
		System.out.println("Employee DOB : 01/08/1992");
	}

	public void emp_detail(int a, float b) {
		System.out.println("Employee Designation : Seniour Proj Associate");
	}

	public void emp_detail(float a, int b) {
		System.out.println("Employee Company Name : IBM India Pvt LTD");
	}

	public void emp_detail(int b, int a) {
		System.out.println("Employee Experiance : 4.5 Years");
	}

	public void emp_detail(float b, float a) {
		System.out.println("Employee Tower : Accounts Payable");
	}

	public void emp_detail(int c, int a, float b) {
		System.out.println("Employee Domain : Finance & Accounting");
	}

	public void emp_detail(int a, int b, int c) {
		System.out.println("Employee Shift : U.K");
	}

	public static void main(String[] args) {
		System.out.println("Employee Details");

		Method_Overloading obj1 = new Method_Overloading();
		obj1.emp_detail();
		obj1.emp_detail(10);
		obj1.emp_detail(0.1f);
		obj1.emp_detail(1525l);
		obj1.emp_detail(0, 0.1f);
		obj1.emp_detail(0.1f, 0);
		obj1.emp_detail(0, 1);
		obj1.emp_detail(0.1f, 0.1f);
		obj1.emp_detail(0, 1, 0.1f);
		obj1.emp_detail(1, 2, 3);

	}

}
