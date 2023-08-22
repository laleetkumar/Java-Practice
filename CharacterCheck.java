import java.util.*;
class CharacterCheck{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter The Character !");
	int letter = sc.next().charAt(0);
	
	
	if(letter <= 'Z'){
		System.out.println("Capetal Letter");
	}
	
	else{
		System.out.println("Samall Letter");
	}
}
	
}