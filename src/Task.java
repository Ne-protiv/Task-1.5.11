import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] firstArray = {-100, 9, 6, 10001, 112, 10, -17};
        int[] secondArray = {-11, 21, 101, 91, -1133, 51, 41, 61, 4000};
        int[] result = mergeAndSort(firstArray, secondArray);
        System.out.println(Arrays.toString(result));
    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] result = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, result, 0, firstArray.length);
        System.arraycopy(secondArray, 0, result, firstArray.length, secondArray.length);
        Arrays.sort(result);
        return result;
    }
}