import java.util.Scanner;
public class calcularIvaApp {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		double IVA = 1.21;
		
		System.out.println("Introuce un precio: ");
		double precio = teclado.nextDouble();
		
		System.out.println("El precio de "+precio+"€ + IVA es = "+precio*IVA+"€");
	}

}