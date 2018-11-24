import java.util.NoSuchElementException;

/*	Programa��o Orientada a Objeto
 * 	Prof. Orlewilson B. Maia
 * 	Autores: 	
 *	Data:		 
 
 	Descri��o:	Adicione os seguintes atributos: nomeSegurado, idade, 
 				valorPremio. Implemente nessa classe, al�m dos m�todos 
 				para garantir o encapsulamento dos atributos, os m�todos 
 				descritos a seguir: 
 				
 				- imprimir(): Este m�todo n�o retorna valor e dever� 
 				mostrar na tela todos os atributos da classe Apolice. Para 
 				imprimir em Java usa-se o comando 
 				System.out.println(NOME_ATRIBUTO)

				- calcularPremioApolice(): Este m�todo n�o retorna valor 
				e dever� calcular o valor do pr�mio seguindo as seguintes 
				regras: caso a idade seja maior ou igual a 18 e menor ou 
				igual a 25 anos, use a f�rmula: 
				valorPremio += (valorPremio * 20)/100. 
				
				Quando a idade for superior a 25 e menor ou igual a 36 anos, 
				use a f�rmula valorPremio += (valorPremio * 15)/100.                                                    valorPremio += (valorPremio * 15)/100. 

				Quando a idade for superior que 36 anos, use a f�rmula 
				valorPremio += (valorPremio * 10)/100.

				- oferecerDesconto(): Este m�todo n�o retorna valor, mas 
				recebe o par�metro cidade, que ir� conter o nome da cidade 
				para o c�lculo do desconto. Caso a cidade seja Manaus, 
				d� um desconto no valor do pr�mio de 20%. Caso seja Bel�m, 
				d� um desconto no valor do pr�mio de 15%. Caso seja Belo 
				Horizonte, d� um desconto no valor do pr�mio de 10%. Caso a 
				cidade seja S�o Paulo, dar um desconto no valor do pr�mio de 
				5%. Para realizar a compara��o de Strings em Java, 
				utilizam-se os m�todos equals(�Palavra para comparar�) 
				ou equalsIgnoreCase(�Palavra para comparar�).
 */
public class Apolice {

	// atributos
	private String nomeSegurado;
	private int idade;
	private double valorPremio;

	// construtores
	public Apolice() {
		this.nomeSegurado = "";
		this.idade = 0;
		this.valorPremio = 0.0;
	}

	public Apolice(String nomeSegurado, int idade, double valorPremio) {
		this.nomeSegurado = nomeSegurado;
		this.idade = idade;
		this.valorPremio = valorPremio;
	}

	// m�todos
	public void setNomeSegurado(String nomeSegurado) {
		this.nomeSegurado = nomeSegurado;
	}

	public String getNomeSegurado() {
		return this.nomeSegurado;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setValorPremio(double valorPremio) {
		this.valorPremio = valorPremio;
	}

	public double getValorPremio() {
		return this.valorPremio;
	}

	public void imprimir() {
		System.out.println("----------------------------------------");
		System.out.println("Nome Segurado: " + getNomeSegurado());
		System.out.println("Idade: " + getIdade());
		System.out.println("Valor Premio: " + getValorPremio());
		System.out.println("----------------------------------------\n");
	}

	public void calcularPremioApolice() {

		if (getIdade() >= 18 && getIdade() <= 25) {
			valorPremio += (valorPremio * 20) / 100;
		} else if (getIdade() > 25 && getIdade() <= 36) {
			valorPremio += (valorPremio * 15) / 100;
		} else if (getIdade() > 36) {
			valorPremio += (valorPremio * 10) / 100;
		}
	}

	public void oferecerDesconto(String cidade) {

		if (cidade.equalsIgnoreCase("manaus")) {
			valorPremio -= (valorPremio * 20) / 100;
		} else if (cidade.equalsIgnoreCase("bel�m")) {
			valorPremio -= (valorPremio * 15) / 100;
		} else if (cidade.equalsIgnoreCase("belo horizonte")) {
			valorPremio -= (valorPremio * 10) / 100;
		} else if (cidade.equalsIgnoreCase("s�o paulo")) {
			valorPremio -= (valorPremio * 5) / 100;
		}
	}
}
