import java.util.*;
import java.awt.*;

public class Lab1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Name,\nEnter your Age, \nGender, \nEnter your Course: ");
        String Name = obj.nextLine();
        int Age = Integer.parseInt(obj.nextLine());
        char Gender = obj.nextLine().charAt(0);
        String Course = obj.nextLine();
        if (Gender == 'm'){
            System.out.println("Male");
        }else if (Gender == 'f'){
            System.out.println("Female");
        }else {
            System.out.println("Can not recognise");
        }
        String Location = obj.nextLine();
     setLayout(new BorderLayout());
     add(new Button("North"), BorderLayout.NORTH);
     add(new Button("South"), BorderLayout.SOUTH);
     add(new Button("East"), BorderLayout.EAST);
     add(new Button("West"), BorderLayout.WEST);
     add(new Button("Center"), BorderLayout.CENTER);
   }

    private static void add(Button button, String north) {
    }

    private static void setLayout(BorderLayout borderLayout) {
    }
 }
        System.out.println("Name: "+Name+"\nAge: "+Age+"\nGender: "+Gender+"\nCourse: "+Course+"\nLocation: "+Location);
    
