import java.util.Scanner;

public class Methods{
    public static double calculateTotalWaste(double waste1, double waste2) {
        return waste1 + waste2;
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter waste 1: ");
            double w1 = input.nextDouble();

            System.out.print("Enter waste 2: ");
            double w2 = input.nextDouble();

            double total = calculateTotalWaste(w1, w2);

            System.out.println("Total waste: " + total);
        }
    }
}
