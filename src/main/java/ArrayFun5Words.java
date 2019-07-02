import java.util.Scanner;

public class ArrayFun5Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 favorite colors:");

        String colors[] = new String [5];

        for (int i = 0; i < 5; i++){
            colors[i]=scanner.nextLine();
        }
        for (int i = 0; i<5; i++){
            System.out.println("Your favorite color is: " + colors[i] + " ");
        }
    }
}
