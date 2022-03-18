package cw3StackQueue.Zad6ReversePolishNotation;

import cw3StackQueue.StackPackage.EmptyStackException;
import cw3StackQueue.StackPackage.FullStackException;
import cw3StackQueue.StackPackage.ListStack;

public class RPN {
    ListStack<Double> stack;

    public RPN() {
        stack = new ListStack<>();
    }

    public Double calculate(String s) throws FullStackException, EmptyStackException {
        double x;
        double y;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                stack.push(Double.parseDouble(String.valueOf(c)));
                System.out.println("add " + c + " on stack");
            } else if (c == '+') {
                y = stack.pop();
                x = stack.pop();
                System.out.println("Add " + x + " + " + y);
                stack.push(add(x, y));
            } else if (c == '-') {
                y = stack.pop();
                x = stack.pop();
                System.out.println("Sub " + x + " - " + y);
                stack.push(sub(x, y));
            } else if (c == '*') {
                y = stack.pop();
                x = stack.pop();
                System.out.println("Mul " + x + " * " + y);
                stack.push(mul(x, y));
            } else if (c == '/') {
                y = stack.pop();
                x = stack.pop();
                System.out.println("Div " + x + " / " + y);
                stack.push(div(x, y));
            }
        }
        System.out.println(stack);
        return stack.top();
    }

    private double add(double x, double y) {
        return x + y;
    }

    private double sub(double x, double y) {
        return x - y;
    }

    private double mul(double x, double y) {
        return x * y;
    }

    private double div(double x, double y) {
        return x / y;
    }

}
