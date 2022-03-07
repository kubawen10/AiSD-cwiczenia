package cw2Iterators.zad1KthElement;

import java.util.Iterator;
import java.util.LinkedList;

public class KthElementDemo {
    public static void main(String[] args) {
        LinkedList<String> col=new LinkedList<String>();
        col.add("Val0");
        col.add("Val1");
        col.add("Val2");
        col.add("Val3");

        Iterator<String> iter = col.iterator();

        KthElementIterator<String> kth = new KthElementIterator<>(iter, 2);

        System.out.println(kth.hasNext());
        System.out.println(kth.next());
        System.out.println(kth.hasNext());
        System.out.println(kth.next());
        System.out.println(kth.hasNext());


    }
}
