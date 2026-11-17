package ua.opnu;

import java.util.Arrays;
import java.util.List;

public class EasyTasks {

    public static void main(String[] args) {
        // Для виконання лабораторної роботи необхідно написати вміст методів згідно умовам завдання,
        // після чого протестувати метод за допомогою тестів, які знаходяться в папці
        // src\test\TaskTest.java
    }

    public List<Integer> doubling(List<Integer> nums) {
        return nums.stream()
                .map(number -> number * 2)
                .toList();
    }

    public List<Integer> square(List<Integer> nums) {
        return nums.stream()
                .map(number -> number * number)
                .toList();
    }

    public List<String> moreY(List<String> strings) {
        return strings.stream()
                .map(word -> "y" + word + "y")
                .toList();
    }

    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
                .filter(number -> number >= 0)
                .toList();
    }

    public List<Integer> no9(List<Integer> nums) {
        return nums.stream()
                .filter(number -> number % 10 != 9)
                .toList();
    }

    public List<String> noZ(List<String> strings) {
        return strings.stream()
                .filter(word -> !word.contains("z"))
                .toList();
    }

    public List<String> refinedStrings(List<String> strings) {
        return strings.stream()
                .distinct()
                .sorted((a, b) -> Integer.compare(b.length(), a.length()))
            .toList();
    }
    public List<String> flatten(List<String> strings) {
        return strings.stream()
                .flatMap(name -> Arrays.stream(name.split(" ")))
                .toList();

    }

}