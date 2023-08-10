//Importamos la librería necesaria para utilizar los prompt
import javax.swing.JOptionPane;
public class saludoMejoradoApp {

	public static void main(String[] args) {

		//De esta manera sale el prompt para pedirnos introducirle el valor a la variable nombre
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");
		//Y de esta mostramos el mensaje que queremos + el nombre introducido anteriormente
		JOptionPane.showMessageDialog(null, "Bienvenido "+nombre);

	}

}