import java.util.Scanner;
public class Classifica��o_Triangulo {

	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	System.out.println("Insira a medida do primeiro lado: ");
	double primeiroLado = entrada.nextDouble();
	System.out.println("Insira o segundo lado: ");
	double segundoLado = entrada.nextDouble();
	System.out.println("Digite o terceiro lado: ");
	double terceiroLado = entrada.nextDouble();
	
	if(primeiroLado == segundoLado  && primeiroLado == terceiroLado) {
		System.out.println("Este triangulo � equil�tero");
	}else { 
		if(primeiroLado != segundoLado || primeiroLado != terceiroLado || segundoLado != terceiroLado) {
			if(primeiroLado == segundoLado || primeiroLado == terceiroLado || segundoLado == terceiroLado) {
				System.out.println("Esse triangulo � is�celes");
	}
		}
	}

	if(primeiroLado != segundoLado && primeiroLado != terceiroLado && terceiroLado != segundoLado) {
		System.out.println("O triangulo � Escaleno");
	}
	
	}

}
