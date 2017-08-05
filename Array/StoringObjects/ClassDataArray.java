package StoringObjects;

/*
  show how objects,rather than variables of primitive types, can be stored.
• Here are the major changes between ClassDataArray and HighhArray:
  a. The type of the array arr is changed to Person.(数组数据类型由long变为Person)
  b. The key field (the last name) is now a String object, so comparisons require the equals() method rather than the == operator.
     The getLastName() method of Person obtains the last name of a Person object, and equals() does the comparison:
     if( a[j].getLastName().equals(searchName) )    
  c. The insert() method creates a new Person object and inserts it in the array, 
      instead of inserting a long value.(insert()方法中插入的是Person而不是long类型)
      
      
  public boolean equals(Object obj)
    ——that is, for any non-null reference values x and y,
      this method returns true if and only if x and y refer to the same object (x == y has the value true)
      意思是说：就算x和y有相同的内容，即同一个类的不同对象但是有相同的content也返回false，很不实用，
      因此部分类中已经重写了equals方法，eg：String类中已重写了equals方法
 * */

public class ClassDataArray
{
	private Person[] objectArray;
	private int nElems;
	private int maxSize;
	
	ClassDataArray(int size)
	{
		maxSize = size;
		objectArray = new Person[maxSize];
		nElems = 0;
	}
	
	public void insert(String lastName,String firstName,int age)
	{
		Person p  = new Person(lastName,firstName,age);
		
		objectArray[nElems] = p;
		nElems++;		
	}
	
	public Person find(String searchName)
	{
		int i;
		
		for(i = 0;i < nElems;i++)
		{
			if(objectArray[i].getLastName().equals(searchName))
				break;
		}
		
		if(i == nElems)
			return null;
		else
			return objectArray[i];
	}
	
	public boolean delete(String searchName)
	{
		int i;
		
		for(i = 0;i < nElems;i++)
		{
			if(objectArray[i] == find(searchName))
				break;
		}
		
		if(i == nElems)
			return false;
		else
		{
			int j;
			
			for(j = i;j < nElems-1;j++)
			{
				objectArray[j] = objectArray[j+1];
			}
			nElems--;
			
			return true;			
		}
	}
	
	public void display()
	{
		int i;
		
		for(i = 0;i < nElems;i++) 
		{
			objectArray[i].display();
		}
	}
}













