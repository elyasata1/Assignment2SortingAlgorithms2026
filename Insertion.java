public class Insertion implements SortingAlgorithm {

    public int[] sorty(int[] input) {
        int[] arr = copy(input);

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        return arr;
    }

    private int[] copy(int[] input) {
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = input[i];
        }
        return arr;
    }
}
