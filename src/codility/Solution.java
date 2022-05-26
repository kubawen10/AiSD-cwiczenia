package codility;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] A = {0, 1, 0, 1, 1, 1, 0};
        int[] X = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(s.solution(A, X));
    }

    public int solution(int[] A, int[] X) {
        //pick first
        int sumVisited;

        int curMax = 0;

        for (int i = 0; i < X.length; i++) {
            sumVisited = visit(A, X, i, 0, i, i, 0);

            if (sumVisited > curMax) {
                curMax = sumVisited;
            }

            if (curMax == X.length) return curMax;
        }

        return curMax;
    }

    public int visit(int[] A, int[] X, int index, int fuel, int visitedLeft, int visitedRight, int sumVisited) {
        if (index == -1) return sumVisited;

        fuel += A[index];
        sumVisited++;

        int leftIndex = findLeftNeighbour(X, index, fuel, visitedLeft);
        int goLeft = visit(A, X, leftIndex, calculateFuel(X, fuel, index, leftIndex), leftIndex, visitedRight, sumVisited);

        int rightIndex = findRightNeighbour(X, index, fuel, visitedRight);
        int goRight = visit(A, X, rightIndex, calculateFuel(X, fuel, index, rightIndex), visitedLeft, rightIndex, sumVisited);

        return Math.max(goLeft, goRight);
    }

    public int findLeftNeighbour(int[] X, int index, int fuel, int visitedLeft) {
        //we already visited leftmost city
        if (visitedLeft == 0) {
            return -1;
        }

        //distance between cities is less then available fuel
        if (distance(X[visitedLeft - 1], X[index]) <= fuel) {
            return visitedLeft - 1;
        }
        return -1;
    }

    public int findRightNeighbour(int[] X, int index, int fuel, int visitedRight) {
        //we already visited rightmost city
        if (visitedRight == X.length - 1) {
            return -1;
        }
        //distance between cities is less then available fuel
        if (distance(X[visitedRight + 1], X[index]) <= fuel) {
            return visitedRight + 1;
        }

        return -1;
    }

    public int distance(int a, int b) {
        return Math.abs(a - b);
    }

    public int calculateFuel(int [] X, int curFuel, int from, int to){
        if(from ==-1 || to ==-1) return curFuel;

        return curFuel-distance(X[from], X[to]);
    }
}
