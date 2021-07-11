package com.study.pattern.fly.model;

/**
 * @author rajan
 * Developer class implements Employee
 * @since 11Jul2021
 *
 */
public class Entwickler implements Mitarbeiterin {
	
	private final String job;
	private String fertigkeit;
	
	public Entwickler(){
		this.job="Code Entwickln und Problem beheben";
	}

	@Override
	public void fertigkeitHinzufuegen(String fertigkeit) {
		this.fertigkeit=fertigkeit;

	}

	@Override
	public void aufgabeZuweisen() {
		System.out.println("Der Job des Entwicklers ist "+this.job);
		System.out.println("Und seine Faehikeit ist "+this.fertigkeit);
		

	}

}
