/*	Programa��o Orientada a Objeto
 * 	Prof. Orlewilson B. Maia
 * 	Autores: 	
 *	Data:		 
 
 	Descri��o:	Adicione os seguintes atributos: nome, equipe, idade. 
 				Implemente nessa classe, al�m dos m�todos para garantir 
 				o encapsulamento dos atributos, os m�todos descritos a 
 				seguir: 
 				
 				- imprimir(): Este m�todo n�o retorna valor e dever� mostrar 
 				na tela o conte�do dos atributos da classe Acampamento. 
 				
 				- separarGrupo(): Este m�todo n�o retorna valor e dever� 
 				verificar as seguintes condi��es: se a idade estiver 
 				entre 6 e 10 anos, atribuir A ao atributo equipe; se a 
 				idade estiver entre 11 e 20, atribuir B ao atributo equipe; 
 				se a idade for superior a 21 anos, atribuir C ao atributo 
 				equipe.
 */
public class Acampamento {

	// atributos
	private String nome;
	private String equipe;
	private int idade;

	// construtor
	public Acampamento() {
		// primeira forma
		this.nome = "";
		this.equipe = "Sem equipe";
		this.idade = 0;

		// segunda forma
		setNome("");
		setEquipe("Sem Equipe");
		setIdade(0);
	}

	// m�todos

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setEquipe(String equipe) {
		this.equipe = equipe;
	}

	public String getEquipe() {
		return this.equipe;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getIdade() {
		return this.idade;
	}

	public void imprimir() {
		System.out.println("Nome: " + getNome());
		System.out.println("Equipe: " + getEquipe());
		System.out.println("Idade: " + getIdade());
	}

	public void separarGrupo() {

		if (getIdade() >= 6 && getIdade() <= 10) {
			setEquipe("A");
		} else if (getIdade() >= 11 && getIdade() <= 20) {
			setEquipe("B");
		} else if (getIdade() >= 21) {
			setEquipe("C");
		} else {
			setEquipe("Sem Equipe");
		}
	}
}
