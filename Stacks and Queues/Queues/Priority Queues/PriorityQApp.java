package PriorityQueues;

public class PriorityQApp {

	public static void main(String[] args) 
	{
		PriorityQ thePQ = new PriorityQ(5);
		
		thePQ.insert(30);
		thePQ.insert(50);
		thePQ.insert(10);
		thePQ.insert(40);
		thePQ.insert(20);
		
		while(!thePQ.isEmpty())
		{
			System.out.print(thePQ.peekMin() + "  ");
			thePQ.remove();
		}
	}
}

/*
 * 在JDK1.8中输入结果为：
 * --------------------
 * 10  20  30  40  50  
 * --------------------
 * */

