/*	Programação Orientada a Objeto
 * 	Prof. Orlewilson B. Maia
 * 	Autor (a): 	Orlewilson Bentes Maia
 *	Data:		19/10/2018 
 *	Descrição:	Exemplo de classe para representar 
 *				político
 */

public abstract class Politico {

	// atributos
	private int numero;
	private String partido;
	private String proposta;
	private String nome;

	// TODO (para casa)
	// construtor sem argumentos e com argumentos
	public Politico() {
		this.numero = 0;
		this.partido = "";
		this.proposta = "";
		this.nome = "";
		System.out.println("classe Politico");
	}
	
	public Politico(int numero, String partido, 
			String proposta, String nome) {
		this.numero = numero;
		this.partido = partido;
		this.proposta = proposta;
		this.nome = nome;
	}
	
	// TODO (para casa)
	// métodos get e set
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setPartido(String partido) {
		this.partido = partido;
	}
	
	public String getPartido() {
		return this.partido;
	}
	
	public void setProposta(String proposta) {
		this.proposta = proposta;
	}
	
	public String getProposta() {
		return this.proposta;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void oQueFaz() {
		System.out.println("Inicialmente, nada!");
	}	
	
	public void mostrarDados() {
		System.out.println("Informacoes Politico");
		System.out.println("Nome: " + getNome());
		System.out.println("Proposta: " + getProposta());
		System.out.println("Numero: " + getNumero());
		System.out.println("Partido: " + getPartido());
	}
	
}









