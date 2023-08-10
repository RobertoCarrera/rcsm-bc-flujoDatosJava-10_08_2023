import java.util.Scanner;
public class divisibleApp {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce un número: ");
		int num = teclado.nextInt();
		
		if(num%2 == 0)
		{
			System.out.println(num+" es divisible entre 2");
		}else
		{
			System.out.println(num+" no es divisible entre 2");
		}
	}

}