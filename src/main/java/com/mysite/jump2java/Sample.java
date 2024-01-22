package com.mysite.jump2java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Sample {
    public static void main(String[] args){
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
        pitches.sort(Comparator.reverseOrder());
        System.out.println(pitches);
    }
}
