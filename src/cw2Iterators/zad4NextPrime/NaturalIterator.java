package cw2Iterators.zad4NextPrime;

import java.util.Iterator;

public class NaturalIterator implements Iterator<Integer> {
    int n;
    int i=1;
    public NaturalIterator(int n){
        this.n=n;
    }


    @Override
    public boolean hasNext() {
        return i<=n;
    }

    @Override
    public Integer next() {
        i+=1;
        return i;
    }
}
