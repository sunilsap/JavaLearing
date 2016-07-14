/**
 * 
 */
package com.dp.builder;

/**
 * @author ssha78
 * 
 */
public class Employee {

	int id;
	int salary;
	int age;
	int leadId;
	int accountId;
	int projectId;

	String name;
	String fatherName;
	String motherName;
	String company;
	String address;
	String projectName;
	String accountName;
	String supervisor;
	String title;

	public Employee(int id, String name, String title) {
		this.id = id;
		this.name = name;
		this.title = title;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary
	 *            the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the leadId
	 */
	public int getLeadId() {
		return leadId;
	}

	/**
	 * @param leadId
	 *            the leadId to set
	 */
	public void setLeadId(int leadId) {
		this.leadId = leadId;
	}

	/**
	 * @return the accountId
	 */
	public int getAccountId() {
		return accountId;
	}

	/**
	 * @param accountId
	 *            the accountId to set
	 */
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	/**
	 * @return the projectId
	 */
	public int getProjectId() {
		return projectId;
	}

	/**
	 * @param projectId
	 *            the projectId to set
	 */
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the fatherName
	 */
	public String getFatherName() {
		return fatherName;
	}

	/**
	 * @param fatherName
	 *            the fatherName to set
	 */
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	/**
	 * @return the motherName
	 */
	public String getMotherName() {
		return motherName;
	}

	/**
	 * @param motherName
	 *            the motherName to set
	 */
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company
	 *            the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * @param projectName
	 *            the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	/**
	 * @return the accountName
	 */
	public String getAccountName() {
		return accountName;
	}

	/**
	 * @param accountName
	 *            the accountName to set
	 */
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	/**
	 * @return the superVisor
	 */
	public String getSupervisor() {
		return supervisor;
	}

	/**
	 * @param superVisor
	 *            the superVisor to set
	 */
	public void setSupervisor(String superVisor) {
		this.supervisor = superVisor;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	public void displayEmpDetails() {
		System.out.println("id = " + id);
		System.out.println("salary = " + salary);
		System.out.println("age = " + age);
		System.out.println("leadId = " + leadId);
		System.out.println("accountId = " + accountId);
		System.out.println("projectId = " + projectId);

		System.out.println("name = " + name);
		System.out.println("fatherName = " + fatherName);
		System.out.println("motherName = " + motherName);
		System.out.println("company = " + company);
		System.out.println("address = " + address);
		System.out.println("projectName = " + projectName);
		System.out.println("accountName = " + accountName);
		System.out.println("supervisor = " + supervisor);
		System.out.println("title = " + title);

	}

}
