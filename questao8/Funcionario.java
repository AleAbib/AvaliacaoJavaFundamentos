package questao8;

public class Funcionario {
	
	private String nome;
	private double salario;
	
	public void getBonificacao() {
		
		if(this.salario <= 1000) {
			
			System.out.println("Bonus: " + this.salario * 0.20);
			this.salario = this.salario * 1.20;
			System.out.println("Salário Líquido: " + this.salario);
			
		}else if (this.salario > 1000 && this.salario <= 2000) {
			System.out.println("Bonus: " + this.salario * 0.10);
			this.salario = this.salario * 1.10;
			System.out.println("Salário Líquido: " + this.salario);
			
		}else if (this.salario > 2000) {
			System.out.println("Desconto: " + this.salario * 0.10);
			this.salario = this.salario * 0.90;
			System.out.println("Salário Líquido: " + this.salario);
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
}
