/*	Programação Orientada a Objeto
 * 	Prof. Orlewilson B. Maia
 * 	Autores: 	
 *	Data:		 
 
 	Descrição:	Criar um método main() conforme o padrão da 
 				linguagem Java. Nesse método, criar um objeto do tipo 
 				da classe Acampamento usando o comando: 
 
 				Acampamento novoObj = new Acampamento();

				Para cada atributo do objeto, atribuir um valor coerente. 
				Você pode utilizar a classe Scanner para ler valores 
				informados no console pelo usuário. Não se esquecer de 
				converter os valores lidos antes de atribuí-los a cada 
				atributo.

				Executar o método imprimir() e analisar o que será 
				impresso na tela (console). 
				
				Em seguida, executar o método separarGrupo().
				
				Executar o método imprimir() novamente e analisar o que 
				será impresso na tela (console). 
 */
public class PrincipalAcampamento {

	public static void main(String[] args) {
		
		Acampamento joao = new Acampamento();
		Acampamento maria = new Acampamento();
		
		joao.setNome("João da Silva");
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






