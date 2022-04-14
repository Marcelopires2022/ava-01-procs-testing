
public class App{
	 public static void main(String[] args) {


		System.out.println("Olá mundo!");


		int dividendo = 5;
		int divisor = 2;

		int resto = Matematica.resto(dividendo, divisor);


		System.out.println(resto);// Deve imprimir : 1

		// assertiva:
		System.out.println(resto == 1); // Deve imprimir: true
		// mais assertivas: (devem imprimir true)
		System.out.println(Matematica.resto(10, 4) == 2);
		System.out.println(Matematica.resto(29, 5) == 4);
		// adicione mais 3 casos de teste na forma de prints e assertivas

		System.out.println(Matematica.resto(51, 10) == 1);
		System.out.println(Matematica.resto(91, 3) == 1);
		System.out.println(Matematica.resto(18, 5) == 3);
		

		String umaString = "tads"; // length = 4
		int largura = 10;
		char umCaractere = '!'; // 6

		String resultado = Texto.pad(umaString, largura, umCaractere);
		System.out.println(resultado);// tads!!!!!!


		//assertivas

		System.out.println(resultado.length() == 10);//true
		System.out.println(resultado.equals ("tads!!!!!!"));//true
		System.out.println(Texto.pad("oi", 5, '*').equals("oi***"));//true
		
		System.out.println(Texto.pad("logica", 5,'*').equals("logica"));//true

		System.out.println(Texto.pad("logica", 6, '*').length()== 6);//true
		System.out.println(Texto.pad("", 8, '#'));//########
		System.out.println(Texto.pad("",8,'#').equals("########"));//true


		
		  }
	}