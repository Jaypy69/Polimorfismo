package Polimorfismo;

public class PrincipalFunc {

	public static void main(String[] args) {
	Funcionario fun = new Funcionario(1, "Carlinhos", "15-1111-1111", 123, "Rua dos Cavalos");
	System.out.println(fun.getNome());
	System.out.println(fun.calcularSalario(10000.00, 1000));
	
	Horista hor = new Horista(2, "Dalva","15-6969-6969", 321, "Rua do Mato");
	System.out.println(hor.getNome());
	System.out.println(hor.calcularSalario(100, 200));
    
	Jornada jor = new Jornada(3, "Jordan", "15-7575-7575", 213, "Rua do Mewing");
	System.out.println(jor.getNome());
	System.out.println(jor.calcularSalario(150, 220));
	
	Consultor con = new Consultor(4, "Chico", "15-5757-5757", 312, "Rua do Looksmaxxing");
	System.out.println(con.getNome());
	System.out.println(con.calcularSalario(40.000, 5000));
	
	}
}
