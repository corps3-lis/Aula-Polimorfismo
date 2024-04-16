package Corrida;

abstract class Veiculo {
    String tipo;

    public Veiculo(String tipo) {
        this.tipo = tipo;
    }

    public abstract void acelerar();

    public abstract void frear();

    public abstract void buzinar();

    public String toString() {
        return tipo;
        
    }
}