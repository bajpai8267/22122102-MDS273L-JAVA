import java.util.Scanner;
public class Lab2 {
  public static void main(String[] args) {
    // String input with the Java Scanner
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String str = scan.nextLine();
    System.out.println("Your name is: "+str);

  }
}