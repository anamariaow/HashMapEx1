import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Creare 3 hashmap con 3 differenti metodi di inizializzazione e stampare il contenuto.
        Map<String, String> capitali = new HashMap<>();

        capitali.put("Italia", "Roma");
        capitali.put("Francia", "Parigi");
        capitali.put("Inghilterra", "Londra");
        System.out.println("Capitali: " + capitali);

        Map<String, String> capitali2 = Map.of("Italia", "Roma", "Francia", "Parigi", "Inghilterra", "Londra");
        System.out.println("Capitali2: " + capitali2);

        Map<String, String> capitali3 = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("Italia", "Roma"),
                new AbstractMap.SimpleEntry<>("Francia", "Parigi"),
                new AbstractMap.SimpleEntry<>("Inghilterra", "Londra")
        );
        System.out.println("Capitali3: " + capitali3);

    }
}