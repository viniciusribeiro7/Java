package classes;

public class Teste {

	public static void main(String args[]) {
		Produto produto = new Produto(); // criando objeto

		produto.codigo = 10; // definindo atributo
		produto.descricao = "Teclado";

		System.out.println(produto.codigo); // acessando atributo
		System.out.println(produto.descricao);

//para classes encapsuladas
		Funcionario funcionario = new Funcionario();
// modo tracional não funciona porque matricula é privado funcionario.matricula = 123456;

//modo certo
		funcionario.setMatricula(123456); // definindo atributo privado
		funcionario.setNome("Joao Silva");

		System.out.println(funcionario.getMatricula()); // acessando atributo privado
	}
}