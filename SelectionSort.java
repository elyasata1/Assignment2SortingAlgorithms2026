public class SelectionSort implements SortingAlgorithm {

    public int[] sorty(int[] input) {
        int[] arr = copy(input);

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
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
