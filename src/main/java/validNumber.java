import java.util.Scanner;

public class validNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10.");
        int input = scanner.nextInt();

        while (input < 1 || input > 10){
            System.out.println("You must enter a number between " +
                    "1 and 10, please try again.");
            input=scanner.nextInt();
        }
        System.out.println(input);

    }
}
