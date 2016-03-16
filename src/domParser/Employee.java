package domParser;

/**
 * 
 * @author Bhavin
 * @since 15/03/2016; 20:29
 */

public class Employee {
	private String ID;
	private String firstName;
	private String lastName;
	private int age;
	private double salary;
	
	public Employee(String ID, String firstName, String lastName, int age, double salary){
		this.ID = ID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString(){
		return "ID: " + String.valueOf(ID) + "\nName: " + firstName + " " + lastName 
				+ "\nAge: " + age + "\nSalary: " + salary; 
	}

}
