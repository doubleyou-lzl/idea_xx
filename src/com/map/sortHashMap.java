package com.map;

import com.User;

import java.util.*;

public class sortHashMap {
    public static void main(String[] args) {

        HashMap<Integer, User> hashMap = new HashMap<>();
        hashMap.put(1,new User("张三", 33));
        hashMap.put(9,new User("李四", 23));
        hashMap.put(3,new User("旺旺", 2));
        hashMap.put(5,new User("老王", 66));
        System.out.println(hashMap);
        HashMap<Integer, User> sortMap = sortMap(hashMap);
        System.out.println(sortMap);



    }
    public static HashMap<Integer, User> sortMap(HashMap<Integer, User> hashMap){
        Set<Map.Entry<Integer, User>> entries = hashMap.entrySet();
        ArrayList<Map.Entry<Integer, User>> list = new ArrayList<>(entries);
        Collections.sort(list, new Comparator<Map.Entry<Integer, User>>() {
            @Override
            public int compare(Map.Entry<Integer, User> o1, Map.Entry<Integer, User> o2) {
                return o2.getValue().getAge()-o1.getValue().getAge();
            }
        });
        LinkedHashMap<Integer, User> linkedHashMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, User> entry : list) {
            linkedHashMap.put(entry.getKey(),entry.getValue());
        }
        return linkedHashMap;
    }
}

