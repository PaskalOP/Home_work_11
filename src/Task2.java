import java.util.List;
import java.util.stream.Collectors;


public class Task2 {
    public static void main(String[] args) {
        List<String> names = List.of("Tom","Max", "Jack", "Jerry", "Anna", "Emma");
        List<String> sorted = sortedList(names);
        for (String item: sorted ) {
            System.out.println(item);
        }
    }
    private static List<String> sortedList ( List<String> strings){
        return strings.stream()
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList())
                .reversed();

    }
}
