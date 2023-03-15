// Create a java program that performs the following operation:
// The program should collect an integer array from the user
// After the array is entered, you need to create a menu of items

// Find the Mean Value
// Find the Median Value
// Find the Mode Value

// From the user-given array.
// The program should have a minimum of 3 functions apart from the main function; 
// each of the functions implements the Mean, Median, 
// and Mode computation by accepting the array user has entered as a parameter 
// and returning the value as a result. 
// From the main method, you will display the result.


import java.util.Arrays;
import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Collect an integer array from the user
        System.out.print("Enter the length of the array: ");
        int length = input.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < length; i++) {
            arr[i] = input.nextInt();
        }
        
        // Create a menu of items
        System.out.println("Menu:");
        System.out.println("1. Find the Mean Value");
        System.out.println("2. Find the Median Value");
        System.out.println("3. Find the Mode Value");
        System.out.print("Enter your choice (1-3): ");
        int choice = input.nextInt();
        
        switch (choice) {
            case 1:
                // Find the Mean Value
                double mean = computeMean(arr);
                System.out.printf("Mean: %.2f", mean);
                break;
            case 2:
                // Find the Median Value
                double median = computeMedian(arr);
                System.out.printf("Median: %.2f", median);
                break;
            case 3:
                // Find the Mode Value
                int mode = computeMode(arr);
                System.out.printf("Mode: %d", mode);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
    
    // Function to compute the Mean Value
    public static double computeMean(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
    
    // Function to compute the Median Value
    public static double computeMedian(int[] arr) {
        Arrays.sort(arr);
        if (arr.length % 2 == 0) {
            int mid = arr.length / 2;
            return (arr[mid - 1] + arr[mid]) / 2.0;
        } else {
            return arr[arr.length / 2];
        }
    }
    
    // Function to compute the Mode Value
    public static int computeMode(int[] arr) {
        int mode = arr[0];
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = arr[i];
            }
        }
        return mode;
    }
}