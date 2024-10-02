package Polimorfismo;

public class Cao extends Animal {
	public Cao(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}
	public void emitirSom() {
		System.out.println("O cao está latindo");
	}
}
