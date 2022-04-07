package cw4Sorting.zad6MErgeSort;

import cw3StackQueue.ListPackage.OneWayLinkedListWithSentinel;
import cw3StackQueue.QueuePackage.ArrayQueue;
import cw3StackQueue.QueuePackage.EmptyQueueException;
import cw3StackQueue.QueuePackage.FullQueueException;
import cw3StackQueue.QueuePackage.IQueue;
import cw4Sorting.core.SortingAlgorithm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MergeSort<T> extends SortingAlgorithm<T> {
    private Comparator<? super T> comparator;

    public MergeSort(Comparator<? super T> comparator){
        this.comparator = comparator;
    }

    @Override
    public List<T> sort(List<T> list) throws FullQueueException {
        IQueue<T> q1;
        IQueue<T> q2;

        for (int i = 1; i < list.size(); i*=2) {
            for (int j = 0; j < list.size(); j+=2*i) {
                q1= new ArrayQueue<>(i);
                q2 = new ArrayQueue<>(i);

                for (int k = j; k < k+i; k++) {
                    q1.enqueue(list.get(k));
                }

                for (int k = j+i; k < k+i; k++) {
                    q2.enqueue(list.get(k));
                }


            }
            
            

            

        }

        return null;
    }

    public List<T> merge(IQueue<T> q1, IQueue<T> q2) throws EmptyQueueException {
        List<T> retList = new LinkedList<>();
        T val1;
        T val2;
        while(!q1.isEmpty() || !q2.isEmpty()){
            if(!q1.isEmpty()){
                val1=q1.dequeue();
            }
            else val1 = null;

            if (!q2.isEmpty()){
                val2=q2.dequeue();
            }
            else val2 = null;


            boolean b = (comparator.compare(val1, val2)) > 0 ? retList.add(val2) : retList.add(val1);
        }
        return retList;
    }
}
