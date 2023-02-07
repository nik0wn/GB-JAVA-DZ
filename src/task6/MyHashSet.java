package task6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class MyHashSet {
    private static final Object OBJECT = new Object();
    private static HashMap<Integer, Object> hashMap = new HashMap <>();
    public void add (Integer values){
        hashMap.put(values,OBJECT);
    }
    public String getString(){
        return hashMap.keySet().toString();
    }
}
