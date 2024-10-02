package Polimorfismo;

public class Principal {

	public static void main(String[] args) {
		Lobo lobo = new Lobo("JP", "M", "Negro");
		lobo.emitirSom();
		
		Leao leao = new Leao("Barou", "M", "Rei");
		leao.emitirSom();
		
		Tigre tigre = new Tigre("Sherikan", "M", "Caçador");
		tigre.emitirSom();
		
		Cao cao = new Cao("Samuel Oliveira", "M", "Manso");
		cao.emitirSom();
		
		Gato gato = new Gato("Chico Lachowsky", "M", "lindo");
		gato.emitirSom();
	}
}
