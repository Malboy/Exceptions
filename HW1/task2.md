 3 Исключения:
 1) NullPointerException При передаче нулевого массива строк arr
 2) ArrayIndexOutOfBoundsException при прохождении цикла по j, ведь может размерность массива меньше чем 5.
 3) ClassCastException при попытке преобразовать *int val = Integer.parseInt(arr[i][j]);*  