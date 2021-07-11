package com.study.pattern.fly.model;

/**
 * @author rajan
 * Tester class implements Employee
 * @since 11Jul2021
 *
 */
public class Tester implements Mitarbeiterin {
	private final String job;
	private String fertigkeit;
	
	public Tester(){
		this.job="testern von code";
	}

	@Override
	public void fertigkeitHinzufuegen(String fertigkeit) {
		this.fertigkeit=fertigkeit;

	}

	@Override
	public void aufgabeZuweisen() {
		System.out.println( "Der Job des Testers ist "+this.job);
		System.out.println( "Und seine Faehikeit ist "+this.fertigkeit);

	}

}
