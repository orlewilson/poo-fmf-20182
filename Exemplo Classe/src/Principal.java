/*	Programação Orientada a Objeto
 * 	Prof. Orlewilson B. Maia
 * 	Autor (a): 	Orlewilson Bentes Maia
 *	Data:		31/08/2018 
 *	Descrição:	Executar o projeto exemplo de Classe abstraindo de um personagem de videogame
 * 
 */

public class Principal {

	// método principal da classe para executar
	public static void main(String[] args) {

		// criando objetos
		Personagem mario = new Personagem();

		Personagem megaman = new Personagem();

		// atribuindo valores as características do objeto Mario
		mario.nome = "Mario Bros";
		mario.cor = "branco";
		mario.cabelo = "preto";
		mario.roupa = "vermelha";
		mario.olhos = "castanhos";
		mario.dataNascimento = "14/07/1983";
		mario.email = "mario@gmail.com";
		mario.telefone = "1234-1234";
		mario.bigode = true;
		mario.sapato = true;
		mario.luvas = true;
		mario.botoes = true;
		mario.chapeu = true;

		// mostrar valores dos atributos no console
		System.out.println("----- Personagem Mario -----");
		System.out.println("Nome: " + mario.nome);
		System.out.println("Cor: " + mario.cor);
		System.out.println("Cabelo: " + mario.cabelo);
		System.out.println("Roupa: " + mario.roupa);
		System.out.println("Olhos: " + mario.olhos);
		System.out.println("Data Nascimento: " + mario.dataNascimento);
		System.out.println("E-mail: " + mario.email);
		System.out.println("Telefone: " + mario.telefone);
		System.out.println("Bigode: " + mario.bigode);
		System.out.println("Sapato: " + mario.sapato);
		System.out.println("Luvas: " + mario.luvas);
		System.out.println("Botões: " + mario.botoes);
		System.out.println("Chapeu: " + mario.chapeu + "\n");

		// atribuindo valores as características do objeto Megaman
		megaman.nome = "Megaman";
		megaman.cor = "azul";
		megaman.cabelo = "não tem";
		megaman.roupa = "não tem";
		megaman.olhos = "azul";
		megaman.dataNascimento = "17/12/1987";
		megaman.email = "megaman@gmail.com";
		megaman.telefone = "1235-1235";
		megaman.bigode = false;
		megaman.sapato = true;
		megaman.luvas = false;
		megaman.botoes = false;
		megaman.chapeu = false;

		// mostrar valores dos atributos no console
		System.out.println("----- Personagem Megaman -----");
		System.out.println("Nome: " + megaman.nome);
		System.out.println("Cor: " + megaman.cor);
		System.out.println("Cabelo: " +megaman.cabelo);
		System.out.println("Roupa: " + megaman.roupa);
		System.out.println("Olhos: " + megaman.olhos);
		System.out.println("Data Nascimento: " + megaman.dataNascimento);
		System.out.println("E-mail: " + megaman.email);
		System.out.println("Telefone: " + megaman.telefone);
		System.out.println("Bigode: " + megaman.bigode);
		System.out.println("Sapato: " + megaman.sapato);
		System.out.println("Luvas: " + megaman.luvas);
		System.out.println("Botões: " + megaman.botoes);
		System.out.println("Chapeu: " + megaman.chapeu);
	}
}
