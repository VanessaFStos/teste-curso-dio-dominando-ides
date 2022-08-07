package br.com.dio;

import br.com.dio.model.Grade;

public class PrimeiroPrograma {

	public static void main(String[] args) {
	
		Grade grade =new Grade();
		Livros livros = new Livros() ;
		
		System.out.println(grade);
		System.out.println(livros);
		
		/*int a = 2;
		int b = 3;
		System.out.println("Hello Wordl!" + (a+b));*/
	}


}


class Livros {
	private String nome;
	private String npag;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNpag() {
		return npag;
	}
	public void setNpag(String npag) {
		this.npag = npag;
	}
	
	
}

