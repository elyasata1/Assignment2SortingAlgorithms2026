public class Quick implements SortingAlgorithm {

    public int[] sorty(int[] input) {
        int[] arr = copy(input);
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    private void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pIndex = partition(arr, left, right);
            quickSort(arr, left, pIndex - 1);
            quickSort(arr, pIndex + 1, right);
        }
    }

    private int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        int i = left + 1;

        for (int j = left + 1; j <= right; j++) {
            if (arr[j] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }

        int temp = arr[left];
        arr[left] = arr[i - 1];
        arr[i - 1] = temp;

        return i - 1;
    }

    private int[] copy(int[] input) {
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = input[i];
        }
        return arr;
    }
}
