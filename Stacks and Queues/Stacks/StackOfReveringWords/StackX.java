package StackOfReversingWord;

/*
此时数组栈的类型为char型
*/

public class StackX 
{
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	StackX(int s)
	{
		maxSize = s;
		stackArray = new char[maxSize];
		top = -1;
	}
	
	public boolean push(char ch)
	{
		if(isFull())
			return false;
		else
		{
			top++;
			stackArray[top] = ch;
			return true;
		}
	}
	
	public void pop()
	{
		top--;
	}
	
	public char peek()
	{
		return stackArray[top];
	}	
	
	public boolean isEmpty()
	{
		if(top == -1)
			return true;
		else
			return false;
	}
	
	public boolean isFull()
	{
		if(top == maxSize - 1)  //注意top从零开始
			return true;
		else
			return false;
	}
}
