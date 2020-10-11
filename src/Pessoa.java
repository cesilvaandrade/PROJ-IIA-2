import java.util.ArrayList;

public class Pessoa {
	private ArrayList<Sintoma> sintomas = new ArrayList<Sintoma>();

	public ArrayList<Sintoma> getSintomas() {
		return sintomas;
	}

	public void setSintomas(ArrayList<Sintoma> sintomas) {
		this.sintomas = sintomas;
	}
	public void imprimir() {
		for (int i = 0; i < 2; i++) {
			System.out.println(sintomas.get(i).getPossui());
			System.out.println(sintomas.get(i).getGrau());
			
		}
	}
	
}
