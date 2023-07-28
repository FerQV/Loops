# Loops
##While
###Part 1: While loops
Open your IDE and create a new Java class named Table
Copy the following code into your Java class Table and verify it works
	import java.util.Scanner;

	public class Table
	{
	    public static void main(String[] args)
	    {
	        Scanner console = new Scanner(System.in);
	        int num;
	        
	        System.out.print("Enter any positive integer: ");
	        num = console.nextInt();
	                
	        System.out.println("Multiplication Table of " + num);
	        
	       //TODO implement While loop to get print result
	    }
	}
Implement a while loop that prints out the multiplication table of the given input number.
##DoWhile
###Part 2: Do While loops
Create a new Java class with a main method(so you can run your code) called Fibonacci

The Fibonacci numbers are a traditional computer science problem: "each number is the sum of the two preceding ones, starting from 0 and 1."

The beginning of the sequence is thus:

0 1 1 2 3 5 8 13 21 34 55 89 ...

Add the following import to be able to capture user input n

  import java.util.Scanner;
Implement a Do While loop that calculates Fibonacci(n)

n	Fibonacci(n)
0	0
1	1
2	1
3	2
4	3
5	5
6	8
7	13
...	...
###Part 3: For loops
Use the for loop to create a programm that ask the user to input a name and then prints each of the letters of the name
Hint You can use the following String functions:

lenght() -> returns the total number of characters of a given String
chartAt(i) -> returns the character at the given position(i) of a String
