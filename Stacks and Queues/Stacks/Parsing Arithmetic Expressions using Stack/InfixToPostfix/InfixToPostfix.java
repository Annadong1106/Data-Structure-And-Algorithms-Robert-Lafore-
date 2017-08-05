package InfixToPostfixUsingStack;

public class InfixToPostfix
{
	private String input;
	
	InfixToPostfix(String s)
	{
		input = s;
	}
	
	public String doConvert()
	{
		String output = "";         //用来存放转化为Postfix的输出结果
		
		int len = input.length();
		StackX theStack = new StackX(len);  //用来存放operator
		
		int i;
		
		for(i = 0;i < len;i++)
		{
			char ch = input.charAt(i);
			
			if(isOperand(ch))
				output = output + ch;
			else if(isOperator(ch))  //如果是operator就要与栈中字符相比决定去向
			{
				while(!theStack.isEmpty() && !isOpeningParenthese(theStack.peekTop()) && HasHigherPre(theStack.peekTop(),ch))
				{
					output = output + theStack.peekTop();   //满足取出条件，则将字符从栈中取出
					theStack.pop();					
				}
				
				theStack.push(ch);   //最后将operator放到栈中
			}
			else if(isOpeningParenthese(ch))
			{
				theStack.push(ch);
			}
			else if(isClosingParenthese(ch))  //此时取出栈中'('前的所有字符
			{
				while(!theStack.isEmpty() && !isOpeningParenthese(theStack.peekTop()))
				{
					output = output + theStack.peekTop();
					theStack.pop();
				}
				
				theStack.pop();    //取出栈中的'('
		
			}
			else
				continue;
		}//end for
		
		//for循环已经对每一个字符进行处理，但是栈仍然不空
		while(!theStack.isEmpty())
		{
			output = output + theStack.peekTop();
			theStack.pop();
		}
		
		return output;
	}
	
	public boolean isOperand(char ch)
	{
		//此时注意如果是数字，必须只能是单数
		if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9')
			return true;
		else
			return false;
	}
	
	public boolean isOperator(char ch)
	{
		if(ch == '+' || ch == '-' || ch == '*' || ch == '/')
			return true;
		else
			return false;
	}
	
	public boolean isOpeningParenthese(char ch)
	{
		return ch == '(';
	}
	
	public boolean HasHigherPre(char stackCh,char ch)
	{
		int stackChWeight = getOperatorWeight(stackCh);
		int chWeight = getOperatorWeight(ch);
		
		if(stackChWeight >= chWeight)
			return true;
		else
			return false;
	}
	
	public int getOperatorWeight(char ch)
	{
		int weight = -1;
		
		switch(ch)
		{
		   case '+':
		   case '-':
			   weight = 1;  break;
		   case '*':
		   case '/':
			   weight = 2;  break;
		}
		return weight;
	}
	
	public boolean isClosingParenthese(char ch)
	{
		return ch == ')';
	}
}
















