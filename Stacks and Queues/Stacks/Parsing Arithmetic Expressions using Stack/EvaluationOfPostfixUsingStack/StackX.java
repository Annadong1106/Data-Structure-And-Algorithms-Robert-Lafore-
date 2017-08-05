package EvaluationOfPostfixUsingStack;

/*
 * 一个存放long型变量的数组栈
 * */

public class StackX 
{
	private int maxSize;
	private long[] stackArray;
	private int top;
	
	StackX(int size)
	{
		maxSize = size;
		stackArray = new long[maxSize];
		top = -1;
	}
	
	public boolean isFull()
	{
		return top == maxSize - 1;		
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
		}		
	}
	
	public void pop()
	{
		if(isEmpty())
			return;
		else
		{
			top--;
		}	
	}
	
	public long peekTop()
	{
		return stackArray[top];
	}	
}
