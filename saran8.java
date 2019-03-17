import java.util.Scanner;

public class saran8 {
	private static Scanner sc;
	
	public static void main(String[] args) {
		int Num,Num2,fact=1;
		sc = new Scanner(System.in);
		
		System.out.println("Please Enter range of numbers: ");
		Num = sc.nextInt();
                Num2 = sc.nextInt();
		
		for(int i = Num; i <= Num2; i++) {
			fact=fact*i;    
		}
                System.out.println("Factorial of "+Num+"to"+Num2+" is: "+fact);    
	}
}