public class BasicJavaTest {
    public static void main(String[] args) {
        BasicJava Java = new BasicJava();
    
    Java.print255();

    Java.Odd255();

    System.out.println(Java.sigma255());

    int[] arr = {1,3,5,7,9,13};
    Java.iterateArr(arr);

    int[] arr1 = {-3, -5, -7};
    int[] arr2 = {0, -5, 9};
    System.out.println(Java.maxArr(arr));
    System.out.println(Java.maxArr(arr1));
    System.out.println(Java.maxArr(arr2));

    System.out.println(Java.arrOdd());
    }
}
