import java.util.*;
class ParallelAngleCheak{
public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter The First Line  !");
	int line1 = sc.nextInt();
	
	System.out.println("Enter The Scound Line  !");
	int line2 = sc.nextInt();
	
	if(line1 == line2){
		System.out.println("Angle Are Parallel!");
	}
	else {
		System.out.println("Angle Are Not Parallel!");
	}
}
}