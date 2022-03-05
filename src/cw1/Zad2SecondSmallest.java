package cw1;

public class Zad2SecondSmallest {
    public static void main(String[] args) throws NoAnswerException {
        int[] t = {3, 9, 5, 4, 7, 1, 5, 1, 9};
        //int[] t = {1,1,2,1};

        System.out.println(getSecondSmallest(t));
    }

    public static int checkIfDifferentNumbers(int[] t) throws NoAnswerException {
        int i = 1;
        while (t[0] == t[i]) {
            i += 1;
            if (i >= t.length) {
                throw new NoAnswerException("Every number is the same");
            }
        }
        return i;
    }

    public static int getSecondSmallest(int[] t) throws NoAnswerException {
        if (t.length == 0 || t.length == 1) {
            throw new NoAnswerException("Array is too short");
        }

        int i = checkIfDifferentNumbers(t);

        int min;
        int second;

        //decide which number is smaller
        if (t[0] < t[i]) {
            min = t[0];
            second = t[i];
        } else {
            min = t[i];
            second = t[0];
        }

        for (int j = i + 1; j < t.length; j++) {
            if (t[j] < min) {
                second = min;
                min = t[j];
            }

            else if ((t[j] < second) && (t[j] != min)) {
                second = t[j];
            }

            //{3, 9, 5, 4, 7, 1, 5, 1, 9}
            System.out.println("j: " + j + "\tmin: " + min + "\tsecond: " + second);
        }

        return second;
    }
}
