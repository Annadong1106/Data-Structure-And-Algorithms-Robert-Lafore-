package Stacks;

/*
用数组创建的一个Last-in-First-out(后进先出)的栈
filed : top;    long[];     maxSize;    //注意：如果是数组栈，要提前确定数组的大小
method : isFull();     isEmpty();      push();      pop();      peek()(返回栈顶元素);
*/

public class StackX
{
	private int top;
	private long[] stackArray;
	private int nElems;
	private int maxSize;
	
	StackX(int size)
	{
		maxSize  = size;
		stackArray = new long[maxSize];
		top = -1;
		nElems = 0;
	}
	
	public boolean isFull()
	{
		if(maxSize - 1 == top)
			return true;
		else
			return false;
	}
	
	public boolean isEmpty()
	{
		return top == -1;
	}
	
	public void push(long value)
	{
		if(isFull())
			return;
		else
		{
			top++;
			stackArray[top] = value;
			nElems++;
		}		
	}
	
	public void pop()
	{
		if(isEmpty())
			return;
		else
		{
			top--;
			nElems--;
		}		
	}
	
	public long peek()
	{
		return stackArray[top];
	}
}














