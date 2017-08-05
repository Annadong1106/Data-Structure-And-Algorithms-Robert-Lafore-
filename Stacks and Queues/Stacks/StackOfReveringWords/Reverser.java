package StackOfReversingWord;

/*
create 一个类(工具)，可以将接收的word逆向输出
*/

public class Reverser
{
	private String input;
	private String output;
	
	Reverser(String s)
	{
		input = s;
	}
	
	public String doRev()
	{
		//先将Word中所有字符放入栈中
		int len = input.length();
		StackX theStack = new StackX(len);
		
		int i;
		for(i = 0;i < len;i++)
		{
			char ch = input.charAt(i);
			theStack.push(ch);
		}
		
		//再将字符从栈中取出来
		output = "";
		while(!theStack.isEmpty())
		{
			output = output + theStack.peek();
			theStack.pop();
		}
		
		return output;
		
	}
}

