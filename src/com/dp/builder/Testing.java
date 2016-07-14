/**
 * 
 */
package com.dp.builder;

/**
 * @author ssha78
 * 
 */
public class Testing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "emp1", "AL1");
		Employee emp2 = new Employee(2, "emp2", "AL2");

		emp1 = new EmployeeBuilder(emp1).addAccountId(1234)
				.addAccountName("Wellington").addAge(21).getEmployee();

		emp2 = new EmployeeBuilder(emp2).addAccountId(5678)
				.addAccountName("Goldman Sach").addAge(24).addFatherName("f2")
				.addMotherName("m2").addLeadId(1000).getEmployee();

		emp1.displayEmpDetails();
		System.out.println("*************");
		emp2.displayEmpDetails();

	}

}
