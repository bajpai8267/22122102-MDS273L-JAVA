import java.util.Arrays;
import java.util.Scanner;

public class Lab3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Collecting integer array from user
        System.out.print("Enter the length of the integer array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the integer elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Creating a menu of items
        int choice;
        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. Find the Mean Value");
            System.out.println("2. Find the Median Value");
            System.out.println("3. Find the Mode Value");
            System.out.println("4. Exit");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    double mean = findMean(arr);
                    System.out.printf("The mean value of the array is %.2f", mean);
                    break;
                case 2:
                    double median = findMedian(arr);
                    System.out.printf("The median value of the array is %.2f", median);
                    break;
                case 3:
                    int mode = findMode(arr);
                    System.out.println("The mode value of the array is " + mode);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid choice.");
            }

        } while (choice != 4);

        sc.close();
    }

    // Function to find the mean value of an array
    public static double findMean(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }

    // Function to find the median value of an array
    public static double findMedian(int[] arr) {
        Arrays.sort(arr);
        if (arr.length % 2 == 0) {
            int mid1 = arr[(arr.length / 2) - 1];
            int mid2 = arr[arr.length / 2];
            return (double) (mid1 + mid2) / 2;
        } else {
            return (double) arr[arr.length / 2];
        }
    }

    // Function to find the mode value of an array
    public static int findMode(int[] arr) {
        Arrays.sort(arr);
        int mode = arr[0];
        int maxCount = 1;
        int currentCount = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    mode = arr[i - 1];
                }
                currentCount = 1;
            }
        }
        if (currentCount > maxCount) {
            mode = arr[arr.length - 1];
        }
        return mode;
    }
}
