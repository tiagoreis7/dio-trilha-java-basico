import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro:");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro:");
		int paramentroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, paramentroDois);
		} catch (ParametroInvalidosException exception) {
			System.out.println("O primeiro parâmetro deve ser menor que o segundo.");
		}

	}

	static void contar(int parametroUm, int parametroDois) throws ParametroInvalidosException{
		if (parametroUm > parametroDois)
			throw new ParametroInvalidosException();
		
		int contagem = parametroDois - parametroUm;
		for (int numeroInicial = 1; numeroInicial <= contagem; numeroInicial++)
			System.out.println("Imprimindo o número: " + numeroInicial);
	}
}
