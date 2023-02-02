package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        multipleOfThree();
        squareOfTheNumberOfAllNumbers();
        squareOfTheNumberMultipleOfFive();
    }

    public static void multipleOfThree() {
        List<Integer> values = new ArrayList<>();
        Collections.addAll(values, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        values.stream().filter(i -> i % 3 == 0).forEach(System.out::println);
    }

    public static void squareOfTheNumberOfAllNumbers() {
        List<Integer> intList = new Random().ints(100, 0, 99)
                .map(i -> i * i)
                .boxed().collect(Collectors.toList());
        System.out.println("Квадраты ста рандомных чисел " + intList);
    }

    public static void squareOfTheNumberMultipleOfFive() {
        int size = 20;
        int upperBound = 20;
        Integer[] array = new Integer[size];

        Random random = new Random();
        IntStream.range(0, size).forEach(index -> array[index] = random.nextInt(upperBound));

        List<Integer> list = Arrays.asList(array);
        list.stream().filter(i -> i % 5 == 0).map(i -> i * i).forEach(System.out::println);
    }
}
