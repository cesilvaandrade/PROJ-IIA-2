import java.util.ArrayList;

public class Regras {
	public void calcula(ArrayList<Sintoma> sintomas) {
		double dengue = 0 , zika = 0, chicungunya = 0 , mul = 1, div = 0;
		for (int i = 0; i < 3; i++) {
			if(i == 0) {
				mul = 1;
				for (int j = 0; j < 12; j++) {
					if(sintomas.get(j).getPossui() == 1) {
						System.out.println(sintomas.get(j).getGrauDengue());
						mul = mul * sintomas.get(j).getGrauDengue();
						System.out.println("mul: "+mul);
					}
				}
				dengue = mul;
			}
			else if(i == 1) {
				mul = 1;
				for (int j = 0; j < 12; j++) {
					if(sintomas.get(j).getPossui() == 1) {
						System.out.println(sintomas.get(j).getGrauZika());
						mul = mul * sintomas.get(j).getGrauZika();
						System.out.println("mul2: "+mul);
					}
				}
				zika = mul;
			}
			else {
				mul = 1;
				for (int j = 0; j < 12; j++) {
					if(sintomas.get(j).getPossui() == 1) {
						System.out.println(sintomas.get(j).getGrauChicungunya());
						mul = mul * sintomas.get(j).getGrauChicungunya();
						System.out.println("mul3 : "+mul);
					}
				}
				
				chicungunya = mul;
			}
		}
		div = dengue + zika + chicungunya;
		System.out.println(div);
		dengue = dengue / div;
		zika = zika / div;
		chicungunya = chicungunya / div;
		System.out.println("dengue: "+dengue);
		System.out.println("zika: "+zika);
		System.out.println("chic: "+chicungunya);
	}
}
