package com.map;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class CollectionQ {
    @Test
    public void fun1(){
        List<Object> objects = Collections.synchronizedList(new ArrayList<>());
        Vector<Object> objects1 = new Vector<>();
        objects1.add("ddd");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(232).append("dadd").append("32");
        System.out.println(stringBuilder);
    }
}
