package cw3StackQueue.Zad1VeloZad2Reverse;

import cw3StackQueue.StackPackage.EmptyStackException;
import cw3StackQueue.StackPackage.EndOfStackException;
import cw3StackQueue.StackPackage.FullStackException;

public class Main {
    public static void main(String[] args) throws FullStackException, EmptyStackException, EndOfStackException {
        VeloStack<Integer> s = new VeloStack<>();
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);

        System.out.println(s);
        s.reverse();
        System.out.println(s);
    }
}
