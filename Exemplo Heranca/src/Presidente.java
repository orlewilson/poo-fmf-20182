/*	Programação Orientada a Objeto
 * 	Prof. Orlewilson B. Maia
 * 	Autor (a): 	Orlewilson Bentes Maia
 *	Data:		19/10/2018 
 *	Descrição:	Exemplo de classe para representar presidente
 * 
 */

// TODO (para casa)
// - Colocar herança nesta classe e fazer os ajustes necessários;
// - Adicionar os atributos característicos desta classe e garantir 
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

	// métodos gets e sets dos atributos
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

	// outros métodos
	public void oQueFaz() {
		System.out.println(
				"O Presidente da República também tem o direito "
				+ "de rejeitar ou sancionar matérias e ainda, "
				+ "decretar intervenção federal nos Estados, o "
				+ "estado de defesa e o estado de sítio; manter "
				+ "relações com Estados estrangeiros e credenciar "
				+ "seus representantes diplomáticos; celebrar "
				+ "tratados, convenções e atos internacionais, "
				+ "sujeitos a referendo do Congresso Nacional. "
				+ "Compete ao cargo a concessão de indulto e a "
				+ "comutação de penas, ou seja, substituir uma "
				+ "pena mais grave, imposta ao réu, por outra "
				+ "mais branda.");
	}
}
