package projeto_controleFluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//entrada de dados via terminal
		System.out.println("Digite o 1º número:");
		int parametro1 = scanner.nextInt();
		System.out.println("Digite o 2º número:");
		int parametro2 = scanner.nextInt();
		
		try {
			contar(parametro1, parametro2);
		}
		catch(ParametrosInvalidosException e){// tratando exceção caso o segundo número > primeiro número
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
		scanner.close();
	}

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException{
		 
		if (parametroDois <= parametroUm) {
	            throw new ParametrosInvalidosException();// chamando o catch dentro do método
	        }
		 
		int contagem = parametroDois - parametroUm;
		
		System.out.println("Iniciando a contagem...");
		for (int i = 1; i <= contagem; i++) {
			System.out.println("Número " + i);
		}
	}
}
