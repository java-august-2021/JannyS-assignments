import java.util.Arrays;
import java.util.ArrayList;


public class BasicJava {

    public void print255() {
        for(int i = 1; i <= 255; i++) {
            System.out.println(i);
        }
    }

    public void Odd255() {
        for(int i = 1; i  <= 255; i+=2) {
            System.out.println(i);
        }
    }

    public int sigma255() {
        int sum = 0;
        for(int i = 1; i  <= 255; i++) {
            sum+= i;
        }
        return sum;
    }

    public void iterateArr(int[] arr){
        for(int i = 0; i  < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public int maxArr(int[] arr){
        int max = arr[0];
        for(int i = 0; i  <= arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public ArrayList arrOdd(){
        ArrayList<Integer> odds = new ArrayList<Integer>();
        for (int i = 1; i  <= 255; i += 2) {
            odds.add(i);
        }
        return odds;
    }
}
