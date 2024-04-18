package invertstring;
import java.util.Scanner;

public class InverteString {
	
	public static String inverteString(String str) {
		
		char[] caracter = str.toCharArray(); // Convertendo a string em um array
		int inicio = 0;
		int fim = caracter.length -1;
		
		while (inicio < fim) {
			//Fazendo a troca do inicio e do fim
			char temp = caracter[inicio];
			caracter[inicio] = caracter[fim];
			caracter[fim] = temp;
			
			//Movendo de inicio e fim para proximos caracteres
			inicio++;
			fim--;
		}
		
		//Obtendo retorno do array pra string
		return new String(caracter);
	}
	
	//Habilitando scanner
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite uma string para inverter: ");
		String entrada = scanner.nextLine();
		
		String invertida = inverteString(entrada);
		
		System.out.println("A string invertida é: " + invertida);
		
		scanner.close();
	}

}
