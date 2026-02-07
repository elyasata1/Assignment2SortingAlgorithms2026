public class Bubble implements SortingAlgorithm {

    public int[] sorty(int[] input) {
        int[] arr = copy(input);

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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
