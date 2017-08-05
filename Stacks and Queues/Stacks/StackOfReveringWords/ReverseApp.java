package StackOfReversingWord;

import java.util.Scanner;

public class ReverseApp 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("Enter a word : ");
			String s = input.nextLine();
			
			Reverser reverse = new Reverser(s);
			System.out.println("Reversed : " + reverse.doRev());
		}		
	}
}
/*
 * 在JDK1.8中输入结果为：
 * ----------------------------
 * Enter a word : part
   Reversed : trap
   Enter a word : trap
   Reversed : part
   Enter a word : 
 * */
