/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newclass;

/**
 *
 * Name : Kwangmin Kim
 * Course : GCU CST-105
 * Programming_exercise_7
 */
public class ProgrammingExercise_7 {
    public static void main(String[] args) 

	{ 

		int number = 100000;

		int perLine = 5;

		int count = 1;

		for (int i = 0; i < number; i++)

		{

			if(isPrime(i) == true && isPalindromic(i) == true && i != 0 && i != 1)

			{

				if(i <= 100)

				{

					System.out.print(i + "     ");

				}

				else if(i > 100 && i <1000)

				{

					System.out.print(i + "   " );

				}

				else

				{

					System.out.print(i + " ");

				}

				if(count % perLine == 0)

				{

					System.out.print("\n");

				}

				

			count++;

			}

		}

		

		

		

	}

	public static boolean isPalindromic(int number)

	{

		String reverse = new StringBuilder(Integer.toString(number)).reverse().toString();

		int palindrome = Integer.parseInt(reverse);

		if( number == palindrome)

		{

			return true;

		}

		else

		{

			return false;

		}

	}

	public static boolean isPrime(int number)

	{

		for (int i = 2; i <= number / 2; i++)

		{

			if(number % i == 0)

			{

				return false;

			}

		}

		return true;

	}
}
