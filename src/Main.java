import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int position = 0;
        final int WINNING_POSITION = 100;
        int diceRolls = 0;
        int[] positions = {0, 0}; // Positions for Player 1 and Player 2
        int currentPlayer = 0; //

        System.out.println("Starting game...");
        System.out.println("Single Player starts at position " + position);

        Random random = new Random();
        System.out.println("Starting Snake and Ladder game for 2 players...");

        while (positions[0] < WINNING_POSITION && positions[1] < WINNING_POSITION ) {

            int dice = random.nextInt(6) + 1;// Random number between 1 and 6
            System.out.println("player " + (currentPlayer + 1) + " rolled a " + dice);

            if (positions[currentPlayer] + dice <= WINNING_POSITION) {
                positions[currentPlayer] += dice;
                System.out.println("Player " + (currentPlayer + 1) + " is now at position " + positions[currentPlayer]);

            }
            if(positions[currentPlayer] == WINNING_POSITION) {
                System.out.println("Player " + (currentPlayer + 1) + " wins!");
                break;
            }
            currentPlayer = 1 - currentPlayer;

        System.out.println("Player wins the game at position " + position + "!");
            System.out.println("Player rolls the die: " + dice);
            int option = random.nextInt(3); // 0 = No Play, 1 = Ladder, 2 = Snake
            switch (option) {

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
        System.out.println("Player wins the game after " + diceRolls + " rolls!");
        System.out.println("Player wins the game at position " + WINNING_POSITION + "!");



       }
    }