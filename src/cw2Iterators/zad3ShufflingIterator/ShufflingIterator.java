package cw2Iterators.zad3ShufflingIterator;

import java.util.Iterator;

//. E.a. if in the first collection are numbers 1, 2, 3, 4, 5 and in the
//other there is sequence 11, 12, 13, this iterator will access element in a sequence 1, 11, 2, 12, 3, 13, 4, 5.

public class ShufflingIterator<T> implements Iterator<T> {
    private Iterator<T> i1;
    private Iterator<T> i2;

    private int i = 1;

    public ShufflingIterator(Iterator<T> i1, Iterator<T> i2) {
        this.i1 = i1;
        this.i2 = i2;
    }

    private T findNext(){
        T returnValue;
        if(i%2==1) returnValue = i1.next();
        else returnValue = i2.next();

        i++;
        return returnValue;
    }

    @Override
    public boolean hasNext() {
        return i1.hasNext() || i2.hasNext();
    }

    @Override
    public T next() {
        if(!i1.hasNext() && !i2.hasNext()){
            return null;
        }
        else if(!i1.hasNext()){
            return i2.next();
        }
        else if(!i2.hasNext()){
            return i1.next();
        }
        else{
            return findNext();
        }
    }
}
