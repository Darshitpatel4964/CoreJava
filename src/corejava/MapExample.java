package corejava;

/**
@author Darshit Patel
@version 1.01 2022-09-07
*/

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {

		// creating object for map
		Map<Integer, String> map = new HashMap<Integer, String>();

		// Add Elements
		map.put(1, "Darshit  Patel");
		map.put(2, "Jay Pansuriya");
		map.put(3, "Vasu Sheladiya");

		// map elements traverse in any order
		for (Map.Entry m : map.entrySet()) {

			System.out.println(m.getKey() + " " + m.getValue());

		}

	}
}
