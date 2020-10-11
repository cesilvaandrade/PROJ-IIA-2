import java.util.ArrayList;
import java.util.Scanner;

public class Construtor {
	Scanner scan = new Scanner(System.in);
	@SuppressWarnings("resource")
	public static int lerSintoma() {
		return new Scanner(System.in).nextInt();
	}
	public static int lerSintoma(String msg) {
		System.out.println(msg);
		return lerSintoma();
	}
	public static int lerSintoma(String msg, String msgError, int min, int max) {
		int value;
		do {
			value = lerSintoma(msg);
			if(value < min || value > max) {
				System.out.println(msgError);
			}
		} while ((value < min || value > max));
		return value;
	}
	// MÉTODO DESTINADO A LER O SINTOMA E O GRAU
	public ArrayList<Sintoma> lerSintoma(ArrayList<Sintoma> sintomas ,int i){
		Sintoma sintoma = new Sintoma();
		switch (i) {
		case 0:
			sintoma.setPossui(lerSintoma("O individuo possui febre ? digite 1 para sim , 0 para não: ", "Erro digito inválido , tente novamete", 0, 1));
			if(sintoma.getPossui() == 1) {
				sintoma.setGrau(lerSintoma("Para febre acima de 38ºC por 4 a 7 dias digite 3 , Sem febre ou subfebril 38ºC digite 2 , Febre alta > 38ºC digite 3:  ","Erro digito inválido , tente novamente",1,3));
			}
			break;
		case 1:
			sintoma.setPossui(lerSintoma("O individuo possui manchas na pele ? digite 1 para sim , 0 para não: ", "Erro digito inválido , tente novamete", 0, 1));
			if(sintoma.getPossui() == 1) {
				sintoma.setGrau(lerSintoma("Se surgiu a partir dos 4 dias do primeiro sintom digite 1 ,se surgiu no primeiro ou segundo 2 , se surgiu do dia 2 a 5 digite 3: ","Erro digito inválido , tente novamente",1,3));
			}
			break;
		case 2:
			sintoma.setPossui(lerSintoma("O individuo possui dor nos músculos? digite 1 para sim , 0 para não: ", "Erro digito inválido , tente novamete", 0, 1));
			if(sintoma.getPossui() == 1) {
				sintoma.setGrau(lerSintoma("Para dor frequente digite 1 , fraquencia moderada 2 , pouco frequente 3	: ","Erro digito inválido , tente novamente",1,3));
			}
			break;
		case 3:
			sintoma.setPossui(lerSintoma("O individuo possui dor na articulação? digite 1 para sim , 0 para não: ", "Erro digito inválido , tente novamete", 0, 1));
			if(sintoma.getPossui() == 1) {
				sintoma.setGrau(lerSintoma("Para dor pouco frequente digite 1 , frequencia moderada 2 , bastante frequente 3	: ","Erro digito inválido , tente novamente",1,3));
			}
			break;
		case 4:
			if(sintoma.getGrau() != 0) {
				sintoma.setGrau(lerSintoma("A intensidade da dor leve digite 1 , intensidade leve/moderada digite 2  , intensidade moderada/intensa 3	: ","Erro digito inválido , tente novamente",1,3));
			}
			break;
		case 5:
			sintoma.setPossui(lerSintoma("O individuo possui Edema articular ? digite 1 para sim , 2 para não: ", "Erro digito inválido , tente novamete", 0, 1));
			if(sintoma.getPossui() == 1) {
				sintoma.setGrau(lerSintoma("Para edema frequente e leve digite 1 , frequente e intenso 2 : ","Erro digito inválido , tente novamente",1,2));
			}
			break;
		case 6:
			sintoma.setPossui(lerSintoma("O individuo possui conjutivite? digite 1 para sim , 0 para não: ", "Erro digito inválido , tente novamete", 0, 1));
			
			break;
		case 7:
			sintoma.setPossui(lerSintoma("O individuo possui Dor de cabeça ? digite 1 para sim , 0 para não: ", "Erro digito inválido , tente novamete", 0, 1));
			if(sintoma.getPossui() == 1) {
				sintoma.setGrau(lerSintoma("Dor frequente e intensa digite 1 , moderada digite 2 , ","Erro digito inválido , tente novamente",1,2));
			}
			break;
		case 8:
			sintoma.setPossui(lerSintoma("O individuo possui coceira? digite 1 para sim , 0 para não: ", "Erro digito inválido , tente novamete", 0, 1));
			if(sintoma.getPossui() == 1) {
				sintoma.setGrau(lerSintoma("Para coceira leve frequente digite 1 , moderada 2 : ","Erro digito inválido , tente novamente",1,2));
			}
			break;
		case 9:
			sintoma.setPossui(lerSintoma("O individuo possui Hipertrofia ganglionar ? digite 1 para sim , 0 para não: ", "Erro digito inválido , tente novamete", 0, 1));
			if(sintoma.getPossui() == 1) {
				sintoma.setGrau(lerSintoma(" Possui leve frequencia  1 , frequencia intensa 2 , frequencia moderada 3	: ","Erro digito inválido , tente novamente",1,3));
			}
			break;
		case 10:
			sintoma.setPossui(lerSintoma("O individuo possui Discrasia hemorrágica ? digite 1 para sim , 0 para não: ", "Erro digito inválido , tente novamete", 0, 1));
			if(sintoma.getPossui() == 1) {
				sintoma.setGrau(lerSintoma("Para frequencia moderada 1 , frequencia leve 2	: ","Erro digito inválido , tente novamente",1,2));
			}
			break;
		case 11:
			sintoma.setPossui(lerSintoma("O individuo possui acometimento neurológico? digite 1 para sim , 0 para não: ", "Erro digito inválido , tente novamete", 0, 1));
			if(sintoma.getPossui() == 1) {
				sintoma.setGrau(lerSintoma("O individuo	é neonato ? se sim digite 1 , se nao 0: ","Erro digito inválido , tente novamente",0,1));
			}
			break;
		default:
			
			break;
			
		}
		sintomas.add(sintoma);
		return sintomas;
		
	}
	public Pessoa lerSintoma(Pessoa pessoa) {
		for (int i = 0; i < 12; i++) {
			pessoa.setSintomas(lerSintoma(pessoa.getSintomas(),i));
		}
		return pessoa;
	}
	// MÉTODO DESTINADO A CONSTRUIR P(Ei|Hi) a partir do grau dos sintomas por exemplo: P(FEBREalta|Dengue) = 0.9
	public ArrayList<Sintoma> constroiEvidenciaSintomas(ArrayList<Sintoma> sintomas){
		for (int i = 0; i < 12; i++) {
			if(sintomas.get(i).getPossui() == 1) {
				switch (i) {
					// EVIDENCIA DE FEBRE DADO AS 3 HIPOTESES
					case 0:
						//EVIDENCIA DE FEBRE ALTA DE 4 A 7 DIAS
						if(sintomas.get(i).getGrau() == 1) {
							sintomas.get(i).setGrauDengue(0.9);
							sintomas.get(i).setGrauZika(0.1);
							sintomas.get(i).setGrauChicungunya(0.3);
						}
						// EVIDENCIA DE SUBFEBRIL
						else if (sintomas.get(i).getGrau() == 2) {
							sintomas.get(i).setGrauDengue(0.1);
							sintomas.get(i).setGrauZika(0.9);
							sintomas.get(i).setGrauChicungunya(0.1);
						}
						//EVIDENCIA DE FEBRE ALTA DE 2 A 3 DIAS
						else {
							sintomas.get(i).setGrauDengue(0.3);
							sintomas.get(i).setGrauZika(0.1);
							sintomas.get(i).setGrauChicungunya(0.9);
						}
						break;
					case 1:
						// MANCHA A PARTIR DOR 4º DIA
						if(sintomas.get(i).getGrau() == 1) {
							sintomas.get(i).setGrauDengue(0.5);
							sintomas.get(i).setGrauZika(0.1);
							sintomas.get(i).setGrauChicungunya(0.1);
						}
						// SURGE A PARTIR DO QUARTO DIA
						else if (sintomas.get(i).getGrau() == 2) {
							sintomas.get(i).setGrauDengue(0.1);
							sintomas.get(i).setGrauZika(0.95);
							sintomas.get(i).setGrauChicungunya(0.1);
						}
						//EVIDENCIA DE FEBRE ALTA DE 2 A 3 DIAS
						else {
							sintomas.get(i).setGrauDengue(0.4);
							sintomas.get(i).setGrauZika(0.1);
							sintomas.get(i).setGrauChicungunya(0.5);
						}
						break;
					case 2:
						//DOR NOS MUSCULOS FRENQUENCIA 3/3
						if(sintomas.get(i).getGrau() == 1) {
							sintomas.get(i).setGrauDengue(0.6);
							sintomas.get(i).setGrauZika(0.4);
							sintomas.get(i).setGrauChicungunya(0.2);
						}
						// FREQUENCIA 2/3
						else if (sintomas.get(i).getGrau() == 2) {
							sintomas.get(i).setGrauDengue(0.4);
							sintomas.get(i).setGrauZika(0.6);
							sintomas.get(i).setGrauChicungunya(0.4);
						}
						// FREQUENCIA 1/3
						else {
							sintomas.get(i).setGrauDengue(0.2);
							sintomas.get(i).setGrauZika(0.4);
							sintomas.get(i).setGrauChicungunya(0.6);
						}
						break;
					case 3:
						//DOR NA ARTICULAÇÃO FREQUENCIA 1/3
						if(sintomas.get(i).getGrau() == 1) {
							sintomas.get(i).setGrauDengue(0.6);
							sintomas.get(i).setGrauZika(0.4);
							sintomas.get(i).setGrauChicungunya(0.2);
						}
						// DOR NA ARTICULAÇÃO FREQUENCIA 2/3
						else if (sintomas.get(i).getGrau() == 2) {
							sintomas.get(i).setGrauDengue(0.4);
							sintomas.get(i).setGrauZika(0.6);
							sintomas.get(i).setGrauChicungunya(0.4);
						}
						//	DOR NA ARTICULAÇÃO FREQUENCIA 3/3
						else {
							sintomas.get(i).setGrauDengue(0.2);
							sintomas.get(i).setGrauZika(0.4);
							sintomas.get(i).setGrauChicungunya(0.6);
						}		
								break;
					case 4:
						//INTENSIDADE DA DOR ARTICULAR LEVE
						if(sintomas.get(i).getGrau() == 1) {
							sintomas.get(i).setGrauDengue(0.6);
							sintomas.get(i).setGrauZika(0.4);
							sintomas.get(i).setGrauChicungunya(0.2);
						}
						//INTENSIDADE DA DOR ARTICULAR LEVE /MODERADA
						else if (sintomas.get(i).getGrau() == 2) {
							sintomas.get(i).setGrauDengue(0.4);
							sintomas.get(i).setGrauZika(0.6);
							sintomas.get(i).setGrauChicungunya(0.4);
						}
						//INTENSIDADE DA DOR ARTICULAR MODERA/INTENSA
						else {
							sintomas.get(i).setGrauDengue(0.2);
							sintomas.get(i).setGrauZika(0.4);
							sintomas.get(i).setGrauChicungunya(0.6);
						}
						break;
					case 5:
						// EDEMA DA ARTICULAÇÃO FRENQUENTE E LEVE
						if(sintomas.get(i).getGrau() == 1) {
							sintomas.get(i).setGrauDengue(0.05);
							sintomas.get(i).setGrauZika(0.5);
							sintomas.get(i).setGrauChicungunya(0.3);
						}
						// EDEMA DA ARTICULAÇÃO FRENQUENTE E MODERADO/INTENSO
						else if (sintomas.get(i).getGrau() == 2) {
							sintomas.get(i).setGrauDengue(0.01);
							sintomas.get(i).setGrauZika(0.3);
							sintomas.get(i).setGrauChicungunya(0.5);
						}
						break;
					case 6:
						//CONJUTIVITE SE HOUVER
						sintomas.get(i).setGrauDengue(0.01);
						sintomas.get(i).setGrauZika(0.5);
						sintomas.get(i).setGrauChicungunya(0.3);
						break;
					case 7:
						//DOR DE CABEÇA INTENSA
						if(sintomas.get(i).getGrau() == 1) {
							sintomas.get(i).setGrauDengue(0.5);
							sintomas.get(i).setGrauZika(0.4);
							sintomas.get(i).setGrauChicungunya(0.4);
						}
						// DOR DE CABEÇA MODERADA
						else if (sintomas.get(i).getGrau() == 2) {
							sintomas.get(i).setGrauDengue(0.4);
							sintomas.get(i).setGrauZika(0.5);
							sintomas.get(i).setGrauChicungunya(0.5);
						}
						// DOR DE CABEÇA MODERADA
						else {
							sintomas.get(i).setGrauDengue(0.4);
							sintomas.get(i).setGrauZika(0.5);
							sintomas.get(i).setGrauChicungunya(0.5);
						}
						break;
					case 8:
						//COCEIRA LEVE
						if(sintomas.get(i).getGrau() == 1) {
							sintomas.get(i).setGrauDengue(0.6);
							sintomas.get(i).setGrauZika(0.3);
							sintomas.get(i).setGrauChicungunya(0.6);
						}
						// COCEIRA MODERADA
						else if (sintomas.get(i).getGrau() == 2) {
							sintomas.get(i).setGrauDengue(0.3);
							sintomas.get(i).setGrauZika(0.6);
							sintomas.get(i).setGrauChicungunya(0.3);
						}
						break;
					case 9:
						//HIPERTOFRIA GANGLIONAR LEVE
						if(sintomas.get(i).getGrau() == 1) {
							sintomas.get(i).setGrauDengue(0.6);
							sintomas.get(i).setGrauZika(0.2);
							sintomas.get(i).setGrauChicungunya(0.4);
						}
						//HIPERTOFRIA GANGLIONAR INTENSA
						else if (sintomas.get(i).getGrau() == 2) {
							sintomas.get(i).setGrauDengue(0.2);
							sintomas.get(i).setGrauZika(0.6);
							sintomas.get(i).setGrauChicungunya(0.4);
						}
						//HIPERTOFRIA GANGLIONAR MODERADA
						else {
							sintomas.get(i).setGrauDengue(0.4);
							sintomas.get(i).setGrauZika(0.4);
							sintomas.get(i).setGrauChicungunya(0.6);
						}
						break;
					case 10:
						//DISCRASIA HEMORRÁGICA MODERADA
						if(sintomas.get(i).getGrau() == 1) {
							sintomas.get(i).setGrauDengue(0.5);
							sintomas.get(i).setGrauZika(0.0);
							sintomas.get(i).setGrauChicungunya(0.2);
						}
						// EVIDENCIA LEVE
						else if (sintomas.get(i).getGrau() == 2) {
							sintomas.get(i).setGrauDengue(0.2);
							sintomas.get(i).setGrauZika(0);
							sintomas.get(i).setGrauChicungunya(0.5);
						}
						break;
	
					case 11:
						if(sintomas.get(i).getGrau() == 1) {
							sintomas.get(i).setGrauDengue(0.001);
							sintomas.get(i).setGrauZika(0.01);
							sintomas.get(i).setGrauChicungunya(0.01);
						}
						else {
							sintomas.get(i).setGrauDengue(0.001);
							sintomas.get(i).setGrauZika(0.01);
							sintomas.get(i).setGrauChicungunya(0.001);
						}
						break;
					default:
						break;
				}
			}
		}
		return sintomas;
	}

}
