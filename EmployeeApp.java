package com.revature.practice;


class Employee{
	String name;
	String ssn;
	String dept;
	int salary;
	Employee() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(String name, String ssn, String dept, int salary) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.dept = dept;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", ssn=" + ssn + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	
}
public class EmployeeApp {

	
	Employee getEmployeeInfo(String str) {
		Employee employee=new Employee();
		employee.setName(str.substring(0,str.indexOf("@")));
		employee.setDept(str.substring(str.indexOf("@")+1,str.indexOf("-")));
		employee.setSsn(str.substring(str.indexOf("-")+1,str.indexOf("#")));
		employee.setSalary(Integer.valueOf(str.substring(str.indexOf("#")+1)));
		

 /*  given string    -   "abc@4356-uuuii#98000"   ;
    name =abc,  ssn=4326,  dept=uuuii, sal=98
    Cretae Employee Object with above details and return MEployee Object*/
		return employee;
				
	}
	String getEmployeeLevel(Employee e) {
		
		String level=e.getSsn();
		int ssn=Integer.valueOf(level);
		if(ssn>=1 && ssn<=10)
			level="L1";
		else if(ssn>=61 && ssn<=120)
			level="L2";
		else if(ssn>=121 && ssn<=180)
			level="L3";
		else
			level="L4";
		

/* 
    in a given employee if ssn is - 1 to 10 employee level is L1
if ssn is - 61 to 120 employee level is L2
if ssn is - 121 to 180 employee level is L3
else L4
rteurn the given level"

*/

		return level;
			
	}
	public static void main(String[] args) {
		EmployeeApp e=new EmployeeApp();
		System.out.println(e.getEmployeeInfo("abc@4356-uuuii#98"));
		System.out.println(e.getEmployeeLevel(new Employee("abc","4356","uuuii",9889)));
		
	}
}
 