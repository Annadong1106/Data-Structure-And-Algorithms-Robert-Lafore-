package OOPArray;

/*
①the class user doesn’t even need to know what kind of data structure the HighArray class is using to store the data.
 The structure is hidden behind the interface.
②HighArrayApp作为一个user，此时他更多关注的不再使用什么工具来存储数据，而是直接通过调用HighArrayApp种方法来实现插入删除搜索；
 这是值得注意和学习的地方， 此时已经彻底将数据存储结构（工具）和使用者分开在两个类中
③•The process of separating the how from the what—how an operation is performed inside a class, 
  as opposed to what’s visible to the class user—is called abstraction.
 •Abstraction is an important aspect of software engineering. 
  By abstracting class functionality,we make it easier to design a program 
  because we don’t need to think about implementation details at too early a stage in the design process.
  可理解为模块化思想
*/


public class HighArrayApp 
{
	public static void main(String[] args)
	{
		//HighArray arr = new HighArray(100);
		
		int maxSize = 100;
		HighArray arr = new HighArray(maxSize);
		
		
		//insert 10 items
		arr.insert(77);
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);
		
		arr.display();
		
		//find the item with key 66
		int searchKey = 35;
		if(arr.find(searchKey))
			System.out.println("Found " + searchKey);
		else
			System.out.println("can't find " + searchKey);
		
		//delete 3 items
		arr.delete(00);
		arr.delete(55);
		arr.delete(99);
		
		arr.display();		
	}
}
/*
 * 在JDK1.8中输入结果为：
 * --------------------------------------
 * 0  11  22  33  44  55  66  77  88  99  
   can't find 35
   11  22  33  44  66  77  88  
   --------------------------------------
 * */
