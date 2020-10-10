import java.util.ArrayList;
import java.util.Scanner;

public class Leitor {
	Scanner scan = new Scanner(System.in);
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
	public ArrayList<Sintoma> lerSintoma(ArrayList<Sintoma> sintomas){
		Sintoma sintoma = new Sintoma();
		int possui = lerSintoma("O individuo possui Febre? Se sim digite 1 , caso contrário 0","erro digito inválido",0,1);
		if(possui == 1) {
			sintoma.setPossui(possui);
			sintoma.setGrau(lerSintoma("Para febre acima de 30ºC de 4 a 7 dias digite 1 , Sem febre ou subfebril(38ºc) por 1 ou 2 dias digite 2 , Febre alta de 2 a 3 dias digite 3", "Erro entrada inválida", 1, 3));
			sintomas.add(sintoma);
		}
		
		sintomas.add(sintoma);
		return sintomas;
		
	}

}
