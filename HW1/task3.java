package HW1;
import java.util.Scanner;
import java.util.Random;


public class task3 {
    public static void main(String[] args){
        
        Scanner console = new Scanner(System.in);
        System.out.print("Введите длину первого массива: ");
        int len1 = console.nextInt();
        System.out.print("Введите длину второго массива: ");
        int len2 = console.nextInt();
        console.close();
        int[] mass1 = fillArray(len1);
        int[] mass2 = fillArray(len2);

        int[] resultArray = divArrays(mass1, mass2);

        PrintArray(mass1);
        PrintArray(mass2);
        PrintArray(resultArray);
    }
    public static int[] fillArray(int len){
        int[] Array = new int[len];
        Random rnd = new Random();
        for (int i = 0; i < len; i++) {
            Array[i] = rnd.nextInt(10);
        }
        return Array;
    }

    public static void PrintArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]  + " ");
        }
        System.out.println();
    }

    public static int[] divArrays(int[] firstArray, int[] secondArray) {
        if(firstArray.length != secondArray.length) throw new RuntimeException("Длины массивов не равны!!!");
        int[] resultArr = new int[firstArray.length];
        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = firstArray[i] - secondArray[i];
        }
        return resultArr;
    }
}
