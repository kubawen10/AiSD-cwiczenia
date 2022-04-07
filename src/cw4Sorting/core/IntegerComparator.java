package cw4Sorting.core;

import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer l, Integer r){
        if(l == null){
            return -1;
        }
        if(r==null){
            return 1;
        }
        return l-r;
    }
}
