public class someMath {
    public static void main(String[] args) {
        System.out.println(total5(1,2,3,4,5));
        System.out.println(average5(1,3,5,7,9));
        System.out.println(largest5(42.0, 35.1, 2.3, 40.2, 15.6));
    }
    public static int total5(int num1, int num2, int num3, int num4, int num5){
        int sum = num1 + num2 + num3 + num4 + num5;
        return sum;
    }
    public static double average5(int num1, int num2, int num3, int num4, int num5){
        double sum = num1 + num2 + num3 + num4 + num5;
        return sum;
    }
    public static double largest5(double num1, double num2, double num3, double num4, double num5) {
        double larger = 0;
        if ((num1 > num2) && (num1 > num3) && (num1 > num4) && (num1 > num5)) {
            larger = num1;
        } else if ((num2 > num3) && (num2 > num4) && (num2 > num5) && (num2 > num1)) {
            larger = num2;
        } else if ((num3 > num4) && (num3 > num5) && (num3 > num2) && (num3 > num1)) {
            larger = num3;
        } else if ((num4 > num5) && (num4 > num3) && (num4 > num2) && (num4 > num1)) {
            larger = num4;
        } else if ((num5 > num4) && (num5 > num3) && (num5 > num2) && (num5 > num1)) {
            larger = num5;
        }
        return larger;
    }
}
