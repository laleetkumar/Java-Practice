import java.util.*;
class  FindGrossSalery{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter The Basic Salary : ");
		int basicSalary = sc.nextInt();
	
	 if (basicSalary < 1500) 
            {
                double persantage = 10.0 / 100 * basicSalary;
                double hra = basicSalary + persantage;
                double p = 90.0 / 100 * basicSalary;
                double da = basicSalary + p;     
                double grossSalary = hra + da;
				System.out.println("GrossSalary = " + grossSalary);
               
            }
            else if (basicSalary >= 1500)
            {
                
                double hra = 500 + basicSalary;
                double persantage = 98.0 / 100 * basicSalary;
                double da = basicSalary + persantage;
                double grossSalary = hra + da;
				System.out.println("GrossSalary = " + grossSalary);
               
            }
	
	}
	
}