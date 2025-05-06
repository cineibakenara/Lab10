package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> Persoane= Arrays.asList("Lei", "Bover", "Gusini","Chouder","Vijai");

        //cerinta 1 afis persoanele care au lungime peste 4

        List<String> persoane_peste_4=Persoane.stream()
                .filter(name -> name.length() >= 4)
                .forEach(name -> System.out.println(name));




    }
}

