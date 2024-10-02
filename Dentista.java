package Polimorfismo;

public class Dentista extends ProfissionalSaude {
		private String cro;
	
		public Dentista (String cro, String nome, String especialidade, int valorConsulta) {
		super (nome, especialidade, valorConsulta);
		this.cro = cro;
		}
		public void agendarConsulta() {
		System.out.println("Agendado");
		}
	}

