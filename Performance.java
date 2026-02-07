public class Performance {
    public static void main(String[] args) {
        SortingAlgorithm[] algorithms = {
                new Insertion(), new Bubble(), new SelectionSort(),
                new Shell(), new Quick(), new Merge()
        };

        int[] testSizes = {100, 500, 1000, 2000, 5000, 10000, 20000, 75000, 150000};

        for (SortingAlgorithm algorithm : algorithms) {
            Tester tester = new Tester(algorithm);
            System.out.println("Testing: " + algorithm.getClass().getSimpleName());
            for (int size : testSizes) {
                tester.test(20, size); // Run each size 20 times
            }
            System.out.println();
        }
    }
}