import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задача 1. Меняем местами 2 элемента массива
        Integer[] arrInt = {1, 2, 3, 4};
        String[] arrStr = {"Один", "Два", "Три", "Четыре"};

        switchMetod(arrInt, 0, 2);
        switchMetod(arrStr, 1, 3);

        // Задача 2. Преобразуем массив в ArrayList
        conversionToList(arrInt);

        // Задача 3. Коробки с фруктами
        Box<Apple> appleBox1 = new Box<>(); // Создал коробку с яблоками
        appleBox1.addFruit(new Apple(), 10); // Закинул 10 яблок в коробку

        Box<Orange> orangeBox1 = new Box<>(); // Создал коробку с апельсинами
        orangeBox1.addFruit(new Orange(), 15); // Закунул 15 апельсинов в коробку

        System.out.println(appleBox1.getWeight()); // Смотрим вес яблок
        System.out.println(orangeBox1.getWeight()); // Смотрим вес апельсинов

        System.out.println(appleBox1.compare(orangeBox1)); // Сравниваем вес яблок и апельсинов

        Box<Apple> appleBox2 = new Box<>(); // Создаем еще одну коробку с яблоками
        appleBox2.addFruit(new Apple(), 20); // Закидываем туда 20 яблок

        appleBox1.pourOver(appleBox2); // Пересыпаем яблоки из первой коробки во вторую
        System.out.println(appleBox1.getWeight()); // Смотрим что осталось в первой коробке
        System.out.println(appleBox2.getWeight()); // Смотрим что получилось во второй коробке
    }

    // Метод для задачи 1.
    public static void switchMetod(Object[] arr, int i, int j) {
        System.out.println("Было :" + Arrays.toString(arr));
        Object switchObject = arr[i];
        arr[i] = arr[j];
        arr[j] = switchObject;
        System.out.println("Стало :" + Arrays.toString(arr));
        System.out.println(" ");
    }

    // Метод для задачи 2.
    public static <T> void conversionToList(T[] arr) {
        ArrayList<T> arl = new ArrayList<>(Arrays.asList(arr));
        System.out.println(arl);
        System.out.println(" ");
    }
}
