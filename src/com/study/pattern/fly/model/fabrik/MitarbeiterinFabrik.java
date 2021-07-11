/**
 * 
 */
package com.study.pattern.fly.model.fabrik;

import java.util.HashMap;

import com.study.pattern.fly.model.Entwickler;
import com.study.pattern.fly.model.Mitarbeiterin;
import com.study.pattern.fly.model.Tester;

/**
 * @author rajan 
 * Employee factory
 * @since 11Junl2021
 *
 */
public class MitarbeiterinFabrik {

	private static HashMap<String, Mitarbeiterin> map = new HashMap<>(2);

	/**
	 * getEmployee method
	 * 
	 * @param art- type
	 * @return - employee
	 */
	public static Mitarbeiterin bekommenMitarbeiterin(String art) {
		Mitarbeiterin mitarbeiterin = null;
		if (map.get(art) != null) {
			return map.get(art);
		} else {
			switch (art) {
			case "Entwickler":
				System.out.println("Entwickler ist erstellt");
				mitarbeiterin = new Entwickler();
				map.put(art, mitarbeiterin);
				break;
			case "Tester":
				System.out.println("Tester ist erstellt");
				mitarbeiterin = new Tester();
				map.put(art, mitarbeiterin);
				break;
			}
		}
		return mitarbeiterin;
	}
}
