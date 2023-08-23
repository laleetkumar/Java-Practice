import java.util.*;
class FactorialFind{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter The Number!");
	int num = sc.nextInt();
	
	    int a = 1;
	    for(int i= num; i >= 1;i-- ){
	        
	       a = a * i;
	    }
		  System.out.println(a);
	}
}