package HW1;

public class task1 {


    public static void main(String[] args){
        String[] strArray = {"one", null, "three"};
        int[] array = {0,8,5,1,12};
        div(10, 0);
        printTextArray(strArray);
        printValueByIndex(array,3);
    }

    public static void div(double digit1, double digit2){
        if(digit2 ==  0) throw new ArithmeticException("На ноль делить запрещено");
        double result = digit1/digit2;
        System.out.printf("При делении %f на %f получается %f.\n", digit1, digit2, result);
    }


    public static void printTextArray(String[] textArray){
        for (String item: textArray){
            if(item == null) throw new NullPointerException("Нет такого элемента");
            System.out.println(item);
        }
    }

    public static void printValueByIndex(int[] array, int index){
        if(index > array.length-1) throw new ArrayIndexOutOfBoundsException("Элемента с таким индексом не существует");
        else System.out.printf("Элемент с индексом %d: %d.\n",index, array[index]);
    }
}