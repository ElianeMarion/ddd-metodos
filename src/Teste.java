import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("Bem vinda(o) " + nome);
		
		System.out.println("Digite sua idade: ");
		String idade = entrada.nextLine();
		int id = Integer.parseInt(idade);
		int idade2 = entrada.nextInt();
		
		double x = Double.parseDouble(idade);
		System.out.println("Bem vinda(o) " + nome + " voce tem " + idade);
	}

}
