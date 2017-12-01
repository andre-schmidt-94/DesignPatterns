package com.singleton;

public final class Janela {
	
	private static final Janela INSTANCE = new Janela();
	private static final String Teste = "Ola Singleton";
	
	public static final String SingleTon = "Esse eu vejo fora";
	
	Janela() {
		
	}
	
	public static Janela getInstance() {
		return INSTANCE;
	}
	
	public static void Abrir() {
		System.out.println("Abriu a janela!");
	}
	
	public static void Fechar() {
		System.out.println("Fehou a janela!");
	}
	

}
