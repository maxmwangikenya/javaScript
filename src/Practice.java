package src;

import java.util.Scanner;

public class Practice{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name");
        String name = scanner.nextLine();

        System.out.print("Enter your age");
        int age = scanner.nextInt();

        System.out.println("Hello" + name);
        System.out.println("you are"  + age + "yaers old");

        if(age >= 18 ){
            System.out.println("You are an adult");
        }
        else if(age <18 ){
            System.out.println("you are a child");
        }
    }
}