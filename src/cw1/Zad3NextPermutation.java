package cw1;

public class Zad3NextPermutation {
    public static void main(String[] args) {
        int [] arr = {3,4,5,2,1};
        System.out.println(nextPermutation(arr));

        for(int i: arr){
            System.out.print(i+" ")     ;
        }

    }

    public static boolean nextPermutation(int[] arr) {
        int pivotIndex = 0;
        int rightSuccessorIndex = 0;

        //first element from right that is smaller than element on right
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i - 1] < arr[i]) {
                pivotIndex = i - 1;
                break;
            } else if (i == 1) {
                return false;
            }
        }

        //first element from right that is greater than arr[pivotIndex]
        for (int i = arr.length - 1; i > pivotIndex; i--) {
            if (arr[pivotIndex] < arr[i]) {
                rightSuccessorIndex = i;
                break;
            }
        }

        //swap pivot and rightmost element
        int temp = arr[rightSuccessorIndex];
        arr[rightSuccessorIndex] = arr[pivotIndex];
        arr[pivotIndex] = temp;

        //reverse elements on right from pivotIndex
        int r = arr.length-1;
        int l = pivotIndex+1;
        while(r>l){
            temp = arr[r];
            arr[r] = arr[l];
            arr[l] = temp;
            r--;
            l++;
        }
        return true;
    }
}
