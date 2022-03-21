package cw3StackQueue.Zad3TwoStackQueue;

import cw3StackQueue.QueuePackage.EmptyQueueException;
import cw3StackQueue.QueuePackage.FullQueueException;
import cw3StackQueue.QueuePackage.QueueTwoStacks;

public class Main {
    public static void main(String[] args) throws EmptyQueueException, FullQueueException {
        QueueTwoStacks<Integer> s = new QueueTwoStacks<>();
        System.out.println(s);
        s.enqueue(1);
        s.enqueue(2);
        System.out.println(s);

        System.out.println(s.dequeue());
        System.out.println(s);

    }
}
