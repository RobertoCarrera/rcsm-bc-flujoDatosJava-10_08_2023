import javax.swing.JOptionPane;
public class calculadoraInversaApp {

	public static void main(String[] args) {

		String op1, op2;
		String signo = "";
		
		double op1Double, op2Double;
		
		op1 = JOptionPane.showInputDialog("Introduce el primer número a operar: ");
		op2 = JOptionPane.showInputDialog("Introduce el segundo número a operar: ");
		signo = JOptionPane.showInputDialog("Ahora dame el signo que quieres utilizar: (+ - * / ^ %)");
		
		op1Double = Double.parseDouble(op1);
		op2Double = Double.parseDouble(op2);
		
		switch(signo) {
		
			case "+":
				System.out.println("El resultado es = "+(op1Double+op2Double));
				break;
			case "-":
				System.out.println("El resultado es = "+(op1Double-op2Double));
				break;
			case "*":
				System.out.println("El resultado es = "+(op1Double*op2Double));
				break;
			case "/":
				System.out.println("El resultado es = "+(op1Double/op2Double));
				break;
			case "^":
				System.out.println("El resultado es = "+Math.pow(op1Double,op2Double));
				break;
			case "%":
				System.out.println("El resultado es = "+(op1Double%op2Double));
				break;
			default:
				System.out.println("Algún dato introducido es incorrecto");	
		}
	}
}