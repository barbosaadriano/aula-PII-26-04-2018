import java.util.Scanner;

public class Ex5 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.println("Informe um número:");
		num1 = scan.nextInt();
		System.out.println("Informe um número:");
		num2 = scan.nextInt();
		
		if ( num1 < num2 ) {
			System.out.println(num1);
			System.out.println(num2);
		} else {
			System.out.println(num2);
			System.out.println(num1);
		}
			
	}
	
}