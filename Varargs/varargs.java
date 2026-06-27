
public class varargs {

    public static void main(String[] args) {
        System.out.println(add(2, 4, 5, 7, 9));
        System.out.println(average(1, 3, 5, 7, 9));
    }

    static int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    static double average(double... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
}
