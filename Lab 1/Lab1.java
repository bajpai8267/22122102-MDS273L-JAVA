import java.util.*;
class Lab1 {
    public static void main(String[] args){
        String Name;
        int Age;
        String Class;
        char Gender;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Name,Age,Class");
        Name = scan.nextLine();
        Age = Integer.parseInt(scan.nextLine());
        Class = scan.nextLine();
        System.out.println("Name :"+Name+"\nAge :"+Age+"\nClass :"+Class);
        System.out.println("Enter M/F:");
        Gender = scan.nextLine().charAt(0);
        if(Gender=='M'){
            System.out.println("Gender: Male");
        }else if (Gender=='F'){
            System.out.println("Gender : Female ");
           
