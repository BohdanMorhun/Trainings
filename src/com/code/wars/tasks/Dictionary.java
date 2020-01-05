package com.code.wars.tasks;

import java.util.HashMap;

public class Dictionary {

    HashMap<String, String> fruits;

    public Dictionary() {
        fruits = new HashMap<>();
    }

    public void newEntry(String key, String value) {
        fruits.put(key, value);
    }

    public String look(String key) {
//      return map.getOrDefault(key,"Can't find entries for " + key);
//    }

        if (fruits.containsKey(key)) {
            return fruits.get(key);
        } else {
            return "Can't find entry for " + key;
        }
    }

    public static void main(String[] args) {
        Dictionary d = new Dictionary();
        d.newEntry("Apple", "A fruit that grows on trees");
        d.newEntry("Orange", "A fruit that grows on trees");
        d.newEntry("Banana", "Can't find entries for banana");
        System.out.println(d.look("Apple"));
    }
}
