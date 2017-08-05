package EvaluationOfPostfixUsingStack;

/*
注意：Postfix的格式为：<operand><operand><operator>
所以在doEvaluate()方法中，遇到operator就将栈中前连个元素取出
但要注意，由于栈后进先出的特性，因此先取出的是op2,后取出的是op1;
注意此时的数仍然是个位数
*/

public class EvaluationOfPostfix 
{
	private String input;
	
	EvaluationOfPostfix(String s)
	{
		input = s;
	}
	
	public long doEvaluate()
	{
		int len = input.length();
		StackX theStack = new StackX(len);
		
		int i;
		
		for(i = 0;i < len;i++)
		{
			char ch = input.charAt(i);
			
			if(isOperator(ch))
			{
				long op2 = theStack.peekTop();
				theStack.pop();
				
				long op1 = theStack.peekTop();
				theStack.pop();
				
				long result = perform(op1,op2,ch);
				
				theStack.push(result);
			}
			else if(isOperand(ch))
			{
				long value = ch - '0';
				theStack.push(value);
			}
			else
				continue;
		}
		return theStack.peekTop();
	}
	
	public long perform(long op1,long op2,char ch)
	{
		if(ch == '+')
			return op1 + op2;
		else if(ch == '-')
			return op1 - op2;
		else if(ch == '*')
			return op1 * op2;
		else
			return op1/op2;
	}
	
	public boolean isOperator(char ch)
	{
		if(ch == '+' || ch == '-' || ch == '*' || ch == '/')
			return true;
		else
			return false;
	}
	
	public boolean isOperand(char ch)
	{
		if(ch >= '0' && ch <= '9')
			return true;
		else
			return false;
	}

}




















