import java.util.ArrayList;

public class Pessoa {
	private ArrayList<Sintoma> sintomas = new ArrayList<>();

	public ArrayList<Sintoma> getSintomas() {
		return sintomas;
	}

	public void setSintomas(ArrayList<Sintoma> sintomas) {
		this.sintomas = sintomas;
	}
	@Override
	public String toString() {
		for (Sintoma sintoma : sintomas) {
			System.out.println(sintoma.getPossui());
			System.out.println(sintoma.getGrau());
		}
		return super.toString();
	}
	
}
