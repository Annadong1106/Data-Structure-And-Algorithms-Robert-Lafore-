package Stacks;

public class StackApp 
{
	public static void main(String[] args)
	{
		StackX theStack = new StackX(10);
		
		theStack.push(20);
		theStack.push(40);
		theStack.push(60);
		theStack.push(80);
		
		while(!theStack.isEmpty())  //stack不空！
		{
			long temp = theStack.peek();
			System.out.print(temp + "  ");
			theStack.pop();
		}		
	}
}
/*
 * 在JDK1.8中输入结果为：
 * ----------------
 * 80  60  40  20  
 * ----------------
 * */
