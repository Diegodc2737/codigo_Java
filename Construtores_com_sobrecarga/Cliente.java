/*
 * Um recurso muito utilizado é usar sobrecarga com o construtor da classe. Veja, sabemos 
que o construtor é o primeiro método a ser executado quando instanciamos um objeto.
*/

package Construtores_com_sobrecarga;

public class Cliente {
	
	//Aqui criaremos atributos normais de uma classe cliente
	int codigo;
	String nome;
	String cpf;
	String endereco;
	
	//Criaremos  aqui um um construtor vazio para a classe
	public Cliente() {
		
	}
	
	
	//Criaremos aqui outro construtor passando valores
	public Cliente(int codigo, String nome, String cpf, String endereco) {
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	

}
