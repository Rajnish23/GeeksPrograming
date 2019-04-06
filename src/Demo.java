import java.util.*;

public class Demo {
    public static void main(String[] args) {

        HashMap<Character, Integer> obj = new HashMap<>();
        obj.put('A', 1);
        obj.put('B', 2);
        obj.put('C', 3);
        System.out.println(obj.entrySet());
        obj.keySet();

    }
}
