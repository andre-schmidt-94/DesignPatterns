package com.FactoryMethod;

public class Main {

	public static void main(String[] args) {
		FactoryPessoa factory = new FactoryPessoa();
		String nome = "Fernanda";
		String sexo = "F";
		factory.getPessoa(nome, sexo);
	}

}
