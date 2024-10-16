import java.util.*;
import java.util.stream.Collectors;

public class ListOperations {

    // Метод для фильтрации строк длиной более 3 символов
    public List<String> filterStringsMoreThanThreeChars(List<String> strings) {
        return strings.stream()
                .filter(s -> s.length() > 3)
                .collect(Collectors.toList());
    }

    // Метод для фильтрации нечетных чисел
    public List<Integer> filterOddNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
    }

    // Метод для удаления дубликатов
    public List<String> removeDuplicates(List<String> strings) {
        return strings.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    // Метод для конкатенации всех строк в одну строку
    public String concatenateStrings(List<String> strings) {
        return String.join("", strings);
    }

    // Метод для нахождения суммы чисел
    public int sumOfNumbers(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    // Метод для нахождения максимального числа
    public int findMaxValue(List<Integer> numbers) {
        return numbers.stream()
                .max(Integer::compareTo)
                .orElseThrow(NoSuchElementException::new);
    }

    // Метод для нахождения максимальной длины строки
    public int findMaxLengthOfString(List<String> strings) {
        return strings.stream()
                .mapToInt(String::length)
                .max()
                .orElse(0);
    }

    // Метод для объединения двух списков
    public List<String> mergeLists(List<String> list1, List<String> list2) {
        List<String> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        return mergedList;
    }

    // Пример использования методов
    public static void main(String[] args) {
        ListOperations listOps = new ListOperations();

        List<String> stringList = Arrays.asList("apple", "dog", "banana", "cat");
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Используем метод фильтрации строк
        System.out.println("Strings more than 3 chars: " + listOps.filterStringsMoreThanThreeChars(stringList));

        // Используем метод фильтрации нечетных чисел
        System.out.println("Odd numbers: " + listOps.filterOddNumbers(intList));

        // Пример удаления дубликатов
        List<String> stringListWithDuplicates = Arrays.asList("apple", "apple", "banana", "dog");
        System.out.println("Without duplicates: " + listOps.removeDuplicates(stringListWithDuplicates));

        // Пример конкатенации строк
        System.out.println("Concatenated strings: " + listOps.concatenateStrings(stringList));

        // Пример суммы чисел
        System.out.println("Sum of numbers: " + listOps.sumOfNumbers(intList));

        // Пример нахождения максимального числа
        System.out.println("Max value: " + listOps.findMaxValue(intList));

        // Пример нахождения максимальной длины строки
        System.out.println("Max string length: " + listOps.findMaxLengthOfString(stringList));

        // Пример объединения двух списков
        List<String> anotherStringList = Arrays.asList("elephant", "fox");
        System.out.println("Merged list: " + listOps.mergeLists(stringList, anotherStringList));
    }
}
