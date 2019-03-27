package com.DailyCodingProblem;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String mainString = "de";

        ArrayList<String> listOfWords = new ArrayList<>();
        listOfWords.add("delayla");
        listOfWords.add("dematyr");
        listOfWords.add("dag");
        listOfWords.add("dairy");

        for (int i = 0; i < listOfWords.size(); i++)
            if (listOfWords.get(i).contains(mainString))
                System.out.println(listOfWords.get(i));
    }
}
