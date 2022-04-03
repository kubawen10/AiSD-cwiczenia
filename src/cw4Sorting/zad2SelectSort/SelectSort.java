package cw4Sorting.zad2SelectSort;

import cw4Sorting.core.SortingAlgorithm;

import java.util.Comparator;
import java.util.List;

public class SelectSort <T> extends SortingAlgorithm<T> {

    private Comparator<? super T> comparator;

    public SelectSort(Comparator<? super T> comparator){
        this.comparator=comparator;
    }

    @Override
    public List<T> sort(List<T> list) {
        for (int i = list.size()-1; i > 0; i--) {
            int min = i;

            for (int j = i-1; j >=0; j--) {
                if (comparator.compare(list.get(min), list.get(j))>0){
                    min=j;
                }
            }
            swap(list, i, min);
            System.out.println(list);
        }
        return list;
    }
}
