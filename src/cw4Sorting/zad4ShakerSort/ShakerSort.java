package cw4Sorting.zad4ShakerSort;

import cw4Sorting.core.SortingAlgorithm;

import java.util.Comparator;
import java.util.List;

public class ShakerSort <T> extends SortingAlgorithm<T> {
    private Comparator<? super T> comparator;
    public ShakerSort(Comparator<? super T> comparator) {
        this.comparator=comparator;
    }

    @Override
    public List<T> sort(List<T> list) {
        int left = 0;
        int right = list.size()-1;

        int i = left;


        while(left<=right){
            boolean sorted = true;

            for (int j = i; j < right; j++) {
                if(comparator.compare(list.get(j), list.get(j+1))>0){
                    swap(list, j, j+1);
                    sorted = false;
                }
            }

            for (int j = right-1; j > i; j--) {
                if (comparator.compare(list.get(j), list.get(j-1))<0){
                    swap(list, j, j-1);
                    sorted = false;
                }
            }


            //ulepszenie 1
            if (sorted) return list;

            left++;
            right--;
        }

        return list;
    }
}
