import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class TestPuzzle {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();
        // ArrayList<Integer> randomRolls = generator.getTenRolls();
        // System.out.println(randomRolls);

        // // ..
        // // Write your other test cases here.
        // System.out.println(generator.getRandomLetter());
        // // ..
        // System.out.println(generator.generatePassword());

        // System.out.println(generator.getNewPasswordSet(6));

        ArrayList myArray = new ArrayList<Objects>();
        myArray = generator.getNewPasswordSet(6);
        System.out.println(myArray);
        System.out.println(generator.shuffleArray(myArray));
    }
}
