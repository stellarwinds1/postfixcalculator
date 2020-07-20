package com.mycompany.postfixcalculator;

class PostFixCalculator
{
	public static String calculate(double first, double second, char operator)  throws Exception
	{
		double result = 0;
		boolean invalidOperator = false;

		switch (operator) {
			case '+' :
				result = first + second;
				break;
			case '-' :
				result = first - second;
				break;
			case '*' :
				result = first * second;
				break;
			case '/' :
				if (second == 0) {
					throw new Exception ("Cannot divide by zero ");
				}
				result = first / second;
				break;
			
			default :
				invalidOperator = true;

		}

		if (invalidOperator) {
			throw new Exception("Invalid operator " + operator);
		} else if ((result - (int) result) == 0) {
			return String.format("%.0f", result);
		} else {
			return String.format("%.2f", result);
		}
	}

}

/**
 * Postfix Calculator
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

		try {
			double d1 = 23;
			double d2 = 10.2;
			String result = ""; 

			System.out.println("d1 = " + d1 + " d2 = " + d2);
			result = PostFixCalculator.calculate(d1, d2, '+');
			System.out.println("Addition result = " + result);
			result = PostFixCalculator.calculate(d1, d2, '+');
			System.out.println("Subtraction result = " + result);
			result = PostFixCalculator.calculate(d1, d2, '+');
			System.out.println("Multiplication result = " + result);
			result = PostFixCalculator.calculate(d1, d2, '+');
			System.out.println("Division result = " + result);
		} catch (Exception e) {
			System.err.println("Caught an exception " + e.getMessage());
		}
    }
}
