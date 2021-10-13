import java.util.Scanner;
public class Poligono {

	public static void main(String[] args) {
	
	Scanner leitura = new Scanner(System.in);
	System.out.println("Digite o numero de lados: ");
	int lados = leitura.nextInt();
	if(lados == 3) {
		System.out.println("Não é um poligno");
	} else if(lados == 5){
		System.out.println("Poligno não identificado");
		
	}else if(lados <= 0) {	
		System.out.println("valor invalido");
	}else {
		System.out.println("um poligno qualquer");
	}
	
	}

}
