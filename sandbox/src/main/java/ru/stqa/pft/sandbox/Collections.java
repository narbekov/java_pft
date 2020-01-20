package ru.stqa.pft.sandbox;

import java.util.Arrays;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        String[] langs = new String[4];
        langs[0]="Java";
        langs[1]="C#";
        langs[2]="Python";
        langs[3]="PHP";

        /*List<String> languages = new ArrayList<String>();
        languages.add("Java");
        languages.add("C#");
        languages.add("Python");
        languages.add("PHP");
        */
        List<String> languages = Arrays.asList("Java","C#","Python","PHP");

        /*
        for (String l : languages)
        {
            System.out.println("I want learn " + l);
        }
         */

        for (int i=0; i<languages.size();i++)
        {
            System.out.println(languages.get(i));
        }
    }
}
