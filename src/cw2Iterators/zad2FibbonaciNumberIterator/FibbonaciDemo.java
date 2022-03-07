package cw2Iterators.zad2FibbonaciNumberIterator;

import java.util.Iterator;

public class FibbonaciDemo {
    public static void main(String[] args) {
        Iterator<Integer> it = new FibbonaciIterator();

        System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
    }
}
