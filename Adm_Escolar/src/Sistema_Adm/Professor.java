package Sistema_Adm;

public class Professor extends Pessoa {
	
    String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    public String toString() {
        return "Professor - " + super.toString() + ", Disciplina: " + disciplina;
    }

}
