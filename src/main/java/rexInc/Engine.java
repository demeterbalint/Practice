package rexInc;

import java.util.Scanner;

public class Engine {

    RexInc rexInc = new RexInc();

    public void go() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("Quit")) {
            String[] command = input.split(" \\| ");
            switch (command[0]) {
                case "RegisterAdoptionCenter":
                    rexInc.registerAdoptionCenter(command[1]);
                    break;
                case "RegisterDog":
                    rexInc.registerDog(command[1], Integer.parseInt(command[2]),Integer.parseInt(command[3]), command[4]);
                    break;
                case "RegisterCat":
                    rexInc.registerCat(command[1], Integer.parseInt(command[2]),Integer.parseInt(command[3]), command[4]);
                    break;
                case "SendForCleansing":
                    rexInc.sendForCleansing(command[1]);
                    break;
                case "Cleanse":
                    rexInc.cleanse();
                    break;
                case "Adopt":
                    rexInc.adopt(command[1]);
                    break;
            }
            input = scanner.nextLine();
        }
        rexInc.printStats();
        System.exit(0);
    }
}
