import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int position = 0;
        System.out.println("Single Player starts at position " + position);

        Random random = new Random();
        int dice = random.nextInt(6) + 1;// Random number between 1 and 6
        int option = random.nextInt(3); // 0 = No Play, 1 = Ladder, 2 = Snake
        System.out.println("Player rolls the die: " + dice);

        switch(option){

            case 0:
                System.out.println("No Play! Stay at position " + position);
                break;
            case 1:
                position += dice;
                System.out.println("Ladder! Move to position " + position);
                break;
            case 2:
                position -= dice;
                if (position < 0) position = 0;
                System.out.println("Snake! Move to position " + position);
                break;
        }

    }
}