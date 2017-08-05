package EvaluationOfPostfixUsingStack;

import java.util.Scanner;

public class EvaluationOfPostfixApp {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a string : ");
		String s = input.nextLine();
		EvaluationOfPostfix  evaluation = new EvaluationOfPostfix(s);
		
		System.out.println("The result of postfix expression : " + evaluation.doEvaluate());
	}
}

/*
 * 在JDK1.8中输入结果为：
 * -----------------------------------------
 * Please enter a string : 2,3,*,5,4,*,+,9,-
   The result of postfix expression : 17
   -----------------------------------------
   -----------------------------------------
   Please enter a string : 23*54*+9-
   The result of postfix expression : 17
   -----------------------------------------
 * */
