/*	Programação Orientada a Objeto
 * 	Prof. Orlewilson B. Maia
 * 	Autor (a): 	Orlewilson Bentes Maia
 *	Data:		19/10/2018 
 *	Descrição:	Exemplo de classe para representar governador
 * 
 */

// TODO (para casa)
// - Colocar herança nesta classe e fazer os ajustes necessários;
// - Adicionar os atributos característicos desta classe e garantir 
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

	// métodos gets e sets dos atributos

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

	// outros métodos
	public void oQueFaz() {
		System.out.println(
				"Governador é o cargo político que representa o "
				+ "poder executivo na esfera dos Estados e do "
				+ "Distrito Federal. É função do governador: a "
				+ "direção da administração estadual e a "
				+ "representação do Estado em suas relações "
				+ "jurídicas, políticas e administrativas, "
				+ "defendendo seus interesses junto à Presidência "
				+ "e buscando investimentos.");
	}
}