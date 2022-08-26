package exemplo_sobrecarga;

import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {
		
		double n1, n2, n3, maior;
		
		
		//Tetsando a primeira função
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
				
		ExempoSobrecarga e1 = new ExempoSobrecarga();
		maior = e1.calcularNumeroMaior(n1, n2);
		JOptionPane.showMessageDialog(null, "O maior numero: "+ maior);
		
		// Testando a segunda função
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro numero: "));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo numero: "));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe o terceiro numero: "));
		
		maior = e1.calcularNumeroMaior(n1, n2, n3);
		JOptionPane.showMessageDialog(null, "Numero maior: "+maior);
	}

}
