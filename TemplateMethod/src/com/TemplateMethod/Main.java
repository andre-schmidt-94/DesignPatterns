package com.TemplateMethod;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game = new Cricket();
		game.play();
		System.out.println();
		game = new Football();
		game.play();
	}

}
