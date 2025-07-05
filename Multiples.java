public class Multiples {
    public static void main(String[] args) {
        System.out.println("Numbers from 1 to 20");

        for (int i = 1; i <= 20; i++) {
            if (i % 3 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}