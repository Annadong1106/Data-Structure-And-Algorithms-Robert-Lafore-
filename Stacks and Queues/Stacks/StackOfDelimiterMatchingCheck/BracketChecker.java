package StackOfDelimiterMatchingCheck;

public class BracketChecker
{
	private String input;
	
	BracketChecker(String s)
	{
		input = s;
	}
	
	public void check()
	{
		int len = input.length();
		StackX theStack = new StackX(len);
		
		int j;
		for(j = 0;j < len;j++)
		{
			char ch = input.charAt(j);
			
			switch(ch)
			{
			   case '{':
			   case '(':
			   case '[':
				   theStack.push(ch);
				   break;                //此处break退出的是switch
				   
			   case '}':
			   case ')':
			   case ']':
				   if(!theStack.isEmpty())  //栈不空，pop出的元素与当前相比较，是否配对
				   {
					   char chx = theStack.peek();
					   theStack.pop();
					   if(
						     (ch == '}' && chx != '{') 
						   ||(ch == ')' && chx != '(') 
						   ||(ch == ']' && chx != '[')
						 )
					   {
						   System.out.println("Error : " + ch + " at " + j);						   
					   }
				   }
				   else
					   System.out.println("Error : " + ch + " at " + j);
				   
				   break;          //退出switch			
				   
			  default :  break;         //(如果ch是字母而不是符号的话，break)
		    }//end switch
		}//end for
		
		if(!theStack.isEmpty())      //对input所有的字符均进行了比较，但是栈依旧不空，说明富豪并没有配对
		{
			System.out.println("Error : midssing right delimiter");
		} 
	}//end check()
}
