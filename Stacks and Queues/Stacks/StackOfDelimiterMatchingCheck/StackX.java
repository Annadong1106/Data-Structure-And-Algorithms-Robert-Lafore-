package DelimiterMatchingCheck;

public class StackX 
{
	private char[] arr;
	private int top;
	private int maxSize;
	
	StackX(int size)
	{
		maxSize = size;
		arr = new char[maxSize];
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
	
	public void push(char value)
	{
		if(isFull())
			return;
		else			
		{
			top++;
		    arr[top] = value;
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
	
	public char peek()
	{
		return arr[top];
	}
}
