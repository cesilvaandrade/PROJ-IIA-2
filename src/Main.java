

public class Main {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		Construtor construtor = new Construtor();
		Regras regras = new Regras();
		pessoa = construtor.lerSintoma(pessoa);
		construtor.constroiEvidenciaSintomas(pessoa.getSintomas());
		regras.calcula(pessoa.getSintomas());
	}
}
