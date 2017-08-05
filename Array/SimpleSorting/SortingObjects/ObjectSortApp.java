package SortingObjects;

public class ObjectSortApp 
{
	public static void main(String[] args)
	{
		int maxSize = 100; // array size
		ArrayInOb arr; // reference to array
		arr = new ArrayInOb(maxSize); // create the array
		arr.insert("Evans","Patty",24);
		arr.insert("Smith","Doc",59);
		arr.insert("Smith","Lorraine",37);
		arr.insert("Smith","Paul",37);
		arr.insert("Yee","Tom",43);
		arr.insert("Hashimoto","Sato",21);
		arr.insert("Stimson","Henry",29);
		arr.insert("Velasquez","Jose",72);
		arr.insert("Vang","Minh",22);
		arr.insert("Creswell","Lucinda",18);
		
		System.out.println("Before sorting : ");
		arr.display();
		
		arr.objectSort();
		System.out.println("After sorting : ");
		arr.display();
	}
}

/*
 * 在JDK1.8中输入结果为：
---------------------------------------------------------
Before sorting : 
Lastname : Evans , Firstname : Patty , Age : 24
Lastname : Smith , Firstname : Doc , Age : 59
Lastname : Smith , Firstname : Lorraine , Age : 37
Lastname : Smith , Firstname : Paul , Age : 37
Lastname : Yee , Firstname : Tom , Age : 43
Lastname : Hashimoto , Firstname : Sato , Age : 21
Lastname : Stimson , Firstname : Henry , Age : 29
Lastname : Velasquez , Firstname : Jose , Age : 72
Lastname : Vang , Firstname : Minh , Age : 22
Lastname : Creswell , Firstname : Lucinda , Age : 18
After sorting : 
Lastname : Creswell , Firstname : Lucinda , Age : 18
Lastname : Evans , Firstname : Patty , Age : 24
Lastname : Hashimoto , Firstname : Sato , Age : 21
Lastname : Smith , Firstname : Doc , Age : 59
Lastname : Smith , Firstname : Lorraine , Age : 37
Lastname : Smith , Firstname : Paul , Age : 37
Lastname : Stimson , Firstname : Henry , Age : 29
Lastname : Vang , Firstname : Minh , Age : 22
Lastname : Velasquez , Firstname : Jose , Age : 72
Lastname : Yee , Firstname : Tom , Age : 43
---------------------------------------------------------
 * */


