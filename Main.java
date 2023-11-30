import java.util.*;


public class Main {
    public static void main(String[] args) {
        Map <String, Integer> bDayandAge = new HashMap<String, Integer>();
        System.out.println("mappa iniziale: " + fill(bDayandAge));
        System.out.println("mappa ordinata per chiavi: " + orderMap(fill(bDayandAge)));

    }

    public static Map <String, Integer> fill (Map <String, Integer> emptyMap){
        emptyMap = new HashMap<String, Integer>();
        emptyMap.put("giorno", 18);
        emptyMap.put("mese", 4);
        emptyMap.put("anno", 2000);
        emptyMap.put("età", 23);

        return emptyMap;
    }

    public static List<String> orderMap (Map <String, Integer> map1) {
        List <String> order = new ArrayList<>(map1.keySet());
        Collections.sort(order);
        return order;
    }
}