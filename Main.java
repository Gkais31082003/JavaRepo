public class Main {
    public static void main(String[] args) {
        int[] array = {15, 78, 96, 17, 20, 65, 14, 36, 18, 20};
        int[] result = FindMaxInArray(array);
        System.out.println("Maximum value: " + result[0] + ", Index: " + result[1]);
    }

    public static int[] FindMaxInArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[]{-1, -1};
        }

        int maxValue = arr[0];
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIndex = i;
            }
        }

        return new int[]{maxValue, maxIndex};
    }
}
