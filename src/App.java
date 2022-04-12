class App {

	public static void main(String[] args) {

		System.out.println("Olá mundo!");

		int dividendo = 18;
		int divisor = 5;

		int resto = Matematica.resto(dividendo, divisor);
		// print:

		// System.out.println(resto); // Deve imprimir: 1
		// assertiva: feito
		// System.out.println(resto == 1); // Deve imprimir: true
		// mais assertivas: (devem imprimir true) = feito

		// System.out.println(resto == 2); // Deve imprimir: true
		// mais assertivas: (devem imprimir true) = feito
		// System.out.println(Matematica.resto(10, 4) == 2); feito

		// System.out.println(resto == 4); // Deve imprimir: true
		// System.out.println(Matematica.resto(29, 5) == 4); feito

		// System.out.println(resto);
		// System.out.println(resto == 0);
		// 50 / 10 = 0 = resto = 0 true - feito

		// System.out.println(resto);
		// System.out.println(resto == 1);
		// 91 / 3 = 20 = resto = true = feito

		System.out.println(resto);
		System.out.println(resto == 3);
		// feito 18 / 5 = 5 resto = 3 true = feito
		// adicione mais 3 casos de teste na forma de prints e assertivas = feito
		// =======================================================================

		String umaString = "TADS"; // length = 4
		// 0123 4 IndexOutOfBoundsException
		// i
		int largura = 10;
		char umCaractere = '!'; // 6

		String resultado = Texto.pad(umaString, largura, umCaractere);
		System.out.println(resultado); // deve imprimir TADS//////

		System.out.println("==========assertivas=============");// assertivas
		System.out.println(resultado.length() == 10);// tem que imprimir true
		System.out.println(resultado.equals("TADS!!!!!!"));// imprime true
		// estava dando false, porque coloquei o tads em minusculo
		System.out.println(Texto.pad("oi", 5, '*').equals("oi***"));// true
		// Texto.pad(umaString, largura, umCaractere);

		// System.out.println(Texto.pad("logica", 5, "*").equals("logica"));

		System.out.println(Texto.pad("logica", 6, '*').length() == 6);

		System.out.println(Texto.pad("", 8, '#'));

		System.out.println(Texto.pad("", 8, '#').equals("########"));//true

	}
}
