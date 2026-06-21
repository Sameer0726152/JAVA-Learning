
import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        int size;
        String[] foods;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of products you want: ");
        size = sc.nextInt();
        sc.nextLine();
        foods = new String[size];

        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter product no. " + (i + 1) + ": ");
            foods[i] = sc.nextLine();
        }
        System.out.println("Food items are: ");
        for (int i = 0; i < foods.length; i++) {
            if (i != foods.length - 1) {
                System.out.print(foods[i] + ", ");
            } else {
                System.out.print(foods[i]);
            }

        }
    }
}
