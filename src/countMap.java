import java.util.HashMap;
import java.util.Map;

public class countMap {
    public static void main(String[] args) {
        createMap(new String[]{"a", "b", "a", "c", "b"});
    }

    public static void createMap(String[] strs){
        Map<String, Integer> map = new HashMap<>();
        for (String str : strs) {
            System.out.println(str);
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }
        System.out.println(map);
    }
}
