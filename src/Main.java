import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Leitor leitor = new Leitor();
		Pessoa pessoa = new Pessoa();
		ArrayList<Sintoma> sintomas = new ArrayList<Sintoma>();
		pessoa.setSintomas(leitor.lerSintoma(sintomas));
		pessoa.toString();
	}
}
