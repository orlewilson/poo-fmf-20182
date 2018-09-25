/*	Programação Orientada a Objeto
 * 	Prof. Orlewilson B. Maia
 * 	Autor (a): 	Orlewilson Bentes Maia
 *	Data:		31/08/2018 
 *	Descrição:	Exemplo de Classe abstraindo de um personagem de videogame
 *				Encasulamento (private nos atributos e métodos get/set)
 * 
 */

// classe que representará um personagem
public class Personagem {

	// atributos (características)
	// Atributos do tipo String recebem valores entre " "
	private String nome, cor, cabelo, roupa, olhos, dataNascimento, email, telefone;

	// Atributos do tipo boolean recebem valores true ou false
	private boolean bigode, sapato, luvas, botoes, chapeu;

	// métodos get (recuperar) e set (aterar)
	public void setNome(String novoNome) {
		nome = novoNome;
	}

	public String getNome() {
		return nome;
	}

	public void setCor(String novaCor) {
		cor = novaCor;
	}

	public String getCor() {
		return cor;
	}

	public void setCabelo(String novoCabelo) {
		cabelo = novoCabelo;
	}

	public String getCabelo() {
		return cabelo;
	}

	public void setRoupa(String novaRoupa) {
		roupa = novaRoupa;
	}

	public String getRoupa() {
		return roupa;
	}

	public void setOlhos(String novosOlhos) {
		olhos = novosOlhos;
	}

	public String getOlhos() {
		return olhos;
	}

	public void setDataNascimento(String novaDataNascimento) {
		dataNascimento = novaDataNascimento;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setEmail(String novoEmail) {
		email = novoEmail;
	}

	public String getEmail() {
		return email;
	}

	public void setTelefone(String novoTelefone) {
		email = novoTelefone;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setBigode(boolean novoBigode) {
		bigode = novoBigode;
	}

	public boolean getBigode() {
		return bigode;
	}

	public void setSapato(boolean novoSapato) {
		bigode = novoSapato;
	}

	public boolean getSapato() {
		return sapato;
	}

	public void setLuvas(boolean novasLuvas) {
		luvas = novasLuvas;
	}

	public boolean getLuvas() {
		return luvas;
	}

	public void setBotoes(boolean novosBotoes) {
		luvas = novosBotoes;
	}

	public boolean getBotoes() {
		return botoes;
	}

	public void setChapeu(boolean novoChapeu) {
		chapeu = novoChapeu;
	}

	public boolean getChapeu() {
		return chapeu;
	}
}