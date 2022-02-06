package questao8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RetornaBonificacao {
	
	public static void main(String[] args) {
		
		//variáveis criadas para armazenamento e leitura de dados
		Scanner leDados = new Scanner(System.in);
		String[] nome = null;
		int[] salario = null;
		int quantidadeFuncionarios = 0;
		
		//Try catch para tratar uma exceção que é quando o usuário insere valores negativos ou letras na quantidade de funcionarios
		try {
			
			//usuário insere quantos funcionários deseja calcular bonificação, de modo que saiba o tamanho do array a ser criado
			System.out.println("Quantos funcionários você deseja calcular bonificações: ");
			quantidadeFuncionarios = leDados.nextInt();
			
			//Setando o tamanho dos arrays
			nome = new String[quantidadeFuncionarios];
			salario = new int[quantidadeFuncionarios];
		} catch (Exception excecao) {
        	System.out.println("Erro de entrada: variável recebe apenas numerais positivos \n");
        	main(args);
		}
		
		//loop que fará o preenchimento do array de funcionários e salários
		for(int i=0; i < quantidadeFuncionarios; i++) {
			
			//limpando o buffer de memória
			leDados.nextLine();
			
			System.out.println("Nome do funcionário: ");
			nome[i] = leDados.nextLine();
			
			System.out.println("Salário: ");
			salario[i] = leDados.nextInt();
		}
		
		//loop que fará a gravação dos funcionários e salários no banco e
		//também fará o print de cada funcionário com o salário bruto, bonus ou desconto e salário líquido
		for(int i=0; i < quantidadeFuncionarios; i++) {
			Funcionario funcionario = new Funcionario();
			
			funcionario.setNome(nome[i]);
			funcionario.setSalario(salario[i]);
			
			System.out.println("Funcionário: " + funcionario.getNome());
			System.out.println("Salário: " + funcionario.getSalario());
			funcionario.getBonificacao();
			
			System.out.println("\n");
		}
	}
}
