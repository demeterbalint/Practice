package shapes;

import java.util.Scanner;

public class TriangleUpsideDownRight {

    public static void main(String[] args) {

        System.out.print("Give me the size of the triangle: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
