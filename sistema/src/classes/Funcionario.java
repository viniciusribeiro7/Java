package classes;

public class Funcionario {
	private Integer matricula;
	private String nome;

//construtor vazio
//construtor1
//construtor serve para voce criar um objeto
	public Funcionario() {

	}

	// esta recebendo e atribuindo mais de um parametro, enquanto o set é só de um
	// por um
	// construtor2
	public Funcionario(Integer matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}

	// Dois metodos um para definir e outro para recuperar as informações dos
	// atributos
	// famoso get e set

	// recupera o valor do atributo
	// tem de retornar o mesmo tipo da matricula
	public Integer getMatricula() {
		return matricula;
	}

	// define o valor do atributo
	// set por padrão não retorna nada
	// o tipo do meu parametro é sempre o tipo do meu atributo e o nome é o mesmo do
	// atributo

	// faz altomaticamente, no botão direito, na classe, aperta em source,generat
	// get e set
	// marca os atributos que queira que aconteça o get e o set e aperta em generate
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}