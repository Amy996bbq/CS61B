package Week3;

public class ArrayInsert {

    public static int[] insert(int[] arr, int item, int pos) {
        int[] result = new int[arr.length + 1];
        pos = Math.min(arr.length, pos);

        System.arraycopy(arr, 0, result, 0, pos);
        result[pos] = item;
        System.arraycopy(arr, pos, result, pos + 1, arr.length - pos);

        return result;
    }

    public static int[] reverse(int[] arr) {
        int[] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - i - 1];
        }
        return result;
    }

    public static int[] replicate(int[] arr) {
        int length = 0;
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            length += arr[i];
        }
        int[] result = new int[length];
        for(int item : arr) {
            for(int j = 0; j < item; j++) {
                result[index] = item;
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] result = replicate(array);
    }
}
