package shapes;

import java.util.Scanner;

public class RectangleInRectangle {

    public static void main(String[] args) {

        System.out.print("Give me the size of the big rectangle: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        if (size % 2 != 0) {
            for (int i = 1; i <= size; i++) {
                for (int j = 1; j <= size; j++) {
                    if (i > size / 3 && i <= size / 3 * 2 && j > size / 3 && j <= size / 3 * 2) {
                        System.out.print("x");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        } else {
            for (int i = 1; i <= size; i++) {
                for (int j = 1; j <= size; j++) {
                    if (i > size / 4 && i <= size / 4 * 3 && j > size / 4 && j <= size / 4 * 3) {
                        System.out.print("x");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
    }
}
