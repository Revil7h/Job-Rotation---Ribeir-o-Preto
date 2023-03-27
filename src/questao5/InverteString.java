package questao5;

import java.util.Scanner;

public class InverteString {
	
	public static String invertePalavra(String palavra) {
		String novaPalavra="";
		for(int i= palavra.length()-1 ; i >= 0; i--) {
			novaPalavra = novaPalavra + palavra.charAt(i); 
		}
		return novaPalavra;
	}
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escreva uma palavra: ");
		String palavra = input.nextLine();
		System.out.println(invertePalavra(palavra));
		input.close();
	}
}
