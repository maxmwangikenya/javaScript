import java.util.Scanner;

public class AgeChecker{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age");
        int age = scanner.nextInt();

        if(age>=21){
            System.out.println("you are an adult");
        } else {
            System.out.println("you are a minor");
        }
        scanner.close();
    }
}
