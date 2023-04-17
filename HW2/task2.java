package HW2;

public class task2 {
    public static void main(String[] args) {
        try {
            int[] intArray = {1,2,3,4,5};
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (Exception e) // выбран общий тип exeption, т.к. может быть ошибка деления на 0, или на пример отсутствия элемента с индексом 8 
        {
            System.out.println("Catching exception: " + e);
        }
    }
}
