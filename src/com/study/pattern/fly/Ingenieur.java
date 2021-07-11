/**
 * 
 */
package com.study.pattern.fly;

import java.util.Random;

import com.study.pattern.fly.model.Mitarbeiterin;
import com.study.pattern.fly.model.fabrik.MitarbeiterinFabrik;

/**
 * @author rajan
 * Engineer main class
 * @since 11Jul2021
 *
 */
public class Ingenieur {
	
	private static String angestellteArt[]= {"Entwickler","Tester"};
	private static String kompentenzen[]= {"Java","C++"};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=0;i<4;i++) {
			Mitarbeiterin mitarbeiterin=MitarbeiterinFabrik.bekommenMitarbeiterin(bekommenZufaelligMitarbeiterin());
			mitarbeiterin.fertigkeitHinzufuegen(bekommenZufaellingFertigkeit());
			mitarbeiterin.aufgabeZuweisen();
			System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		}

	}
	
	/**
	 * get random employee
	 * @return String - employee
	 */
	private static String bekommenZufaelligMitarbeiterin() {
		Random zufaelling= new Random();
		return angestellteArt[zufaelling.nextInt(angestellteArt.length)];
	}

	/**
	 * get random skill
	 * @return string -skill
	 */
	private static String bekommenZufaellingFertigkeit() {
		Random zufaellig= new Random();
		return kompentenzen[zufaellig.nextInt(kompentenzen.length)];
	}
}
