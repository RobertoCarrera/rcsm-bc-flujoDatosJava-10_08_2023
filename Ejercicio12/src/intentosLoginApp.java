import javax.swing.JOptionPane;
public class intentosLoginApp {

	public static void main(String[] args) {

		String pass = "EWtg135Gf%";
		String intento = "";
		boolean correcto = false;
		int intentos = 0;
		
		do{
			
			intento = JOptionPane.showInputDialog("Introduce la contraseña: ");
			if(pass.compareTo(intento) == 0)
			{
				correcto = true;
				System.out.println("Enhorabuena");
			}else {
				
				intentos++;
				if(intentos == 3)
				{
					
					System.out.println("Demasiados errores. Cerrando programa");
				}else {

					System.out.println("Contraseña incorrecta. Faltan "+(3-intentos)+" intentos");
				}
			}
		}while((correcto == false)&&(intentos < 3));
	}
}