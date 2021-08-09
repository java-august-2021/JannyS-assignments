import java.util.Random;
import java.util.ArrayList;

public class PuzzleTest{
    public static void main(String[] args){
        System.out.println(Puzzle.getTenrolls());
        System.out.println(Puzzle.getRandomLetter());
        System.out.println(Puzzle.generatePassword());
        ArrayList<String> newPassword = Puzzle.getNewPasswordSet(13);
        System.out.println(newPassword);
    }
}