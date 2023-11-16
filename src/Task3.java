
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
    public static void main(String[] args) {

        Stream<String> stringNum = Stream.of("1, 2, 0", "4, 5");
        String res = stringNum.
                flatMap(s -> Stream.of(s
                        .replace(" ","")
                        .split(",")))
                .sorted()
                .collect(Collectors.joining(", "));

        System.out.println(res);

    }
}
