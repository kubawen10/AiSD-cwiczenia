package cw3StackQueue.StackPackage;

import cw3StackQueue.ListPackage.OneWayLinkedListWithSentinel;

public class ListStack<E> implements IStack<E> {
    public OneWayLinkedListWithSentinel<E> _list;

    public ListStack() {
        _list = new OneWayLinkedListWithSentinel<>();
    }

    @Override
    public boolean isEmpty() {
        return _list.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public E pop() throws EmptyStackException {
        E value;
        try {
            value = _list.remove(0);
        } catch (IndexOutOfBoundsException e) {
            value = null;
        }
        if (value == null) throw new EmptyStackException();
        return value;
    }

    @Override
    public void push(E elem) throws FullStackException {
        _list.add(0, elem);
    }

    @Override
    public int size() {
        return _list.size();
    }

    @Override
    public E top() throws EmptyStackException {
        E value;
        try {
            value = _list.get(0);
        } catch (IndexOutOfBoundsException e) {
            value = null;
        }

        if (value == null) throw new EmptyStackException();
        return value;
    }

    public void reverse() throws EmptyStackException {
        OneWayLinkedListWithSentinel<E> newList = new OneWayLinkedListWithSentinel<>();
        while(!_list.isEmpty()){
            newList.add(0, this.pop());
        }
        _list=newList;
    }

    @Override
    public String toString(){
        //stack should be displayed in reverse order?
        return _list.toString();
    }
}

