import java.util.Scanner;

class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int a = scanner.nextInt();

		System.out.println("Enter another number: ");	
		int b = scanner.nextInt();

		System.out.println("Enter the operator: ");
		char operator = scanner.next().charAt(0);	

		// Addition or Subtraction
		int result = 0;		
		
		if (operator == '+')
			result = a + b;
		if (operator == '-')
			result = a - b;
		if (operator == '*')
			result = a * b;
		if (operator == '/')
			result = a / b;
		if (operator == '%')
			result = a % b;

		System.out.println("Result = " + result);	

	}
}