package cw3StackQueue.QueuePackage;

import cw3StackQueue.StackPackage.EmptyStackException;
import cw3StackQueue.StackPackage.FullStackException;
import cw3StackQueue.StackPackage.ListStack;

public class QueueTwoStacks<T> implements IQueue<T>{
    ListStack<T> stack1 = new ListStack<>();
    ListStack<T> stack2 = new ListStack<>();

    @Override
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T dequeue() throws EmptyQueueException {
        if(stack2.isEmpty()){
            if(stack1.isEmpty()){
                throw new EmptyQueueException();
            }
            else{
                while(!stack1.isEmpty()){
                    try {
                        stack2.push(stack1.pop());
                    } catch (FullStackException e) {
                        e.printStackTrace();
                    } catch (EmptyStackException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    return stack2.pop();
                } catch (EmptyStackException e) {
                    e.printStackTrace();
                }
            }
        }else{
            while(!stack2.isEmpty()){
                try {
                    stack1.push(stack2.pop());
                } catch (FullStackException e) {
                    e.printStackTrace();
                } catch (EmptyStackException e) {
                    e.printStackTrace();
                }
            }
            try {
                return stack1.pop();
            } catch (EmptyStackException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public void enqueue(T elem) throws FullQueueException {
        if(stack2.isEmpty()){
            try {
                stack1.push(elem);
            } catch (FullStackException e) {
                e.printStackTrace();
            }
        }
        else {
            try {
                stack2.push(elem);
            } catch (FullStackException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public int size() {
        return stack1.isEmpty() ? stack2.size() : stack1.size();
    }

    @Override
    public T first() throws EmptyQueueException {
        try {
            return stack1.isEmpty() ? stack2.top() : stack1.top();
        } catch (EmptyStackException e) {
            e.printStackTrace();
        }
        throw new EmptyQueueException();
    }

    @Override
    public String toString(){
        return stack1.toString() + stack2.toString();
    }
}
