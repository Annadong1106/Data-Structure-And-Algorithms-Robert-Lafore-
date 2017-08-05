package PriorityQueues;


/*
 * 优先队列注意几点：
 * ①rear值一直不变，rear = 0；
 * ②the item with the smallest key has the highest priority.
 *   The smallest item is always removed first 
 *   数值越小，享有优先级越高，即最先输出，则在front端
 * ③在分析insert()中算法时，适当画图来表示
   ④此时不是循坏队列
 * */


public class PriorityQ 
{
	private int front;
	private int rear;
	private int maxSize;
	private int nElems;
	private long[] queArray;
	
	PriorityQ(int size)
	{
		maxSize = size;
		queArray = new long[maxSize];
		rear = -1;
		front = 0;
		nElems = 0;
	}
	
	public boolean isFull()
	{
		if(nElems == maxSize)
			return true;
		else
			return false;
	}
	
	public boolean isEmpty()
	{
		if(nElems == 0)
			return true;
		else
			return false;
	}
	/*
	 * The insert() method checks whether there are any items; 
	 * if not, it inserts one at index 0. 
	 * Otherwise, it starts at the top of the array and shifts existing items upward
	 * until it finds the place where the new item should go.
	 * Then it inserts the item and increments nItems.
	 * */
	public void insert(long value)
	{
		if(isFull())
			return;
		if(nElems == 0)
		{
			queArray[nElems] = value;
			nElems++;
		}
		else
		{
			int j;
			
			for(j = nElems-1;j >= 0;j--)
			{
				if(value > queArray[j])
				{
					queArray[j+1] = queArray[j];
				}
				else
					break;
			}
			queArray[j+1] = value;
			nElems++;			
		}
	}
	
	public void remove()
	{		
		nElems--;		
	}
	
	public long peekMin()
	{
		return queArray[nElems - 1];
	}	
}











