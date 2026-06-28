
public class telephone {

    public static void main(String[] args) {
        char[][] telephone = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'},
            {'*', '0', '#'}};
        for (char[] item : telephone) {
            for (char number : item) {
                System.out.print(" " + number + " ");
            }
            System.out.println("");
            System.out.println("");
        }
    }
}
