import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       // System.out.println("Hello world!");
        arrInt();
        middleEl();
        stringArr();
        intArray();
         intArray2();


    }

    public static void arrInt(){
        int[] arr = {1,2,3};
        int[] copyArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            copyArr[i] = arr[i];
        }
        System.out.println(Arrays.toString(copyArr));
    }

    public static void middleEl(){
       int[] arr2 = {13, 5, 7, 68, 2};
        int[] copyArr2 = new int[]{arr2.length / 2};
       for(int i = 0; i < copyArr2.length; i++){
          System.out.println(copyArr2[copyArr2.length-1]);
      }

    }

    public static void stringArr(){
        String[] colors = new String[] {"red", "green", "blue", "yellow"};
        String[] n2 = colors.clone();
        System.out.println(colors.length);
        System.out.println(Arrays.toString((n2)));
    }

    public static void intArray(){
        int[] nums = new int[] {1, 2, 3, 4, 5};
        System.out.println(nums[0]);
        System.out.println(nums[nums.length-1]);
    }

    public static void intArray2(){
        int[] numbers = new int[5];
        Arrays.sort(numbers);
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i;
            System.out.println(i + " is found at index " + Arrays.binarySearch(numbers, i));
        }
    }
}