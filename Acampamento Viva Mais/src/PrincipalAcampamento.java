/*	Programa��o Orientada a Objeto
 * 	Prof. Orlewilson B. Maia
 * 	Autores: 	
 *	Data:		 
 
 	Descri��o:	Criar um m�todo main() conforme o padr�o da 
 				linguagem Java. Nesse m�todo, criar um objeto do tipo 
 				da classe Acampamento usando o comando: 
 
 				Acampamento novoObj = new Acampamento();

				Para cada atributo do objeto, atribuir um valor coerente. 
				Voc� pode utilizar a classe Scanner para ler valores 
				informados no console pelo usu�rio. N�o se esquecer de 
				converter os valores lidos antes de atribu�-los a cada 
				atributo.

				Executar o m�todo imprimir() e analisar o que ser� 
				impresso na tela (console). 
				
				Em seguida, executar o m�todo separarGrupo().
				
				Executar o m�todo imprimir() novamente e analisar o que 
				ser� impresso na tela (console). 
 */
public class PrincipalAcampamento {

	public static void main(String[] args) {
		
		Acampamento joao = new Acampamento();
		Acampamento maria = new Acampamento();
		
		joao.setNome("Jo�o da Silva");
		joao.setIdade(22);
		
		maria.setNome("Maria Gonzaga");
		maria.setIdade(20);
			
		joao.imprimir();
		maria.imprimir();
		
		joao.separarGrupo();
		maria.separarGrupo();
		
		joao.imprimir();
		maria.imprimir();
		
	}
}






