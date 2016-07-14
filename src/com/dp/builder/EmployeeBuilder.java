/**
 * 
 */
package com.dp.builder;

/**
 * @author ssha78
 * 
 */
public class EmployeeBuilder {

	Employee employee;

	public EmployeeBuilder(Employee employee) {
		super();
		this.employee = employee;
	}

	public EmployeeBuilder addId(int id) {
		employee.setId(id);
		return this;
	}

	public EmployeeBuilder addSalary(int salary) {
		employee.setId(salary);
		return this;
	}

	public EmployeeBuilder addAge(int age) {
		employee.setId(age);
		return this;
	}

	public EmployeeBuilder addLeadId(int leadId) {
		employee.setLeadId(leadId);
		return this;
	}

	public EmployeeBuilder addAccountId(int accountId) {
		employee.setAccountId(accountId);
		return this;
	}

	public EmployeeBuilder addProjectId(int projectId) {
		employee.setProjectId(projectId);
		return this;
	}

	public EmployeeBuilder addName(String name) {
		employee.setName(name);
		return this;
	}

	public EmployeeBuilder addFatherName(String fatherName) {
		employee.setFatherName(fatherName);
		return this;
	}

	public EmployeeBuilder addMotherName(String motherName) {
		employee.setMotherName(motherName);
		return this;
	}

	public EmployeeBuilder addCompany(String company) {
		employee.setCompany(company);
		return this;
	}

	public EmployeeBuilder addProjectName(String projectName) {
		employee.setProjectName(projectName);
		return this;
	}

	public EmployeeBuilder addAccountName(String accountName) {
		employee.setAccountName(accountName);
		return this;
	}

	public EmployeeBuilder addSupervisor(String supervisor) {
		employee.setSupervisor(supervisor);
		return this;
	}

	public EmployeeBuilder addTitle(String title) {
		employee.setTitle(title);
		return this;
	}

	/**
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	}

}
