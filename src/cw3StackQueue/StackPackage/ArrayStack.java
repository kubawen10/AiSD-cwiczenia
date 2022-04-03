package cw3StackQueue.StackPackage;

public class ArrayStack<T> implements IStack<T> {

    private static final int DEFAULT_CAPACITY = 16;
    T array[];
    int topIndex;

    // klasy generyczne w zasadzie sa typu Object
    // pozwalaja jednak juz na etapie kompilacji sprawdzac poprawnosc typow
    @SuppressWarnings("unchecked")
    public ArrayStack (int initialSize){
        array=(T[])(new Object[initialSize]);
        topIndex=0;
    }

    public ArrayStack (){
        this(DEFAULT_CAPACITY);
    }

    @Override
    public boolean isEmpty() {
        return topIndex==0;
    }

    @Override
    public boolean isFull() {
        return topIndex==array.length;
    }

    @Override
    public T pop() throws EmptyStackException {
        if(isEmpty())
            throw new EmptyStackException();
        return array[--topIndex];
    }

    @Override
    public void push(T elem) throws FullStackException {
        if(isFull())
            throw new FullStackException();
        array[topIndex++]=elem;

    }

    @Override
    public int size() {
        return topIndex;
    }

    @Override
    public T top() throws EmptyStackException {
        if(isEmpty())
            throw new EmptyStackException();
        return array[topIndex-1];
    }

}

