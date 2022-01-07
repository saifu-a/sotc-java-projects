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

		int result = 0;		
		
		switch(operator) {
			case '+':
				result = a + b;
				break;
			case '-':
				result = a - b;
				break;
			case '*':
				result = a * b;
				break;
			case '/':
				result = a / b;
				break;
			case '%':
				result = a % b;
				break;
			default: 
				System.out.println("Wrong Input!");
				System.exit(1);
		}
			
		System.out.println("Result = " + result);	

	}
}