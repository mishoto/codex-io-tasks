import java.util.Map;

public class BoxWithColorBalls {
    static void printMinimumBallsPerColor(Map<String, Integer> box){
        box
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .limit(1)
                .forEach(System.out::println);
    }
}
