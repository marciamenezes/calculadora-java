package calculadora;

import javax.swing.JOptionPane;

public class Calculadora {
	
	public static void main(String[] args) {

		int num1=0;
		int num2=0;
		int total;
		String aux;
		
		aux = JOptionPane.showInputDialog ("Digite um numero");
		num1 = Integer.parseInt(aux);
		
		aux = JOptionPane.showInputDialog("Digite outro numero");
		num2 = Integer.parseInt(aux);
		
		total = num1+num2;
		
		JOptionPane.showMessageDialog  (null,"A soma e: " + total);		

	}

}
