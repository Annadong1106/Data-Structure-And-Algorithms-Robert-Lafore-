package Circular Queue;

/*
 * 小技巧：
 * ①因为无法通过front与rear之间的大小关系来判断队列为空或已满，
 *   因此，我们多加一个nItems记录下当前数组中元素个数
 *   用nItems与数组大小进行比较，从而得出结论
 * ②rear和front的下一个位置均为：
 *   (rear + 1) % maxSzie;
 *   (front + 1)% maxSize;    
   ③初始状态下:rear = -1;    front = 0;
    因为在rear处插入，在front处删除
    且在rear端插入前要先确认rear该插入的位置，即rear初始为-1，因为当插入第一个Element时，rear = (rear + 1) % maxSzie == 0
    插在下标为0的位置，即数组第一个位置
 * */
public class Queue
{
	private long[] queArray;
	private int front;
	private int rear;
	private int nElems;
	private int maxSize;
	
	Queue(int size)
	{
		maxSize = size;
		queArray = new long[maxSize];
		nElems = 0;
		front = 0;     //front从0开始删除；
		rear = -1;      //rear处插入，
	}
	
	public boolean isFull()
	{
		return nElems == maxSize;
	}
	
	public boolean isEmpty()
	{
		return nElems == 0;
	}
	
	public void insert(long value)
	{
		if(isFull())
			return;
		else
		{
			rear = (rear + 1) % maxSize;   //先确定该插入的位置
			queArray[rear] = value;        //再把value插入
			nElems++;
		}
	}
	
	public void remove()
	{
		if(isEmpty())
			return;
		else
		{
			front = (front + 1) % maxSize;
		    nElems--;
		}
	}
	
	public long frontPeek()
	{
		return queArray[front];
	}
	
	public int size()
	{
		return nElems;
	}
	
}
