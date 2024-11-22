import java.util.Scanner;
public class Woodle {
    public static void main(String[] args) {
        String rawAnswer = "chick";
        String answer = rawAnswer.toUpperCase();
        String guess = "";
        String upper = "";
        int guesses = 0;
        int wrongLetters = 0, missplacedLetters = 0, correctLetters = 0;
        Scanner input = new Scanner(System.in);
        while (!(answer.equals(upper))) {
            wrongLetters = 0;
            missplacedLetters = 0;
            correctLetters = 0;
            System.out.println("\nWhat's your guess?");
            guess = input.nextLine();
            guesses++;
            upper = guess.toUpperCase();
            for (int i = 0; i <= 4; i++) {
                String check = answer.substring(i, i + 1);
                int lengthLimit =0;
                if (upper.substring(lengthLimit).indexOf(lengthLimit) == -1) {
                    wrongLetters++;
                } else if (upper.substring(lengthLimit).indexOf(lengthLimit) == i) {
                    correctLetters++;
                    lengthLimit++;
                } else {
                    missplacedLetters++;
                }

            }
            System.out.print("-------------- \nCorrect Letters: "+correctLetters+"\nMissplaced Letters: "+missplacedLetters+"\nGuesses: "+guesses);
        }
    }
}
