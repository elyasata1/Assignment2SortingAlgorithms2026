public class Shell implements SortingAlgorithm {

    public int[] sorty(int[] input) {
        int[] arr = copy(input);
        int n = arr.length;

        for (int gap = n / 2; gap > 0; gap = gap / 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;

                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j = j - gap;
                }
                arr[j] = temp;
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
