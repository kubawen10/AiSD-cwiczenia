package cw2Iterators.zad4NextPrime;

import java.util.Iterator;

public class NextPrimeIterator<T> implements Iterator<T> {
    Iterator<Integer> previousIterator;
    Predicate predicate;
    int value;
    boolean bHasNext;

    int elemNext;
    public NextPrimeIterator(Iterator<Integer> it, Predicate p) {
        previousIterator = it;
        this.predicate=p;
        value = previousIterator.next();
    }

    private void findNextValid() {
        while (previousIterator.hasNext()) {
            elemNext = previousIterator.next();
            if (predicate.accept(elemNext)) {
                return;
            }
        }
        bHasNext=false;
        elemNext= Integer.parseInt(null);
    }

    @Override
    public boolean hasNext() {
        return previousIterator.hasNext();
    }

    @Override
    public T next() {
        return null;
    }
}
