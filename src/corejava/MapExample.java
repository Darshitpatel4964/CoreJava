package corejava;

import java.util.HashMap;
import java.util.Map;

/**
 * Write a program using map concept.
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

public class MapExample {

    public static void main(String[] args) {
        // Creating object for map
        Map < Integer, String > map = new HashMap < Integer, String > ();

        // Add Elements
        map.put(1, "Darshit  Patel");
        map.put(2, "Jay Pansuriya");
        map.put(3, "Vasu Sheladiya");

        // Map elements traverse in any order
        for (Map.Entry mapelement: map.entrySet()) {

            System.out.println(mapelement.getKey() + " " + mapelement.getValue());
        }
    }

}
