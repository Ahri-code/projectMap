package projectMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MainMap {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();

        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k4", "v4");
        map.put("k5", "v5");
        map.put("k6", "v6");
        map.put("k7", "v7");
        map.put("k8", "v8");

        System.out.println("Size: " + map.size());

        String key = "k4";
        System.out.println("Key 4: " + map.get(key));

        if(map.containsKey("AA"))
            System.out.println("Key found");
        else
            System.out.println("Key not found");

        if(map.containsValue("v8"))
            System.out.println("Value found");
        else
            System.out.println("Value not found");

        Set<String> keys = map.keySet();

        for(String k : keys) {
            System.out.println("********\nKey: " + k + "\nValue: " + map.get(k));
        }

        Set<Entry<String, String>> entry = map.entrySet();

        for(Entry<String, String> e : entry) {
            System.out.println("********\nEntry keys: " + e.getKey() + "\nValue: " + e.getValue());
        }

        Map<String, TestMap> mObject = new HashMap<String, TestMap>();
        TestMap obj = null;
        String k = "map";

        for(int i = 0; i < 10; i++) {
            k += String.valueOf(i);
            obj = new TestMap();
            obj.setC1("C1" + String.valueOf(i));
            obj.setC2("C2" + String.valueOf(i));
            mObject.put(k, obj);
        }

        System.out.println(mObject.size());

        for(Entry<String, TestMap> e : mObject.entrySet()) {
            System.out.println("Entry keys found: " + e.getKey() + " Value: " + ((TestMap)e.getValue()).toString());
        }

        TestMap nm = mObject.get("map012");
        System.out.println("mObject value: " + nm);
    }
}