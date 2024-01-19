import java.util.Scanner;
class Calculater 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number");
		double a=scan.nextDouble();
		System.out.println("Enter secound number");
		double b=scan.nextDouble();
		System.out.println("Enter a symbole '+' '-' '*' '%' '/' '^' ");
		String operator=scan.next();
		double result;
		switch (operator)
		{
		case "+":result=a+b;
		System.out.println(result);
		break;

		case "-":result=a-b;
		System.out.println(result);
		break;

		case "*":result=a*b;
		System.out.println(result);
		break;

		case "%":result=a%b;
		System.out.println(result);
		break;

		case "/":result=a/b;
		System.out.println(result);
		break;

		case "^":result=a^b;
		System.out.println(result);
		break;
		default :System.out.println("Enter a valid input");
		}
	}
}
