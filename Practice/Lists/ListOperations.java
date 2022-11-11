package Lists;
// Code to produce a method that adds the string "and" between elements in a list of strings.

import java.util.LinkedList;
import java.util.ListIterator;

public class ListOperations {
    public static void addAnds(LinkedList<String> list) {
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            iterator.next();
            if (iterator.hasNext()) {
                iterator.add("and");
            }
        }
    }

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Peter");
        names.add("Paul");
        names.add("Mary");
        System.out.println(names);
        addAnds(names);
        System.out.println(names);
    }
}
