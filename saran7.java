import java.util.Scanner;

public class saran7 {
	private static Scanner sc;
	
	public static void main(String[] args) {
		int Num,fact=1;
		sc = new Scanner(System.in);
		
		System.out.println("Please Enter range of numbers: ");
		Num = sc.nextInt();
		
		for(int i = 1; i <= Num; i++) {
			fact=fact*i;    
		}
                System.out.println("Factorial of "+Num+" is: "+fact);    
	}
}