package questão2;

import java.util.Scanner;

public class Fibonacci {

	public static int fibonaci(int n) {
		if(n<2) {
			return n;
		}
		return fibonaci(n-1) + fibonaci(n-2);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite uma valor: ");
		int valor = Integer.parseInt(input.nextLine());
		
		for(int i = 0; i <= valor; i++) {
			if(valor == fibonaci(i)) {
				System.out.println("O valor "+valor+" pertence a sequencia fibonaci");
				break;
			}
			if(i >= valor) {
				System.out.println("O valor "+valor+" não pertence a sequencia fibonaci");
				break;
			}
		}
		input.close();
	}

}
