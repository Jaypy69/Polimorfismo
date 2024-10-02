package Polimorfismo;

public class Consultor extends Funcionario {
	public Consultor(int id, String nome, String telefone, int matrícula, String endereco) {
		super(id, nome, telefone, matrícula, endereco);
	}
	public double calcularSalario(double valorTotal, double Imposto) {
		return valorTotal - Imposto;
	}
}
