import java.util.List;
import java.util.stream.Stream;

public class Task5 {
//    Напишіть метод public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) який "перемішує"
//    елементи зі стрімів first та second, зупиняючись тоді, коли уодного зі стрімів закінчаться елементи.
    public static void main(String[] args) {
        Stream<Integer> firstStream = Stream.of(5,56,23,46,6,-9,0,-34,1234);
        Stream<Integer> secondStream = Stream.of(25,546,213,4,63,-92,0,34,34,-400,-500);
        Stream<Integer> zipStream = zip(firstStream , secondStream );
        zipStream.forEach(System.out::println);
    }
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
       List<T> firstColl = first.toList();
       List<T> secondColl = second.toList();

        long count = Math.min(firstColl.size(), secondColl.size());
        return  Stream.concat( firstColl.stream().limit(count),secondColl.stream().limit(count)).sorted();

    }
}
