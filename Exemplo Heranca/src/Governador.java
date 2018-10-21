/*	Programa��o Orientada a Objeto
 * 	Prof. Orlewilson B. Maia
 * 	Autor (a): 	Orlewilson Bentes Maia
 *	Data:		19/10/2018 
 *	Descri��o:	Exemplo de classe para representar governador
 * 
 */

// TODO (para casa)
// - Colocar heran�a nesta classe e fazer os ajustes necess�rios;
// - Adicionar os atributos caracter�sticos desta classe e garantir 
// o encapsulamento;
// -Adicionar o construtor sem argumentos.

public class Governador extends Politico {

	// atributos
	private String vice;
	private String slogan;

	// construtor sem argumento
	public Governador() {
		// setNumero(0);
		// this.partido = "";
		// this.proposta = "";
		this.vice = "";
		// this.nome = "";
		this.slogan = "";
	}

	// m�todos gets e sets dos atributos

	public String getVice() {
		return this.vice;
	}

	public void setVice(String vice) {
		this.vice = vice;
	}

	public String getSlogan() {
		return this.slogan;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	// outros m�todos
	public void oQueFaz() {
		System.out.println(
				"Governador � o cargo pol�tico que representa o "
				+ "poder executivo na esfera dos Estados e do "
				+ "Distrito Federal. � fun��o do governador: a "
				+ "dire��o da administra��o estadual e a "
				+ "representa��o do Estado em suas rela��es "
				+ "jur�dicas, pol�ticas e administrativas, "
				+ "defendendo seus interesses junto � Presid�ncia "
				+ "e buscando investimentos.");
	}
}