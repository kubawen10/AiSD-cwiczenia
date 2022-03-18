package cw3StackQueue.Zad6ReversePolishNotation;

import cw3StackQueue.StackPackage.EmptyStackException;
import cw3StackQueue.StackPackage.FullStackException;

public class Main {
    public static void main(String[] args) throws EmptyStackException, FullStackException {
        String s = "5 3 - 2 *";

        RPN rpn = new RPN();

        System.out.println(rpn.calculate(s));

    }
}
