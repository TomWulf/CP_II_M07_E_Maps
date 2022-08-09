import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
	   // Create a Map for State Codes
        Map<String, String> stateCodes = new TreeMap<>();

        // Put in a few of the codes
        stateCodes.put("IN", "Indy"); // put provides the key and the value
        stateCodes.put("IN", "Indiana");  // Notice how we change a value with another put
        stateCodes.put("KY", "Kentucky");
        stateCodes.put("OH", "Ohio");
        stateCodes.put("ZA", "Zardoz");

        // Loop through all the data with a for each

        for(String key : stateCodes.keySet())
        {
            System.out.println("Key: " + key);
            System.out.println("Value: " + stateCodes.get(key) + "\n");  // get(Key) returns the value
        }

        // now remove the ZA entry
        stateCodes.remove("ZA");

        System.out.println("\n\n++++++++++++++++++++++++++++++++\n\n");

        // Dumping the key val pairs again to show  the removed one is gone
        for(String key : stateCodes.keySet())
        {
            System.out.println("Key: " + key);
            System.out.println("Value: " + stateCodes.get(key) + "\n");  // get(Key) returns the value
        }


    }
}
