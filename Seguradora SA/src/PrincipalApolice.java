import java.util.Scanner;

/*	Programa��o Orientada a Objeto
 * 	Prof. Orlewilson B. Maia
 * 	Autores: 	
 *	Data:		 
 
 	Descri��o: 	Criar um m�todo main() conforme o padr�o da linguagem Java. 
 				Nesse m�todo, criar um objeto do tipo da classe Apolice 
 				usando o comando: 
 				
 					Apolice novoObj = new Apolice();

				Para cada atributo do objeto, atribuir um valor coerente. 
				Voc� pode utilizar a classe Scanner para ler valores 
				informados no console pelo usu�rio.
				
				Executar o m�todo imprimir() e analisar o que ser� impresso 
				na tela (console). 
				
				Em seguida, executar o m�todo calcularPremioApolice().

				Executar o m�todo imprimir() novamente e analisar o que 
				ser� impresso na tela (console). 
				
				Executar o m�todo oferecerDesconto() passando como 
				par�metro a cidade de Belo Horizonte.
				
				Executar o m�todo imprimir() novamente e analisar o que 
				ser� impresso na tela (console). 
 */
public class PrincipalApolice {
	
	public static void main(String[] args) {
	
		// a classe Scanner ajuda a ler dados digitados 
		// no console pelo usu�rio
		Scanner lerDadosConsole = new Scanner(System.in);
		
		Apolice apolice1 = new Apolice("Jo�o", 45, 1000);
		Apolice apolice2 = new Apolice();
		
		apolice1.imprimir();
		apolice1.calcularPremioApolice();
		apolice1.imprimir();
		apolice1.oferecerDesconto("Manaus");
		apolice1.imprimir();
		
		System.out.print("Digite um nome: ");
		apolice2.setNomeSegurado(lerDadosConsole.nextLine()); // ler conte�do da linha
		
		System.out.print("Digite uma idade: ");
		apolice2.setIdade(lerDadosConsole.nextInt()); // ler um n�mero inteiro
		
		System.out.print("Digite um valor de pr�mio: ");
		apolice2.setValorPremio(lerDadosConsole.nextDouble()); // ler um n�mero real
		
		apolice2.imprimir();
		apolice2.calcularPremioApolice();
		apolice2.imprimir();
		apolice2.oferecerDesconto("S�o Paulo");
		apolice2.imprimir();
	}
}
