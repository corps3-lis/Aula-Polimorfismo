package AulaJava;

public class Aplicacao {

	public static void main(String[] args) {
		
		System.out.println("Primeira aula utilizando a IDE Eclipse com linguagem Java");
		
		//Teste conceitos 
		
		Pessoa kaue = new Pessoa ("Nome atual: Kaue");
			kaue.setIdade(17);
			kaue.setNome("Alteração do nome bem sucedidade: kaue2");
			System.out.println(kaue.getNome());
			
		Pessoa bruna = new Pessoa ("Nome atual: Bruna");
			bruna.setIdade(19);
			bruna.setNome("Alteração do nome bem sucedidade: Bruna2");
			System.out.println(bruna.getNome());
			
		Pessoa maya = new Pessoa ("Nome atual: Maya");
			maya.setIdade(21);
			maya.setNome("Alteração do nome bem sucedidade: Maya2");
			System.out.println(maya.getNome());
	}

}
