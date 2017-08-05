package DelimiterMatchingCheck;

import java.util.Scanner;

public class BracketsApp 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s = input.nextLine();
		
		BracketChecker checker = new BracketChecker(s);
		checker.check();
	}
}
