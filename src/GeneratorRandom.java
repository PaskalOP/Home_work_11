import java.util.stream.Stream;

public class GeneratorRandom {
    public static void main(String[] args) {
        GeneratorRandom gen = new GeneratorRandom();
        Stream<Long> streamRandomNums = gen.streamRandomNums(25214903917l,11,2^48,10);
        streamRandomNums.forEach(System.out::println);
        System.out.println();
        gen.setX(5);
        streamRandomNums = gen.streamRandomNums(25214903917l,11,2^48,10);
        streamRandomNums.forEach(System.out::println);
    }
    private long x;
    public GeneratorRandom() {
        this.x = 0;
    }
    public void setX(long x) {
        this.x = x;
    }
    public Stream<Long> streamRandomNums (long a, long c, long m, int count){
        return  Stream.iterate (x,x ->(a*(x+1) + c)%m).limit(count);
    }

}
