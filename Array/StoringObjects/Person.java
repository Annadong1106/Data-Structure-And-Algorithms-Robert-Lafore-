package StoringObjects;

/*
field : lastName,firstName,age

constructor:Person(String ,String,int)

methods : getLastName(); display();          
*/


class Person
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
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void display()
	{
		System.out.println("Lastname : " + lastName
				           + "  " + "Firstname : " + firstName
		                   + "  " + "Age : " + age);
	}
}



