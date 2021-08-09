import java.util.Random;
import java.util.ArrayList;

public class Puzzle{
    public static ArrayList<Integer>getTenrolls(){
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        Random num = new Random();

        for (int i=1; i<=10; i++){
            newArr.add(num.nextInt(20)+1);
        }
        return newArr;
    }

    public static String getRandomLetter() {
        Random num = new Random();

        String alphaString = "abcdefghijklmnopqrstuvwxyz";
        String[] alpha = new String[26];
        for (int i=0; i<26; i++){
            alpha[i] = String.valueOf(alphaString.charAt(i));
        }
        return alpha[num.nextInt(26)];
    }

    public static String generatePassword(){
        String password = "";
        for(int i=0; i<8; i++){
            password = password + getRandomLetter();
        }
        return password;
    }

    public static ArrayList<String> getNewPasswordSet(int length){
        ArrayList<String> passwordSet = new ArrayList<String>();
        for(int i=0; i<length; i++){
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }
}