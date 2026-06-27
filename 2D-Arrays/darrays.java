
public class darrays {

    public static void main(String[] args) {
        String[] fruits = {"mango", "banana", "apple"};
        String[] vegetables = {"Potato", "Tomato", "celery"};
        String[] meat = {"beef", "eggs", "fish"};
        String[][] groceries = {fruits, vegetables, meat};

        groceries[1][2] = "Brocolli";

        for (String[] item : groceries) {
            for (String food : item) {
                System.out.print(food + " ");
            }
            System.out.println("");
        }
    }
}
