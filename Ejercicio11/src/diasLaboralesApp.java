import javax.swing.JOptionPane;
public class diasLaboralesApp {

	public static void main(String[] args) {

		String dia = "";
		//Booleano que controlará el no salir hasta que se introduce un día válido
		boolean correcto = false;
		
		do {

			dia = JOptionPane.showInputDialog("Dime un día de la semana válido (lunes, martes, miercoles, jueves, viernes, sabado, domingo): ");
			//El texto que introduzca el usuario, lo paso a minúsculas para tener un mínimo de filtro que 
			//compruebe y facilite la introducción de datos
			dia.toLowerCase();
			
			switch(dia) {
			
			case "lunes":
				JOptionPane.showMessageDialog(null, "Lunes es laborable");
				correcto = true;
				break;
			case "martes":
				JOptionPane.showMessageDialog(null, "Martes es laborable");
				correcto = true;
				break;
			case "miercoles":
				JOptionPane.showMessageDialog(null, "Miércoles es laborable");
				correcto = true;
				break;
			case "jueves":
				JOptionPane.showMessageDialog(null, "Jueves es laborable");
				correcto = true;
				break;
			case "viernes":
				JOptionPane.showMessageDialog(null, "Viernes es laborable");
				correcto = true;
				break;
			case "sabado":
				JOptionPane.showMessageDialog(null, "Sábado no es laborable");
				correcto = true;
				break;
			case "domingo":
				JOptionPane.showMessageDialog(null, "Domingo no es laborable");
				correcto = true;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Introduce un día válido");
				break;
			}
		}while(correcto = false);
	}
}