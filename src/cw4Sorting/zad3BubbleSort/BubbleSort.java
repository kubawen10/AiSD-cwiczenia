package cw4Sorting.zad3BubbleSort;

import cw4Sorting.core.SortingAlgorithm;

import java.util.Comparator;
import java.util.List;

public class BubbleSort<T> extends SortingAlgorithm<T> {

    private Comparator<? super T> comparator;

    public BubbleSort(Comparator<? super T> comparator) {
        this.comparator = comparator;
    }

    @Override
    public List<T> sort(List<T> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = list.size() - 2; j >= i; j--) {
                if (comparator.compare(list.get(j), list.get(j +1)) < 0) {
                    swap(list, j, j + 1);
                }
            }
            System.out.println(list);
        }

        return list;
    }
}
