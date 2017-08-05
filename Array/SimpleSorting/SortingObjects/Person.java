package SortingObjects;

public class Person 
{
	private String lastName;
	private String firstName;
	private int age;
	
	Person(String lastName,String firstName,int age)
	{
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
	}
	
	public void displayPerson()
	{
		System.out.print("Lastname : " + lastName);
		System.out.print(" , Firstname : " + firstName);
		System.out.println(" , Age : " + age);
	}
	
	public String getLastName()
	{
		return lastName;
	}
}









