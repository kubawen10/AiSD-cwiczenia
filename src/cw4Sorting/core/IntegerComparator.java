package cw4Sorting.core;

import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer l, Integer r){
        return l-r;
    }
}
