import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int position = 0;
        System.out.println("Single Player starts at position " + position);

        Random random = new Random();
        int dice = random.nextInt(6) + 1; // Random number between 1 and 6
        System.out.println("Player rolls the die: " + dice);

    }
}