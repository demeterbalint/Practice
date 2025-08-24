package settlers;

import java.util.Scanner;

public class Engine {

    Settlers settlers = new Settlers();

    public void go() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("quit")) {
            String[] command = input.split(" ");
            switch (command[0]) {
                case "build":
                    settlers.advance();
                    settlers.build(command[1]);
                    break;
                case "skip":
                    settlers.advance();
                    break;
                case "status":
                    settlers.printStatus();
                    settlers.advance();
                    break;
                default:
                    System.out.println("Invalid command");
            }
            input = scanner.nextLine();
        }
        System.exit(0);
    }
}
