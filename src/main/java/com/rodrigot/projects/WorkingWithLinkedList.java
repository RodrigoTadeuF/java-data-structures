package com.rodrigot.projects;

import java.util.LinkedList;
import java.util.ListIterator;

public class WorkingWithLinkedList {
    public static void main(String[] args) {
        LinkedList<String> person = new LinkedList<>();
        person.add("Alex");
        person.add("John");
        ListIterator<String> personIterator = person.listIterator();
        while(personIterator.hasNext()) {
            System.out.println(personIterator.next());
        }
        while(personIterator.hasPrevious()) {
            System.out.println(personIterator.previous());
        }
    }
}
