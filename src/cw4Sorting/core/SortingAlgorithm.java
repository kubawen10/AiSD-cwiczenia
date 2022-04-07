package cw4Sorting.core;

import cw3StackQueue.QueuePackage.FullQueueException;

import java.util.List;

public abstract class SortingAlgorithm <T>{
    public abstract List<T> sort(List<T> list) throws FullQueueException;

    public void swap(List<T> list, int index1, int index2){
        T temp = list.get(index1);

        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
}
