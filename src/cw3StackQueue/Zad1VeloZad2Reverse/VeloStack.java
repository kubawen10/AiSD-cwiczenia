package cw3StackQueue.Zad1VeloZad2Reverse;

import cw3StackQueue.StackPackage.EmptyStackException;
import cw3StackQueue.StackPackage.EndOfStackException;
import cw3StackQueue.StackPackage.FullStackException;
import cw3StackQueue.StackPackage.ListStack;

public class VeloStack<E> extends ListStack<E> {
    private int index = 0;

    @Override
    public E top() throws EmptyStackException {
        index=0;
        return super.top();
    }

    public E peek(){
        return _list.get(index);
    }

    @Override
    public void push(E elem)throws FullStackException {
        index = 0;
        super.push(elem);

    }

    @Override
    public E pop() throws EmptyStackException {
        index = 0;
        return super.pop();
    }

    public void down() throws EndOfStackException {
        if(index == _list.size()-1){
            throw new EndOfStackException();
        }else{
            index+=1;
        }
    }

}
