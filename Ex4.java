import java.util.Scanner; // importar o Scanner

public class Ex4  {
	
	public static void main(String[] args) {
		//Criar scanner
		Scanner scan = new Scanner(System.in);
		
		// declarar variáveis
		int num1;
		int num2;
		
		// solicitar números ao usuário
		System.out.println("Informe os números");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		//calcular
		int resultado = num1 + num2;
		//exibir resultado
		System.out.println("O resultado é "+
		resultado);
	}
	
	
	
}