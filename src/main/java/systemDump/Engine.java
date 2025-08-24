package systemDump;

import systemDump.hardware.HardwareType;
import systemDump.software.SoftwareType;

import java.util.Scanner;

public class Engine {

    public void go() {
        SystemDump sd = new SystemDump();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        while (!input.equals("Dump()")) {
            String[] command = input.split("\\(");
            String[] parts = new String[]{};
            if (command[1].length() > 1) {
                parts = command[1].substring(0, command[1].length() - 1).split(", ");
            }
            switch (command[0]) {
                case "RegisterPowerHardware":
                    sd.registerHardware(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), HardwareType.POWER);
                    break;
                case "RegisterHeavyHardware":
                    sd.registerHardware(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), HardwareType.HEAVY);
                    break;
                case "RegisterExpressSoftware":
                    try {
                        sd.registerSoftware(parts[0], parts[1], Integer.parseInt(parts[2]), Integer.parseInt(parts[3]), SoftwareType.EXPRESS);
                    } catch (NullPointerException ignored) {};
                    break;
                case "RegisterLightSoftware":
                    try {
                        sd.registerSoftware(parts[0], parts[1], Integer.parseInt(parts[2]), Integer.parseInt(parts[3]), SoftwareType.LIGHT);
                    } catch (NullPointerException ignored) {};
                    break;
                case "ReleaseSoftwareComponent":
                    sd.releaseSoftware(parts[0], parts[1]);
                    break;
                case "Analyze":
                    sd.analyze();
                    break;
            }
            input = sc.nextLine();
        }
        sd.dump();
        System.exit(0);
    }
}
