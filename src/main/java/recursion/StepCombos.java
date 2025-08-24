package recursion;

public class StepCombos {

    public static void main(String[] args) {
        int[] allowedSteps = {1, 2, 3};
        System.out.println(step(allowedSteps, 4));
    }

    private static int step(int[] steps, int top) {

        if (top == 0) {
            return 1;
        }

        if (top < 0) {
            return 0;
        }

        int combos = 0;

        for (int i = 0; i < steps.length; i++) {
            combos += step(steps, top - steps[i]);
        }
        return combos;
    }

}
