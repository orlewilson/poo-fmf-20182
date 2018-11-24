import java.util.NoSuchElementException;

/*	Programação Orientada a Objeto
 * 	Prof. Orlewilson B. Maia
 * 	Autores: 	
 *	Data:		 
 
 	Descrição:	Adicione os seguintes atributos: nomeSegurado, idade, 
 				valorPremio. Implemente nessa classe, além dos métodos 
 				para garantir o encapsulamento dos atributos, os métodos 
 				descritos a seguir: 
 				
 				- imprimir(): Este método não retorna valor e deverá 
 				mostrar na tela todos os atributos da classe Apolice. Para 
 				imprimir em Java usa-se o comando 
 				System.out.println(NOME_ATRIBUTO)

				- calcularPremioApolice(): Este método não retorna valor 
				e deverá calcular o valor do prêmio seguindo as seguintes 
				regras: caso a idade seja maior ou igual a 18 e menor ou 
				igual a 25 anos, use a fórmula: 
				valorPremio += (valorPremio * 20)/100. 
				
				Quando a idade for superior a 25 e menor ou igual a 36 anos, 
				use a fórmula valorPremio += (valorPremio * 15)/100.                                                    valorPremio += (valorPremio * 15)/100. 

				Quando a idade for superior que 36 anos, use a fórmula 
				valorPremio += (valorPremio * 10)/100.

				- oferecerDesconto(): Este método não retorna valor, mas 
				recebe o parâmetro cidade, que irá conter o nome da cidade 
				para o cálculo do desconto. Caso a cidade seja Manaus, 
				dê um desconto no valor do prêmio de 20%. Caso seja Belém, 
				dê um desconto no valor do prêmio de 15%. Caso seja Belo 
				Horizonte, dê um desconto no valor do prêmio de 10%. Caso a 
				cidade seja São Paulo, dar um desconto no valor do prêmio de 
				5%. Para realizar a comparação de Strings em Java, 
				utilizam-se os métodos equals(“Palavra para comparar”) 
				ou equalsIgnoreCase(“Palavra para comparar”).
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

	// métodos
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
		} else if (cidade.equalsIgnoreCase("belém")) {
			valorPremio -= (valorPremio * 15) / 100;
		} else if (cidade.equalsIgnoreCase("belo horizonte")) {
			valorPremio -= (valorPremio * 10) / 100;
		} else if (cidade.equalsIgnoreCase("são paulo")) {
			valorPremio -= (valorPremio * 5) / 100;
		}
	}
}
