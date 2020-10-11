
public class Sintoma{
	private int grau;	// GRAU DO SINTOMA CASO A PESSOA POSSUA
	private int possui;
	private double grauDengue ;  // PROBABILIDADE DA EVIDENCIA DADO A HIPÓTESE EXEMPLO: P(FEBRE|DENGUE)
	private double grauZika ;	// PROBABILIDADE DA EVIDENCIA DADO A HIPÓTESE EXEMPLO: P(FEBRE|ZIKA)
	private double grauChicungunya ;	// PROBABILIDADE DA EVIDENCIA DADO A HIPÓTESE EXEMPLO: P(FEBRE|CHICUNGUNYA)
	public Sintoma() {
		this.grau = 0;
		this.possui = 0;
		this.grauDengue = 0.0;
		this.grauZika = 0.0;
		this.grauChicungunya = 0.0;
	}
	public double getGrauDengue() {
		return grauDengue;
	}
	public void setGrauDengue(double grauDengue) {
		this.grauDengue = grauDengue;
	}
	public double getGrauZika() {
		return grauZika;
	}
	public void setGrauZika(double grauZika) {
		this.grauZika = grauZika;
	}
	public double getGrauChicungunya() {
		return grauChicungunya;
	}
	public void setGrauChicungunya(double grauChicungunya) {
		this.grauChicungunya = grauChicungunya;
	}
	public int getGrau() {
		return grau;
	}
	public void setGrau(int grau) {
		this.grau = grau;
	}
	public int getPossui() {
		return possui;
	}
	public void setPossui(int possui) {
		this.possui = possui;
	}
}
