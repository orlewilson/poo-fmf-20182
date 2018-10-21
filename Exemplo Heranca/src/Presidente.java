/*	Programa��o Orientada a Objeto
 * 	Prof. Orlewilson B. Maia
 * 	Autor (a): 	Orlewilson Bentes Maia
 *	Data:		19/10/2018 
 *	Descri��o:	Exemplo de classe para representar presidente
 * 
 */

// TODO (para casa)
// - Colocar heran�a nesta classe e fazer os ajustes necess�rios;
// - Adicionar os atributos caracter�sticos desta classe e garantir 
// o encapsulamento;
// -Adicionar o construtor sem argumentos.
public class Presidente {

	// atributos
	private int numero;
	private String partido;
	private String proposta;
	private String vice;
	private String nome;

	// construtor sem argumento
	public Presidente() {
		this.numero = 0;
		this.partido = "";
		this.proposta = "";
		this.vice = "";
		this.nome = "";
	}

	// m�todos gets e sets dos atributos
	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPartido() {
		return this.partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public String getProposta() {
		return this.proposta;
	}

	public void setProposta(String proposta) {
		this.proposta = proposta;
	}

	public String getVice() {
		return this.vice;
	}

	public void setVice(String vice) {
		this.vice = vice;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// outros m�todos
	public void oQueFaz() {
		System.out.println(
				"O Presidente da Rep�blica tamb�m tem o direito "
				+ "de rejeitar ou sancionar mat�rias e ainda, "
				+ "decretar interven��o federal nos Estados, o "
				+ "estado de defesa e o estado de s�tio; manter "
				+ "rela��es com Estados estrangeiros e credenciar "
				+ "seus representantes diplom�ticos; celebrar "
				+ "tratados, conven��es e atos internacionais, "
				+ "sujeitos a referendo do Congresso Nacional. "
				+ "Compete ao cargo a concess�o de indulto e a "
				+ "comuta��o de penas, ou seja, substituir uma "
				+ "pena mais grave, imposta ao r�u, por outra "
				+ "mais branda.");
	}
}
