class Texto {
	 public static String pad(String umaString, int largura, char umCaractere){
		String resultado = "";
		for (int i = 0; i < largura - umaString.length(); i++) {
			resultado += umCaractere; // n vezes o caractere
 		}
		return umaString + resultado;

		}
			
	}

