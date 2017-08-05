package SortingObjects;

/*
We use the compareTo() method of the String class to perform the comparisons in the insertSort() method.
*/

public class ArrayInOb
{
	private Person[] objectArray;
	private int maxSize;
	private int nElems;
	
	ArrayInOb(int size)
	{
		maxSize = size;
		objectArray = new Person[maxSize];
		nElems = 0;
	}
	
	public void insert(String lastName,String firstName,int age)
	{
		Person p = new Person(lastName,firstName,age);
		objectArray[nElems] = p;
		nElems++;
	}
	
	public void objectSort()   //用插入算法进行排序
	{
		int in;
		int out;
		
		for(out = 1;out < nElems;out++)
		{
			in = out;
			Person p = objectArray[out];
			
			while(in > 0 && objectArray[in-1].getLastName().compareTo(p.getLastName()) > 0)
			{
				objectArray[in] = objectArray[in-1];
				in--;
			}
			
			objectArray[in] = p;
		}
	}
	
	public void display()
	{
		int i;
		
		for(i = 0;i < nElems;i++)
		{
			objectArray[i].displayPerson();
		}
	}
	
}












