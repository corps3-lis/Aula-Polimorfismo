package Sistema_Adm;

public class Teste {
	
	public class Main {
	    public static void main(String[] args) {
	      
	        Pessoa pessoa1 = new Pessoa("João", 30);
	        System.out.println(pessoa1);

	        Aluno aluno1 = new Aluno("Maria", 20, "2023001");
	        System.out.println(aluno1);

	        Professor professor1 = new Professor("Carlos", 40, "Matemática");
	        System.out.println(professor1);
	    }
	}

}
