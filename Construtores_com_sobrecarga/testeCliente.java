package Construtores_com_sobrecarga;

import javax.swing.JOptionPane;

public class testeCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//criamos aqui os atributos a serem lidos 
		 //referente ao cliente 1 e cliente 2
		int codigo;
		String nome;
		String cpf;
		String endereco;
		
		//aqui leremos os valore dos atributos do primeiro cliente
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do primeiro cliente: "));
		nome = JOptionPane.showInputDialog("Informe o nome do primeiro cliente: ");
		cpf = JOptionPane.showInputDialog("Informe o cpf do primeiro cliente: ");
		endereco = JOptionPane.showInputDialog("Informe o endereco do primeiro cliente: ");
		
		//criamos um objeto do tipo cliente e usamos um
		//construtor vazio, passamos os valores para 
		//os atributos depois dele instanciado 
		Cliente c1 = new Cliente();
		c1.codigo = codigo;
		c1.nome = nome;
		c1.cpf = cpf;
		c1.endereco = endereco;
		
		
		
		//aqui lemos os valores dos atributos pelo usuaio
		//referente ao segundo cliente
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o  codigo do segundo cliente: "));
		nome = JOptionPane.showInputDialog("Informe o nome do segundo cliente: ");
		cpf = JOptionPane.showInputDialog("Informe o cpf do degundo cliente: ");
		endereco = JOptionPane.showInputDialog("Informe o endereco do segundo cliente: ");
		
		//aqui então instanciamos o objeto passando para 
		//o construtor os valores dos atributos já neste
		//momento
		Cliente c2 = new Cliente(codigo, nome, cpf, endereco);
	}

}
