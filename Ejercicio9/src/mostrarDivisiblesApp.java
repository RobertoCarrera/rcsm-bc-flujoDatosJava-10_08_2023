public class mostrarDivisiblesApp {

	public static void main(String[] args) {
		
		int numero = 1;
		
		do{
			
			if((numero%2 == 0) && (numero%3 == 0))
			{
				System.out.print(numero+" | ");
			}
			numero++;
		}while(numero <= 100);
	}
}