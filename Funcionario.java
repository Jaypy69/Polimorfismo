package Polimorfismo;

public class Funcionario {
	private int id;
	private String nome;
	private String telefone;
	private int matrícula;
	private String endereco;
	
	public Funcionario(int id, String nome, String telefone, int matrícula, String endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.matrícula = matrícula;
		this.endereco = endereco;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getMatrícula() {
		return matrícula;
	}
	public void setMatrícula(int matrícula) {
		this.matrícula = matrícula;
	}
	public String getEndereco() {
		return endereco;
	}
 void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double calcularSalario(double salarioBruto, double desconto) {
		return salarioBruto - desconto;
	}
}
