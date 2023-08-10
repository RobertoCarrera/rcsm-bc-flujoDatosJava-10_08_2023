import javax.swing.JOptionPane;
public class calcularAreaCicruloApp {

	public static void main(String[] args) {

		double PI = 3.141592653589;
		
		String radio = JOptionPane.showInputDialog("Introduce el radio del círculo: ");
		double radioDouble = Double.parseDouble(radio);

		System.out.println("El area del círculo es = "+PI*(Math.pow(radioDouble, 2)));
	}

}