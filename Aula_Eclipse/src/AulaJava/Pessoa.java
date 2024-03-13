package AulaJava;

public class Pessoa {
	
	//visibilidade do atributo
	private String nome;
	private int idade;
	
	//Diferença public x private: 
	//public pode ser alterado em qualquer parte do sistema
	//private: somente a própria classe

	//construtor
	public Pessoa (String n) {
		this.nome = n;
		this.idade = 0;

}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(this.idade > 18) {
		this.nome = nome;
	}
		else {
			System.out.println("Tentativa de redefinição: Pessoa só pode redefinir o nome acima de 18 anos");
		}
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
