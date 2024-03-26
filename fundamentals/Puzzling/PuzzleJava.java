import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {
    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> randNum = new ArrayList<Integer>();
        Random randMachine = new Random();
        for (int i = 0; i < 10; i++) {
            int num = randMachine.nextInt(20);
            randNum.add(num);
        }
        return randNum;
    }

    public String getRandomLetter() {
        String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z" };
        Random randMachine = new Random();
        return alphabet[randMachine.nextInt(26)];
    }

    public String generatePassword() {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            password.append(getRandomLetter());
        }
        return password.toString();
    }

    public ArrayList<String> getNewPasswordSet(int num) {
        ArrayList<String> passwords = new ArrayList<String>();
        for (int i = 0; i < num; i++) {
            passwords.add(generatePassword());
        }
        return passwords;
    }

    public ArrayList<Object> shuffleArray(ArrayList<Object> array) {
        ArrayList<Object> shuffledArray = array;
        Random randMachine = new Random();
        for (int i = 0; i < 20; i++) {
            int index1 = randMachine.nextInt(array.size());
            int index2 = randMachine.nextInt(array.size());
            Object temp = shuffledArray.get(index1);
            shuffledArray.set(index1, shuffledArray.get(index2));
            shuffledArray.set(index2, temp);
        }
        return shuffledArray;
    }
}