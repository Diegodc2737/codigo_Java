package conversoes_implicitas;

import javax.swing.JOptionPane;

public class testeConversaoImpicita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConversaoImplicita c1 = new ConversaoImplicita();
		
		
		JOptionPane.showMessageDialog(null, "Quadrado de 3= "+ c1.retornaQuadrado(3));
		JOptionPane.showMessageDialog(null, "Quadrado de 3= "+ c1.retornaQuadrado('3'));

	}

}
