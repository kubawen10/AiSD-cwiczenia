package cw4Sorting.zad1InsertSort;

import cw4Sorting.core.SortingAlgorithm;

import java.util.Comparator;
import java.util.List;

public class InsertSort<T> extends SortingAlgorithm<T> {

    private Comparator<? super T> comparator;

    public InsertSort(Comparator<? super T> comparator){
        this.comparator=comparator;
    }

    @Override
    public List<T> sort(List<T> list) {
        for (int i = list.size()-2; i >=0; i--) {
            T val = list.get(i);

            int j = i+1;

            while (j<list.size() && comparator.compare(val, list.get(j))<0){
                swap(list, j, j-1);
                j++;
            }
            System.out.println(list);
        }
        return list;
    }
}
