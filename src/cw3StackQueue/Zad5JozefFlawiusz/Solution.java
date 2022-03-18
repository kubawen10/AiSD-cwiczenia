package cw3StackQueue.Zad5JozefFlawiusz;

import cw3StackQueue.ListPackage.OneWayLinkedListWithSentinel;

public class Solution {
    OneWayLinkedListWithSentinel<Integer> list = new OneWayLinkedListWithSentinel<>();
    int n; //list size
    int k; //k-th element

    int currentIndex = -1; //which element is currently picked
    int counter = 0;       //count k

    public Solution(int n, int k) {
        this.n = n;
        this.k = k;
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
    }

    public void eliminate(){
        System.out.println(list);
        while(n>1){
            System.out.println("list size : " + n);

            for (int i = 0; i < k; i++) {
                if (currentIndex==n){
                    currentIndex=-1;
                }

                currentIndex++;

                if(currentIndex==n){
                    currentIndex=0;
                }
                System.out.println("current index: "+ currentIndex);
            }

            System.out.println("removing: " + currentIndex);
            list.remove(currentIndex);
            n--;
            currentIndex--;

            System.out.println(list);
            System.out.println();

        }
        System.out.println(list);
    }


}
