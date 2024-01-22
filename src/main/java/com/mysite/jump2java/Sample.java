package com.mysite.jump2java;

import java.util.*;

public class Sample {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<>();
        set.add("Jump");
        set.addAll(Arrays.asList("2", "Java"));
        System.out.println(set);
    }
}
