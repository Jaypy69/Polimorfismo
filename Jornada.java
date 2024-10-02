package Polimorfismo;

public class Jornada extends Funcionario{
	public Jornada(int id, String nome, String telefone, int matrícula, String endereco) {
		super(id, nome, telefone, matrícula, endereco);
	}
	public double calcularSalario(double salarioHora, double horaTrabalhada) {
		return salarioHora * horaTrabalhada;
}
}