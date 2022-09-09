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
        Map < Integer, String > addMapElements = new HashMap < Integer, String > ();

        // Add Elements
        addMapElements.put(1, "Darshit  Patel");
        addMapElements.put(2, "Jay Pansuriya");
        addMapElements.put(3, "Vasu Sheladiya");

        // Map elements traverse in any order
        for (Map.Entry mapElement: addMapElements.entrySet()) {
            System.out.println(mapElement.getKey() + " " + mapElement.getValue());
        }
    }

}
