package shapes;

import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {

        System.out.print("Give me the size of the triangle: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size * 2; j++) {
                if (j < size - i) {
                    System.out.print(" ");
                } else if (j > size + i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}