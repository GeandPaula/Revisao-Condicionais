import java.util.Scanner;
public class Comprar_maça {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a quantidade de maças que deseja comprar: ");
		int quantidadeMaca = entrada.nextInt();
		if(quantidadeMaca <= 12) {
			double precoMaca = 0.30;
			double precoTotal = precoMaca*quantidadeMaca;
			System.out.println("O preço total da compra é de: " + precoTotal + " Reais");
			
		}else {
			double precoMaca = 0.25;
			double precoTotal = precoMaca*quantidadeMaca;
			System.out.println("O preço total da compra é de: " + precoTotal + " Reais");
		}
		
	}

}
