import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> names = List.of("Tom","Max", "Jack", "Jerry", "Anna", "Emma");
        System.out.println(getOddNames(names));
    }
    private static String getOddNames (List<String> data ){
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i<data.size();i+=2){
            sb.append(i + ". " + data.get(i) + ", ");
        }
        return sb.toString();
    }
}
