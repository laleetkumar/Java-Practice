import java.util.Scanner;
 class Calculator
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int num1,num2,ch;
		System.out.println("Enter first Number ! ");
		num1=sc.nextInt();
		
		System.out.println("Enter Scound Number ! ");
		num2=sc.nextInt();
		
		System.out.println("Enter Your Choice 1 -> Add 2 -> Subtract 3 -> Multiply 4 -> Divide");
		ch=sc.nextInt();
		
		switch(ch)
		{
		   case 1:
		       	System.out.println("Addition = "+ (num1+num2));
			break;
		       	
		   case 2:
		       	System.out.println("Subtraction = "+ (num1-num2));
			break;
		       	
		    case 3:
		       	System.out.println("Multiplication = "+ (num1*num2));
			break;
		       	
		    case 4:
		       	System.out.println("Divide = "+ (num1/num2));
			break;

		default:
			System.out.println("Invalid Choice");

		}
	}
}