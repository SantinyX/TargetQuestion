package FibonacciQuestion;
import java.util.Scanner;

public class Fibonacci {
	
	//Verificação se o número é pertecente à sequencia de Fibo
	public static boolean verificaFibo(int num) {
		int a = 0;
		int b = 1;
		
		while (a <= num) {
			if (a == num) {
				return true;
			}
			int temp = b;
			b = a + b;
			a = temp;
		}
		
		return false;
	}
	
	//Após verificar enviar Scanner e mensagem
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
		int numero = scanner.nextInt();
		
		if (verificaFibo(numero)) {
			System.out.println(numero + " pertence à sequência  de Fibonacci.");
		} else {
			System.out.println(numero + " não pertence à sequência de Fibonacci");
		}
		
		scanner.close();

   }
}