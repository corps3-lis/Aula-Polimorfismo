package Corrida;

public class Pista {
	
	  String nome;
	    int comprimento; 

	    public Pista(String nome, int comprimento) {
	        this.nome = nome;
	        this.comprimento = comprimento;
	    }

	    public String toString() {
	        return "Pista: " + nome + ", Comprimento: " + comprimento + " metros";
	        
	    }

}
