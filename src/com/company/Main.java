package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        homework_3();
    }

    static void homework_3() {
        LinkedList<String> list = new LinkedList<>();

        try (Scanner in = new Scanner(System.in)) {
            while (in.hasNext()) {
                String word = in.next();
                if (word.equals("!"))
                    break;
                list.add(word);
            }

            while (in.hasNext()) {
                String word = in.next();
                if (word.equals("!"))
                    break;
                for (String w : list) {
                    if (word.equals(w))
                        System.out.println("hit");
                }
            }

        } catch (Exception e) {
            System.out.println("Got exception: " + e);
        }

    }
}

