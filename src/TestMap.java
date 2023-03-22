import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hasdMap = new HashMap<>();
        hasdMap.put("Smith",30);
        hasdMap.put("Anderson",31);
        hasdMap.put("Lewis",29);
        hasdMap.put("Cook",29);
        System.out.println("Display entries in HasdMap");
        System.out.println(hasdMap+"\n");
        Map<String,Integer> treeMap = new TreeMap<>();
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));

    }
}
