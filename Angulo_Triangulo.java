import java.util.Scanner;

public class Angulo_Triangulo {

	public static void main(String[] args) {
		
		double i = 0;
		while(i != 180) {
		
		Scanner texto = new Scanner(System.in);
		System.out.println("Entre com o valor do primeiro angulo: ");
		double primeiroAngulo = texto.nextDouble();
		while(primeiroAngulo <= 0 || primeiroAngulo > 180) {
			System.out.println("Valor invalido, Digite o primeiro angulo novamente: ");
			primeiroAngulo = texto.nextDouble();
		}
		System.out.println("Digite o segundo angulo: ");
		double segundoAngulo = texto.nextDouble();
		while(segundoAngulo <= 0 || segundoAngulo > 180) {
			System.out.println("Valor invalido, Digite o segundo angulo novamente: ");
			segundoAngulo = texto.nextDouble();
		}
		System.out.println("Digite o terceiro angulo:");
		double terceiroAngulo = texto.nextDouble();
		while(terceiroAngulo <= 0 || terceiroAngulo > 180) {
			System.out.println("Valor invalido, Digite o terceiro angulo novamente: ");
			terceiroAngulo = texto.nextDouble();
		}
		
		double somaAngulo = primeiroAngulo + segundoAngulo + terceiroAngulo;
		i = somaAngulo;
		
		if(primeiroAngulo == 90 ||segundoAngulo == 90 || terceiroAngulo == 90 && somaAngulo == 180) {
			System.out.println("O Triangulo é Retângulo");
		}
		if(primeiroAngulo > 90 ||segundoAngulo > 90 || terceiroAngulo > 90 && somaAngulo == 180) {
			System.out.println("O triangulo é Obtuso");
		}
		if(primeiroAngulo < 90 && segundoAngulo < 90 && terceiroAngulo < 90 && somaAngulo == 180) {
			System.out.println("O Triangulo é AcutÂngulo");
		}
		}
		

		
	}

}
