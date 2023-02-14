package org.example;

import com.github.javafaker.Faker;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        multipleOfThree();
//        squareOfTheNumberOfAllNumbers();
//        squareOfTheNumberMultipleOfFive();
//        outputNameAndId();
        Faker faker = new Faker();
        String name = faker.name().firstName();
        String lastname = faker.name().lastName();
        String patronymic = faker.name().lastName();
        System.out.println(name + " " + lastname + " " + patronymic);

    }

    public static void multipleOfThree() {
        List<Integer> values = new ArrayList<>();
        Collections.addAll(values, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        List<Integer> multipleOfThreeValues = values.stream()
                .filter(i -> i % 3 == 0)
                .collect(Collectors.toList());
        System.out.println("Числа кратные трем: " + multipleOfThreeValues);
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

//        List<Integer> list = Arrays.asList(array);
        List<Integer> sortedList = Arrays.asList(array).stream()
                .filter(i -> i % 5 == 0)
                .map(i -> i * i)
                .collect(Collectors.toList());
        System.out.println("Квадраты чисел, которые кратны 5: " + sortedList);
    }

//    public static void outputNameAndId() {
//
//        /*
//        Найти рандомайзер для инициаизации ФИО + апиху для прикручивания
//        Можно заюзать Rest Assured + Jackson
//         */
//
//        String[][] human = new String[10][10];
//        Faker faker = new Faker();
//
//        for(int i = 0; i < 10; i++) {
//            for(int j = 0; j < 10; j++) {
//                String name = faker.name().name();
//                String lastName = faker.name().lastName();
//                human[i] = name;
//                human[j] = lastName;
//                System.out.println(human[i][j]);
//            }
//        }
//        human[0] = new Human(5, "Ivan", "Ivanov","Ivanovich");
//        human[1] = new Human(11, "Aleksey", "Andreev", "Andreevich");
//        human[2] = new Human(12, "Anton", "Krivosheev", "Andreevich");
//        human[3] = new Human(13, "Aleksandr", "Babushkin", "Andreevich");
//        human[4] = new Human(14, "Tom", "Cruze", "Antonovich");
//        human[5] = new Human(20, "Timofei", "Nevskiy", "Alekseevich");
//        human[6] = new Human(30, "Leo", "DaVinchi", "Mihailovich");
//        human[7] = new Human(7, "Andrei", "Egorov", "Andreevich");
//        human[8] = new Human(19, "Vladimir", "Putin", "Vladimirovich");
//        human[9] = new Human(25, "Bill", "Murrey", "Yaroslavskiy");

//        Stream<Human> stream = Arrays.stream(human);
//        stream.filter(id -> id.getId() % 2 == 0).map(x -> x.getLastname()).forEach(x -> System.out.println("Id which even numbers: " + x));
//
//        Stream<Human> stream1 = Arrays.stream(human);
//        stream1.filter(id -> id.getId() % 5 == 0).map(Human::getLastname).forEach(x -> System.out.println("Id which multiple of five: " + x));
//
//        Stream<Human> stream2 = Arrays.stream(human);
//        stream2.filter(name -> name.getName().length() <= 5).map(Human::getLastname).forEach(x -> System.out.println("Name which contains <= 5 symbols: " + x));
    }


