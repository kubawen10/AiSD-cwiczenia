package cw2Iterators.zad1KthElement;

import java.util.Iterator;

public class KthElementIterator<T> implements Iterator<T> {

    private Iterator<T> iterator;
    private int k;

    private boolean bHasNext = true;
    private T nextElement = null;

    public KthElementIterator(Iterator<T> iterator, int k) {
        this.iterator = iterator;
        this.k = k;
        findNextValid();
    }

    private void findNextValid() {
        for (int j = 0; j < k - 1; j++) {
            if (iterator.hasNext()) {
                iterator.next();
            }
        }

        if(iterator.hasNext()){
            bHasNext=true;
            nextElement = iterator.next();
        }
        else {
            bHasNext = false;
            nextElement = null;
        }
    }

    @Override
    public boolean hasNext() {
        return bHasNext;
    }

    @Override
    public T next() {
        T returnValue = nextElement;
        findNextValid();
        return returnValue;
    }
}
