package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.testPackage.TextReader;
import java.util.function.Consumer;
import java.util.stream.Stream;

class Juice {
    public enum JuiceSize { SMALL, MEDIUM, LARGE};
    JuiceSize size;
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void workingWithArrays() {
        ArrayList<Integer> numbersToAdd = new ArrayList<>() {
            {
                add(1);
                add(2);
            }
        };

        ArrayList<Integer> numbers = new ArrayList<Integer>() {
            {
                addAll(numbersToAdd);
            }
        };

        Consumer<Integer> isOdd = (Integer n) -> {
            boolean numberOdd = n % 2 != 0;
            System.out.printf("%d is odd: %s%n", n, numberOdd);
        };

        numbers.forEach(isOdd);

    }

    public static void workingWithDates() {
        LocalDate date = LocalDate.now();

        System.out.println(date.getDayOfWeek());

        Locale nlLocale = new Locale("nl", "NL");

        DateTimeFormatter nlFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).localizedBy(nlLocale);

        String localizedNLDate = date.format(nlFormatter);

        System.out.println(localizedNLDate);
    }

    public static void workingWithLoops() {}

    public static void workingWithPackages() {
        // Created a new class inside same package. imported it and using it here
        TestClass testClass = new TestClass("Hello", 10);

        int fetchedInt = testClass.getTestInt();
        String fetchedString = testClass.getTestString();

        testClass.setTestInt(20);
        testClass.setTestString("Bye");

        int newInt = testClass.getTestInt();
        String newString = testClass.getTestString();

        System.out.println(fetchedInt);
        System.out.println(fetchedString);
        System.out.println(newInt);
        System.out.println(newString);
    }
    public static void workingWithFilesAndApis() {

        TextReader test = new TextReader("src/main/resources/test");

        try {
            List<String> textLines = test.getLines();
            textLines.forEach(System.out::println);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void workingWithStreams() {
        String[] numbers = {"test", "hello"};
        Stream<String> numberStream = Arrays.stream(numbers);
        numberStream.forEach(System.out::println);
    }

    //TIP TODO: READ INPUT FROM TERMINAL AND EXECUTE METHOD ACCORDINGLY.
    // SAVE FUNCTIONS INSIDE ARRAY
    // AND ACCESS ARRAY BASED ON KEY WHICH IS DERIVED FROM TERMINAL INPUT
    public static void main(String[] args) {

//        workingWithArrays();

//        workingWithDates();

//        workingWithLoops();

//        workingWithPackages();

//        workingWithFilesAndApis();

//        workingWithStreams();


    }
}