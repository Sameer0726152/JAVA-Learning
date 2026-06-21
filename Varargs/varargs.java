
public class varargs {

    public static void main(String[] args) {
        System.out.print(add(2, 4, 5, 7, 9));
    }

    static int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
