import java.util.*;

public class Harshad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        // calculate digit sum
        int sum = 0;
        int temp = x;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        // check harshad
        if (x % sum == 0) {
            System.out.println(x + " is a Harshad Number!");
            System.out.println("Sum of digits = " + sum);
        } else {
            System.out.println(x + " is NOT a Harshad Number!");
            System.out.println("Sum of digits = " + sum);
        }
    }
}