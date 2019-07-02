import java.util.Scanner;

public class ArrayFunUserArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 5 numbers:");

        int arrNums[] = new int [5];

        for (int i = 0; i < 5; i++){
            arrNums[i]=scanner.nextInt();
        }
        for (int i = 0; i<5; i++){
            System.out.println("Your array is: " + arrNums[i]);
        }
    }
}
