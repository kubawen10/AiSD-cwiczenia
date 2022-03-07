package cw2Iterators.zad3ShufflingIterator;

import java.util.Iterator;
import java.util.LinkedList;

public class ShufflingIteratorDemo {
    public static void main(String[] args) {
        LinkedList<String> col1=new LinkedList<String>();
        col1.add("Val0");
        col1.add("Val1");
        col1.add("Val2");
        col1.add("Val3");

        LinkedList<String> col2=new LinkedList<String>();
        col2.add("a");
        col2.add("b");
        col2.add("c");
        col2.add("d");

        Iterator<String> iter1 = col1.iterator();
        Iterator<String> iter2 = col2.iterator();

        ShufflingIterator<String> s =new ShufflingIterator<String>(iter1,iter2);

        System.out.println(s.hasNext());
        System.out.println(s.next());
        System.out.println(s.hasNext());
        System.out.println(s.next());
        System.out.println(s.hasNext());
        System.out.println(s.next());
        System.out.println(s.hasNext());
        System.out.println(s.next());
        System.out.println(s.hasNext());
        System.out.println(s.next());
        System.out.println(s.hasNext());
        System.out.println(s.next());
        System.out.println(s.hasNext());
        System.out.println(s.next());
        System.out.println(s.hasNext());
        System.out.println(s.next());
        System.out.println(s.hasNext());
        System.out.println(s.next());

    }
}
