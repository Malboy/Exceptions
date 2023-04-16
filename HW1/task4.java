package HW1;
import java.util.Random;

public class task4 {
    public static void main(String[] args) {
        int[] firstArray = getFilledArray(5);
        int[] secondArray = getFilledArray(5);

        int[] divArray = divArrays(firstArray, secondArray);
        printArray(firstArray);
        printArray(secondArray);
        printArray(divArray);

        int[] badArray = divArrays(null, secondArray);
    }

    public static int[] divArrays(int[] firstArray, int[] secondArray) {
        if (firstArray == null || secondArray == null) throw new RuntimeException("Нет массивов!!!");
        if(firstArray.length != secondArray.length) throw new RuntimeException("Длины массивов не равны!!!");


        int[] resultArr = new int[firstArray.length];
        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = firstArray[i]/secondArray[i];
        }
        return resultArr;
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static int[] getFilledArray(int length){
        int[] array = new int[length];
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = rnd.nextInt(getRandomNumber(20,50));
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int number: array){
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
