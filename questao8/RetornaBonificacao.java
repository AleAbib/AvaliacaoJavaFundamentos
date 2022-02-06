package questao8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RetornaBonificacao {
	
	public static void main(String[] args) {
		
		//vari�veis criadas para armazenamento e leitura de dados
		Scanner leDados = new Scanner(System.in);
		String[] nome = null;
		int[] salario = null;
		int quantidadeFuncionarios = 0;
		
		//Try catch para tratar uma exce��o que � quando o usu�rio insere valores negativos ou letras na quantidade de funcionarios
		try {
			
			//usu�rio insere quantos funcion�rios deseja calcular bonifica��o, de modo que saiba o tamanho do array a ser criado
			System.out.println("Quantos funcion�rios voc� deseja calcular bonifica��es: ");
			quantidadeFuncionarios = leDados.nextInt();
			
			//Setando o tamanho dos arrays
			nome = new String[quantidadeFuncionarios];
			salario = new int[quantidadeFuncionarios];
		} catch (Exception excecao) {
        	System.out.println("Erro de entrada: vari�vel recebe apenas numerais positivos \n");
        	main(args);
		}
		
		//loop que far� o preenchimento do array de funcion�rios e sal�rios
		for(int i=0; i < quantidadeFuncionarios; i++) {
			
			//limpando o buffer de mem�ria
			leDados.nextLine();
			
			System.out.println("Nome do funcion�rio: ");
			nome[i] = leDados.nextLine();
			
			System.out.println("Sal�rio: ");
			salario[i] = leDados.nextInt();
		}
		
		//loop que far� a grava��o dos funcion�rios e sal�rios no banco e
		//tamb�m far� o print de cada funcion�rio com o sal�rio bruto, bonus ou desconto e sal�rio l�quido
		for(int i=0; i < quantidadeFuncionarios; i++) {
			Funcionario funcionario = new Funcionario();
			
			funcionario.setNome(nome[i]);
			funcionario.setSalario(salario[i]);
			
			System.out.println("Funcion�rio: " + funcionario.getNome());
			System.out.println("Sal�rio: " + funcionario.getSalario());
			funcionario.getBonificacao();
			
			System.out.println("\n");
		}
	}
}
