import java.util.Scanner;

/*	Programação Orientada a Objeto
 * 	Prof. Orlewilson B. Maia
 * 	Autores: 	
 *	Data:		 
 
 	Descrição: 	Criar um método main() conforme o padrão da linguagem Java. 
 				Nesse método, criar um objeto do tipo da classe Apolice 
 				usando o comando: 
 				
 					Apolice novoObj = new Apolice();

				Para cada atributo do objeto, atribuir um valor coerente. 
				Você pode utilizar a classe Scanner para ler valores 
				informados no console pelo usuário.
				
				Executar o método imprimir() e analisar o que será impresso 
				na tela (console). 
				
				Em seguida, executar o método calcularPremioApolice().

				Executar o método imprimir() novamente e analisar o que 
				será impresso na tela (console). 
				
				Executar o método oferecerDesconto() passando como 
				parâmetro a cidade de Belo Horizonte.
				
				Executar o método imprimir() novamente e analisar o que 
				será impresso na tela (console). 
 */
public class PrincipalApolice {
	
	public static void main(String[] args) {
	
		// a classe Scanner ajuda a ler dados digitados 
		// no console pelo usuário
		Scanner lerDadosConsole = new Scanner(System.in);
		
		Apolice apolice1 = new Apolice("João", 45, 1000);
		Apolice apolice2 = new Apolice();
		
		apolice1.imprimir();
		apolice1.calcularPremioApolice();
		apolice1.imprimir();
		apolice1.oferecerDesconto("Manaus");
		apolice1.imprimir();
		
		System.out.print("Digite um nome: ");
		apolice2.setNomeSegurado(lerDadosConsole.nextLine()); // ler conteúdo da linha
		
		System.out.print("Digite uma idade: ");
		apolice2.setIdade(lerDadosConsole.nextInt()); // ler um número inteiro
		
		System.out.print("Digite um valor de prêmio: ");
		apolice2.setValorPremio(lerDadosConsole.nextDouble()); // ler um número real
		
		apolice2.imprimir();
		apolice2.calcularPremioApolice();
		apolice2.imprimir();
		apolice2.oferecerDesconto("São Paulo");
		apolice2.imprimir();
	}
}
