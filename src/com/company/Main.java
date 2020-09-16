package com.company;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;

public class Main {

    public static ArrayList<String> delD(ArrayList<String> lst) {
        Set<String> set = new LinkedHashSet<>(lst);
        lst.clear();
        lst.addAll(set);
        return lst;
    };



    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<String>();
        people.add("Иван");
        people.add("Иван");
        people.add("Иван");
        people.add("Петр");
        people.add("Петр");
        people.add(1, "Антон");
        people.add(1, "Антон");
        people.add(1, "Антон");
        delD(people);
        for (int i=0; i<people.size(); i++) {
            System.out.println(people.get(i));
        }
    }
}
