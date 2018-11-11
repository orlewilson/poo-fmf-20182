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

	
	
	/// métodos gets e sets dos atributos

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
			System.out.println("Proposta: então morra");
			System.out.println("Numero: " + getNumero());
			System.out.println("Partido: " + getPartido());
			System.out.println("Vice: " + getVice());
			System.out.println("Slogan: pior que está "
					+ "não fica");	
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}