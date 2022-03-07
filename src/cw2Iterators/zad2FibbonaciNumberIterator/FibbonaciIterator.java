package cw2Iterators.zad2FibbonaciNumberIterator;

import java.util.Iterator;

public class FibbonaciIterator implements Iterator<Integer> {
    private Integer first = 0;
    private Integer second = 1;
    private Integer next = null;

    @Override
    public boolean hasNext() {
        return true;
    }

    private void shift(){
        next = first + second;
        first = second;
        second = next;
    }

    @Override
    public Integer next() {
        shift();
        return first;
    }
}
