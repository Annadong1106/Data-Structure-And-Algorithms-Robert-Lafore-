package InfixToPostfix;
/*
char[]数组栈，用来存放operator
*/

public class StackX 
{
	private int maxSize;
	private int top;
	private char[] stackArray;
	private int nElems;
	
	StackX(int size)
	{
		maxSize = size;
		stackArray = new char[maxSize];
		top = -1;
		nElems = 0;
	}
	
	public boolean isFull()
	{
		if(top == maxSize - 1)
			return true;
		else
			return false;
	}
	
	public boolean isEmpty()
	{
		if(top == -1)
			return true;
		else
			return false;
	}
	
	public void push(char value)
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
	
	public char peekTop()
	{
		return stackArray[top];
	}
}
