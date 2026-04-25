import java.util.Arrays;

public class Experiment {

    private Sorter sorter = new Sorter();
    private Searcher searcher = new Searcher();

    public long measureSortTime(int[] arr, String type) {

        int[] copy = Arrays.copyOf(arr, arr.length);

        long start = System.nanoTime();

        if (type.equals("basic")) {
            sorter.basicSort(copy);
        } else {
            sorter.advancedSort(copy);
        }

        long end = System.nanoTime();

        return end - start;
    }

    public long measureSearchTime(int[] arr, int target) {

        long start = System.nanoTime();

        searcher.search(arr, target);

        long end = System.nanoTime();

        return end - start;
    }

    public void runAllExperiments() {

        int[] sizes = {10, 100, 1000};

        for (int size : sizes) {

            int[] randomArray = sorter.generateRandomArray(size);
            int[] sortedArray = Arrays.copyOf(randomArray, randomArray.length);
            Arrays.sort(sortedArray);

            System.out.println("==================================");
            System.out.println("Array Size: " + size);

            long bubbleRandom = measureSortTime(randomArray, "basic");
            long mergeRandom = measureSortTime(randomArray, "advanced");
            long searchRandom = measureSearchTime(randomArray, randomArray[size / 2]);

            System.out.println("Random Array:");
            System.out.println("Bubble Sort: " + bubbleRandom + " ns");
            System.out.println("Merge Sort: " + mergeRandom + " ns");
            System.out.println("Linear Search: " + searchRandom + " ns");

            long bubbleSorted = measureSortTime(sortedArray, "basic");
            long mergeSorted = measureSortTime(sortedArray, "advanced");
            long searchSorted = measureSearchTime(sortedArray, sortedArray[size / 2]);

            System.out.println();
            System.out.println("Sorted Array:");
            System.out.println("Bubble Sort: " + bubbleSorted + " ns");
            System.out.println("Merge Sort: " + mergeSorted + " ns");
            System.out.println("Linear Search: " + searchSorted + " ns");
            System.out.println();
        }
    }
}