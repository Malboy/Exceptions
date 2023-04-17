package HW2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {
    public static void main(String[] args) {
        boolean flag = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(flag){
            System.out.print("Введите дробное число: ");
            try{
                float userNum = Float.parseFloat(reader.readLine());
                System.out.printf("Введенно число %f\n", userNum);
                flag = false;
            } catch (IOException|NumberFormatException e) {
                System.out.println("Ошибка!!! Введите число.");
            }

        }
    }
}
