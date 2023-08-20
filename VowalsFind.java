import java.util.*;
class  VowalsFind
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter First Latter : ");
	    char latter1 = sc.next().charAt(0);
	    
	    System.out.print("Enter Scound Latter : ");
	    char latter2 = sc.next().charAt(0);
	    System.out.println();
	    for(char i = latter1; i<=latter2;i++){
	        
	        if(i=='a'||i=='A'||i=='E'||i=='e'||i=='I'||i=='i'||i=='O'||i=='o'||i=='u'||i=='U'){
	            System.out.println("This is vowals = " +i);
	        }
	      
	        
	    }
	}
    
}