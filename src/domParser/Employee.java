package domParser;

/**
 * 
 * @author Bhavin
 * @since 15/03/2016; 20:29
 */

public class Employee {
	private int ID;
	private String firstName;
	private String lastName;
	private int age;
	private int salary;
	
	@Override
	public String toString(){
		return "ID: " + String.valueOf(ID) + "\nName: " + firstName + " " + lastName 
				+ "\nAge: " + age + "\nSalary: " + salary; 
	}

}
