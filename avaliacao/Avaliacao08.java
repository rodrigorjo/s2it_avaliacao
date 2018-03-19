package avaliacao;

public class Avaliacao08 {
	public static void main(String[] args) {
		Avaliacao08 avaliacao = new Avaliacao08();
		System.out.println(avaliacao.concatena(85, 231));
	}
	
	public Integer concatena(Integer x, Integer y){
		String a = String.valueOf(x);
		String b = String.valueOf(y);
		Integer maxlength = retornaMaiorLength(a, b);
		int i = 0;
		StringBuffer resultado = new StringBuffer();
		while (i < maxlength){
			if(i < a.length()){
				resultado.append(a.substring(i, i+1));
			}
			if(i < b.length()){
				resultado.append(b.substring(i, i+1));
			}
			i++;
		}
		Integer c = Integer.parseInt(resultado.toString());
		if(isBiggerThenOneMillion(c)){
			return -1;
		}
		return c;
	}

	public Integer retornaMaiorLength(String a, String b) {
		Integer maxlength = a.length() > b.length() ? a.length() : b.length();
		return maxlength;
	}
	
	public boolean isBiggerThenOneMillion(Integer number){
		return number > 1000000;
	}
}
