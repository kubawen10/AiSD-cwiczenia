package cw5HashTables_BST;

import cw4Sorting.core.IntegerComparator;

public class Main {
    public static void main(String[] args) {
        BST<Integer> b = new BST<>(new IntegerComparator());
        b.insert(5);
        b.insert(3);
        b.insert(2);
        b.insert(4);
        b.insert(8);
        b.insert(6);
        b.insert(7);
        b.insert(9);


        //System.out.println( b.preOrderWalk());
        //System.out.println( b.inOrderWalk());
        //System.out.println( b.postOrderWalk());
        //System.out.println(b.getMax());

        //b.delete(9);

//        System.out.println( b.preOrderWalk());
//        System.out.println( b.inOrderWalk());
//        System.out.println( b.postOrderWalk());

        System.out.println(b.printLevels());
    }
}
