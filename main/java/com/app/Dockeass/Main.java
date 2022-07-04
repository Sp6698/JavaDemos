package com.app.Dockeass;

/**
 * Hello world!
 *
 */
public class Main 
{
	public static void main(String[] args)
	{
		System.out.println(checkIfInputIsanEvenNumber(122));
		
	}

	public static boolean checkIfInputIsanEvenNumber(int number)
	{
		return number % 2 == 0;
	}
}
