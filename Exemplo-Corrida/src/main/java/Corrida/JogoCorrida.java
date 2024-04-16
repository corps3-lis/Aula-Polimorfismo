package Corrida;

public class JogoCorrida {
	
	public static void main(String[] args) {
        
        Pista pista = new Pista("Pista 1", 1000);

        System.out.println(pista);

        Veiculo carro = new Carro();
        Veiculo moto = new Moto();

        System.out.println("Iniciando corrida...");

        carro.acelerar();
        carro.buzinar();
        moto.acelerar();
        moto.buzinar();

        System.out.println("Corrida finalizada!");
        
    }

}
