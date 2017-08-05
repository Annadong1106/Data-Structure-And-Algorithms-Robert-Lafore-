package StoringObjects;

public class ClassDataApp 
{
	public static void main(String[] args)
	{
		int maxSize = 100;
		ClassDataArray arr = new ClassDataArray(maxSize);
	
	    //insert 10 items
		arr.insert("Evans","Patty",24);
		arr.insert("Smith","Lorraine",37);
		arr.insert("Yee","Tom",43);
		arr.insert("Adams","Henry",63);
		arr.insert("Hashimoto","Sato",21);
		arr.insert("Stimson","Henry",29);
		arr.insert("Velasquez","Jose",72);
		arr.insert("Lamarque","Henry",54);
		arr.insert("Vang","Minh",22);
		arr.insert("Creswell", "Lucinda",18);
		
		arr.display();
		
		String searchKey = "Stimson";
		Person found = arr.find(searchKey);
		if(found != null)
		{
			System.out.println("Found" + searchKey);
			found.display();
			System.out.println();
		}
		else
			System.out.println("Can't find " + searchKey);
		
		System.out.println("Deleting Smith, Yee, and Creswell");
		arr.delete("Smith");
		arr.delete("Yee");
		arr.delete("Creswell");
		
		arr.display();
	}
}
/*
 * 在JDK1.8中输入结果为：
----------------------------------------------------
Lastname : Evans , Firstname : Patty , age : 24
Lastname : Smith , Firstname : Lorraine , age : 37
Lastname : Yee , Firstname : Tom , age : 43
Lastname : Adams , Firstname : Henry , age : 63
Lastname : Hashimoto , Firstname : Sato , age : 21
Lastname : Stimson , Firstname : Henry , age : 29
Lastname : Velasquez , Firstname : Jose , age : 72
Lastname : Lamarque , Firstname : Henry , age : 54
Lastname : Vang , Firstname : Minh , age : 22
Lastname : Creswell , Firstname : Lucinda , age : 18
FoundStimson
Lastname : Stimson , Firstname : Henry , age : 29

Deleting Smith, Yee, and Creswell
Lastname : Evans , Firstname : Patty , age : 24
Lastname : Adams , Firstname : Henry , age : 63
Lastname : Hashimoto , Firstname : Sato , age : 21
Lastname : Stimson , Firstname : Henry , age : 29
Lastname : Velasquez , Firstname : Jose , age : 72
Lastname : Lamarque , Firstname : Henry , age : 54
Lastname : Vang , Firstname : Minh , age : 22
------------------------------------------------------
 * 
 * */
