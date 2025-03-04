package pilha.exercises;

import pilha.Pilha;

public class Exercise3 {
	public static void main(String[] args) {
		Pilha<Livro> livros = new Pilha<Livro>(20);

		Livro livro1 = new Livro(
				"Estruturas de Dados e Algoritmos com JavaScript: Escreva um C�digo JavaScript Complexo e Eficaz Usando a Mais Recente ECMAScript",
				"978-8575226933",
				2019,
				"Loiane Groner"
				);
		Livro livro2 = new Livro(
				"C�digo limpo: Habilidades pr�ticas do Agile Software",
				"978-8576082675",
				2009,
				"Robert C. Martin"
				);
		Livro livro3 = new Livro(
				"Arquitetura limpa: O guia do artes�o para estrutura e design de software",
				"978-8550804606",
				2019,
				"Robert C. Martin"
				);
		Livro livro4 = new Livro(
				"Estruturas de Dados e Algoritmos com JavaScript: Escreva um C�digo JavaScript Complexo e Eficaz Usando a Mais Recente ECMAScript",
				"978-8575226933",
				2019,
				"Loiane Groner"
				);
		Livro livro5 = new Livro(
				"C�digo limpo: Habilidades pr�ticas do Agile Software",
				"978-8576082675",
				2009,
				"Robert C. Martin"
				);
		Livro livro6 = new Livro(
				"Arquitetura limpa: O guia do artes�o para estrutura e design de software",
				"978-8550804606",
				2019,
				"Robert C. Martin"
				);

		System.out.println("Empilhando os livros, pilha est� vazia? "+livros.estaVazia());
		
		System.out.println("\nEmpilhando...");
		
		livros.empilha(livro1);
		livros.empilha(livro2);
		livros.empilha(livro3);
		livros.empilha(livro4);
		livros.empilha(livro5);
		livros.empilha(livro6);
		
		System.out.println(livros.tamanho()+" livros empilhados:");
		System.out.println(livros);
		
		System.out.println("\n�ltimo livros empilhado:\n" + livros.topo());
		
		System.out.println("\nDesempilhando arquivos...");
		
		while(!livros.estaVazia()) {
			System.out.println("Desempilhando livro" + livros.desempilha());
		}
		
		System.out.println("\nTodos os livros foram desempilhados");
		
		System.out.println("Pilha realmente est� vazia? "+ livros.estaVazia());
	}
}
