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
		// primeira forma de inicializar atributos da superclasse
		//super();
		//super(0,"","","");
		
		// segunda forma
		setNome("");
		setPartido("");
		setProposta("");
		setNumero(0);
		
		this.vice = "";
		this.slogan = "";
		System.out.println("classe Governador");
	}
	
	
	
	
	public Governador(int numero, String partido, String proposta,
			String nome, String vice, String slogan) {
		
		super(numero, partido, proposta, nome);
		
		setVice(vice);
		setSlogan(slogan);
		
		// ou
		//this.vice = vice;
		//this.slogan = slogan;
		
	}

	
	
	/// m�todos gets e sets dos atributos

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
	
	public void mostrarDados() {
//		super.mostrarDados();
		
		System.out.println("Informacoes Governador");
		System.out.println("Nome: " + getNome());
		System.out.println("Proposta: " + getProposta());
		System.out.println("Numero: " + getNumero());
		System.out.println("Partido: " + getPartido());
		System.out.println("Vice: " + getVice());
		System.out.println("Slogan: " + getSlogan());
		
	}
	
	public void mostrarDados(String situacao) {
		
		if (situacao.compareTo("antes eleicao") == 0) {
			mostrarDados();
		} else if (situacao.compareTo("apos eleicao") == 0) {
			System.out.println("Informacoes Governador");
			System.out.println("Nome: " + getNome());
			System.out.println("Proposta: ent�o morra");
			System.out.println("Numero: " + getNumero());
			System.out.println("Partido: " + getPartido());
			System.out.println("Vice: " + getVice());
			System.out.println("Slogan: pior que est� "
					+ "n�o fica");	
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}