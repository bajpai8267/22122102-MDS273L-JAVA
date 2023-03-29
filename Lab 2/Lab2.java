import java.util.*;
public class Lab2{
    public static void main(String[] args){
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the numbers you want in your array: ");
        n= scan.nextInt();
        int[] array = new int[100];
        System.out.println("Enter the numbers in array: ");
        for(int i=0; i<n; i++){
            array[i] = scan.nextInt();
        }
        System.out.println("numbers in the array are: ");
        for (int i=0; i<n; i++){
            System.out.println(array[i]);
            int length = array.length;
        int sum = 0;
        for (int  = 0; i < array.length; i++) {
            sum += array[i];
        }
 
        double average = sum / length;
         
        System.out.println("Average of array : "+average);
        }
    }
}
