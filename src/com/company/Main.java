package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        homework_3();
        homework_4();
        LinkedList<LinkedList<Integer>> some_list = new LinkedList<>();

        LinkedList<Integer> list1 = new LinkedList<>();
        for (int i = 2; i <= 14; i += 2)
            list1.add(i);

        LinkedList<Integer> list2 = new LinkedList<>();
        for (int i = 3; i <= 18; i += 3)
            list2.add(i);

        some_list.add(list1);
        some_list.add(list2);
        System.out.println(flatten(some_list));

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

    static void homework_4() {
        LinkedList<Integer> intList = new LinkedList<>();

        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter ints:");
            while (in.hasNextInt()) {
                int oneInt = in.nextInt();
                for (int i = 0; i < intList.size(); i++) {
                    if (intList.get(i) == oneInt) {
                        intList.remove(i);
                    }
                }
                intList.addFirst(oneInt);
            }
            System.out.println(intList);
        } catch (Exception e) {
            System.out.println("Got exception: " + e);
        }
    }

    //homework_6
    public static LinkedList<Integer> flatten(LinkedList<LinkedList<Integer>> linkedLists) {
        LinkedList<Integer> final_list = new LinkedList<>();

        for (int i = 0; i < linkedLists.size(); i++) {
            LinkedList<Integer> currentList = linkedLists.get(i);
            final_list.addAll(currentList);
        }
        linkedLists.clear();

        return final_list;
    }

}

