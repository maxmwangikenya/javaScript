package src;
import java.util.Scanner;

public class Input {
    public static void main (String[] args){
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name = Scanner.nextLine();

        System.out.print("Enter your age:");
        int age = Scanner.nextInt();

        System.out.println("Hello" + name);
        System.out.println("your are"+ age + "years old");

        if(age >= 18) {
            System.out.println("you are an adult");
        } else {
            System.out.println("You are a minor");
        }

        Scanner.close();
    }
}