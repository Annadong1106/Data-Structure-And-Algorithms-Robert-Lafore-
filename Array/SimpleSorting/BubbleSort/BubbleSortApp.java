package BubbleSort;

public class BubbleSortApp 
{
	public static void main(String[] args)
	{
		int maxSize = 100;
		ArrayBub arr = new ArrayBub(maxSize);
		
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
		
		arr.bubbleSort();
		arr.display();
	}
}
/*
 * 在JDK1.8中输入结果为：
 * --------------------------------------
 * 77  99  44  55  22  88  11  0  66  33  
   0  11  22  33  44  55  66  77  88  99  
   --------------------------------------
 * */
