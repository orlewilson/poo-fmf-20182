/*	Programa��o Orientada a Objeto
 * 	Prof. Orlewilson B. Maia
 * 	Autor (a): 	Orlewilson Bentes Maia
 *	Data:		19/10/2018 
 *	Descri��o:	Executar o projeto exemplo de Heran�a
 * 
 */

// TODO (para casa)
// - Criar um objeto para cada classe, informar valor e chamar 
// oQueFaz.

public class Principal {

	// m�todo principal da classe para executar
	public static void main(String[] args) {

		// criando objetos
		Governador gov1 = new Governador();
		Presidente pres1 = new Presidente();
		
//		gov1.setNome("Jo�o da silva");
//		gov1.setNumero(123);
//		gov1.setPartido("ASD");
//		gov1.setProposta("Viver melhor");
		gov1.setSlogan("Fa�a valer a pena");
		gov1.setVice("N�o sendo o Vasco :)");
		gov1.oQueFaz();
		
		pres1.setNome("Maria da Gama");
		pres1.setNumero(546);
		pres1.setPartido("zxc");
		pres1.setProposta("Capemdien");
		pres1.setVice("Ame o pr�ximo");
		pres1.oQueFaz();
	}
}
