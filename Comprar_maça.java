import java.util.Scanner;
public class Comprar_ma�a {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a quantidade de ma�as que deseja comprar: ");
		int quantidadeMaca = entrada.nextInt();
		if(quantidadeMaca <= 12) {
			double precoMaca = 0.30;
			double precoTotal = precoMaca*quantidadeMaca;
			System.out.println("O pre�o total da compra � de: " + precoTotal + " Reais");
			
		}else {
			double precoMaca = 0.25;
			double precoTotal = precoMaca*quantidadeMaca;
			System.out.println("O pre�o total da compra � de: " + precoTotal + " Reais");
		}
		
	}

}
