import java.util.Random;

public class Tester {

    private SortingAlgorithm algorithm;
    private Random rand;

    public Tester(SortingAlgorithm sa) {
        algorithm = sa;
        rand = new Random();
    }

    public double singleTest(int size) {

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(10000);
        }

        long start = System.nanoTime();
        algorithm.sorty(arr);
        long end = System.nanoTime();

        return (end - start) / 1_000_000.0;
    }

    public double test(int iterations, int size) {

        double total = 0.0;

        for (int i = 0; i < iterations; i++) {
            total += singleTest(size);
        }

        double average = total / iterations;

        System.out.println(
                algorithm.getClass().getSimpleName() +
                        " sorted " + size +
                        " elements in " + average +
                        " ms (avg)"
        );
        return average;
    }
}
