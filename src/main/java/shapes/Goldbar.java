package shapes;

import java.util.Scanner;

public class Goldbar {

    public static void main(String[] args) {

        System.out.print("Give me the size of the goldbar: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 && j == 1 || i == size && j == size) {
                    System.out.print("/");
                } else if (i == 1 && j == size || i == size && j == 1) {
                    System.out.print("\\");
                } else if (i == 1 || i == size) {
                    System.out.print("-");
                } else if (j == 1 || j == size) {
                    System.out.print("|");
                } else  {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
