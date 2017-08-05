package InfixToPostfixk;

import java.util.Scanner;

public class InfixToPostfixApp 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an expression : ");
		String s = input.nextLine();
		
		InfixToPostfix convert = new InfixToPostfix(s);
		System.out.println("After converted : " + convert.doConvert());		
	}
}
/*
 * 在JDK1.8中输入结果为：
 * -----------------------------
 * Enter an expression : A*(B+C)
   After converted : ABC+*
   -----------------------------
 * */
/* 在JDK1.8中输入结果为：
 * -------------------------------
 * Enter an expression : A+B*C-D*E
   After converted : ABC*+DE*-
   -------------------------------
   -------------------------------
   Enter an expression : 2+3*4-5*6
   After converted : 234*+56*-
   -------------------------------
 * */
