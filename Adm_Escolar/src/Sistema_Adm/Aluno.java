package Sistema_Adm;

public class Aluno extends Pessoa {
	
	 String matricula;

	    public Aluno(String nome, int idade, String matricula) {
	        super(nome, idade);
	        this.matricula = matricula;
	    }

	    public String toString() {
	        return "Aluno - " + super.toString() + ", Matrícula: " + matricula;
	        
	    }
}
