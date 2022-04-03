package cw4Sorting.zad1InsertSort;

import cw4Sorting.core.IntegerComparator;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InsertSort<Integer> s = new InsertSort<>(new IntegerComparator());
        List<Integer> l = Arrays.asList(76,71, 5, 57,12,50,20,93,20,55,62,3);

        System.out.println(s.sort(l));
    }
}
