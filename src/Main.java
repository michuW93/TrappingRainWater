public class Main {
    public static int[] input = {4, 2, 1, 3, 5};

    public static void main(String[] args) {
        int pieceOfWater = 0;
        for (int i = 1; i < input.length - 1; i++) {
            int leftMax = findLeftMax(i);
            int rightMax = findRightMax(i);

            int min = getMin(leftMax, rightMax);
            pieceOfWater+=min - input[i];
        }
        System.out.println(pieceOfWater);
    }

    public static int findLeftMax(int i) {
        int max = input[0];
        for (int a = 0; a < i; a++) {
            if (input[a] > max) {
                max = input[a];
            }
        }
        return max;
    }

    public static int findRightMax(int i) {
        int max = input[input.length - 1];
        for (int a = input[input.length - 2]; a > i; a--) {
            if (input[a] > max){
                max = input[a];
            }
        }
        return max;
    }

    public static int getMin(int left, int right){
        return left > right ? right : left;
    }
}
