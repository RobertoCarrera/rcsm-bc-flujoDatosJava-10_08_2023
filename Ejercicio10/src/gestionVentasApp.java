import javax.swing.JOptionPane;
public class gestionVentasApp {

	public static void main(String[] args) {

		String numero_ventas = JOptionPane.showInputDialog("¿Cuántas ventas vas a introducir?");
		int numero_ventasInt = Integer.parseInt(numero_ventas);
		String venta = "";
		double ventaDouble = 0;
		double total = 0;
		
		for(int i = 0;i<numero_ventasInt;i++)
		{
			
			venta = JOptionPane.showInputDialog("Cantidad de la venta "+(i+1)+":");
			ventaDouble = Double.parseDouble(venta);
			total += ventaDouble;
		}
		
		JOptionPane.showMessageDialog(null, "El total de tus ventas es = "+total+"€");
	}
}