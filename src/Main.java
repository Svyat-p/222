import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in); // Объявляем объект класса Scanner для ввода данных
    public static PrintStream out = System.out; // Объявляем объект класса PrintStream для вывода данных
    public static void main(String[] args) {
        int x = in.nextInt(); // Вводим объем контейнера
        int a = in.nextInt(); // Вводим объем пакета А
        int b = in.nextInt(); // Вводим объем пакета B
        int c = in.nextInt(); // Вводим объем пакета C
        int counter = 0; // Создаем счетчик, который будет считать количество пакетов, которые не поместились
        if (x >= a) {
            // Проверяем, помещается ли пакет А в контейнер.
            // Если помещается, то вычитаем из переменной х(объем контейнера) объем пакета А и перезаписываем х, иначе прибавляем к счетчику единицу
            x -= a;
        }
        else {
            counter += 1;
        }
        if (x >= b) {
            // Проверяем, помещается ли пакет В в оставшееся в контейнере место(х).
            // Если помещается, то из переменной х вычитаем объем пакета В и перезаписываем х, иначе прибавляем к счетчику единицу
            x -= b;
        }
        else {
            counter +=1;
        }
        if (x < c) {
            // Проверяем, больше ли объем пакета С, чем оставшееся в контейнере место(х)
            // Если да, то прибавляем к счетчику единицу
            counter += 1;

        }
        out.print(counter); // Выводим итоговое количество пакетов, которые не поместились в контейнер
    }
}